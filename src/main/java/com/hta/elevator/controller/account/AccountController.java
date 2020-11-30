package com.hta.elevator.controller.account;


import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.hta.elevator.common.bean.Code;
import com.hta.elevator.common.bean.Response;
import com.hta.elevator.common.domain.Log;
import com.hta.elevator.controller.account.params.UserParams;
import com.hta.elevator.controller.account.params.WeChatLogin;
import com.hta.elevator.domain.AuthUser;
import com.hta.elevator.mapper.AuthUserMapper;
import com.hta.elevator.service.AccountService;
import com.hta.elevator.support.factory.LogTaskFactory;
import com.hta.elevator.support.manager.LogExeManager;
import com.hta.elevator.utils.CommonUtil;
import com.hta.elevator.utils.IpUtil;
import com.hta.elevator.utils.JsonWebTokenUtil;
import com.hta.elevator.utils.Md5Util;

import io.jsonwebtoken.SignatureAlgorithm;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * post新增,get读取,put完整更新,patch部分更新,delete删除
 *
 * @author tomsun28
 * @date 14:40 2018/3/8
 */
@RestController
@RequestMapping("/api/oauth")
@Api(tags = "用户登录注册")
public class AccountController{

    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
    @Autowired
    private AccountService accountService;
    
    @Autowired
    private AuthUserMapper authUserMapper;
    
    @Value("${hta.enableEncryptPassword}")
    private boolean isEncryptPassword;
    /**
     * description 登录签发 JWT ,这里已经在 passwordFilter 进行了登录认证
     *
     * @param request  1
     * @param response 2
     * @return 
     */
    @ApiOperation(value = "用户登录", notes = "POST用户登录签发JWT")
    @PostMapping("/auth")
    @ResponseBody
    public Response accountLogin(UserParams params, HttpServletRequest request, HttpServletResponse response) {
    	  AuthUser authUser = authUserMapper.selectByName(params.getUsername());
          authUser.setPassword(null);
          authUser.setSalt(null);
          // 根据appId获取其对应所拥有的角色(这里设计为角色对应资源，没有权限对应资源)
          String roles = accountService.loadAccountRoleByUsername(params.getUsername());
          // 时间以秒计算,token有效刷新时间是token有效过期时间的2倍
          Integer refreshPeriodTime = 36000;
          String jwt = JsonWebTokenUtil.issueJWT(UUID.randomUUID().toString(), params.getUsername(),
                  "token-server", refreshPeriodTime >> 1, roles, null, SignatureAlgorithm.HS512);
          // 将签发的JWT存储到Redis： {JWT-SESSION-{appID} , jwt}
//          redisUtil.set("JWT-SESSION-" + params.getUsername(), jwt, refreshPeriodTime);
          LogExeManager.getInstance().executeLogTask(LogTaskFactory.loginLog(1, IpUtil.getIpFromRequest(WebUtils.toHttp(request)),1, "登录成功"));

          return new Response().Success(Code.LOGIN_SUCCESS, "issue jwt success").addData("jwt", jwt).addData("user", authUser);
    }
    @ApiOperation(value = "用户微信登录", notes = "微信用户登录签发JWT")
    @GetMapping("/wxopen/auth")
    @ResponseBody
    public Response accountLogin(@RequestBody WeChatLogin weChatLogin, HttpServletRequest request, HttpServletResponse response) {
//    	  AuthUser authUser = authUserMapper.selectByName(weChatLogin.getUsername());
//          authUser.setPassword(null);
//          authUser.setSalt(null);
          // 根据appId获取其对应所拥有的角色(这里设计为角色对应资源，没有权限对应资源)
//          String roles = accountService.loadAccountRoleByUsername(params.getUsername());
          // 时间以秒计算,token有效刷新时间是token有效过期时间的2倍
          Integer refreshPeriodTime = 36000;
//          String jwt = JsonWebTokenUtil.issueJWT(UUID.randomUUID().toString(), params.getUsername(),
//                  "token-server", refreshPeriodTime >> 1, roles, null, SignatureAlgorithm.HS512);
          // 将签发的JWT存储到Redis： {JWT-SESSION-{appID} , jwt}
//          redisUtil.set("JWT-SESSION-" + params.getUsername(), jwt, refreshPeriodTime);
//          LogExeManager.getInstance().executeLogTask(LogTaskFactory.loginLog(1, IpUtil.getIpFromRequest(WebUtils.toHttp(request)),1, "登录成功"));
		return null;

//          return new Response().Success(Code.LOGIN_SUCCESS, "issue jwt success").addData("jwt", jwt).addData("user", authUser);
    }
    /**
     * description 用户账号的注册
     *
     * @param request  1
     * @param response 2
     * @return 
     */
    @ApiOperation(value = "用户注册", notes = "POST用户注册")
    @ApiResponses({@ApiResponse(code = 0, message = "回调参数", response = UserParams.class)})
    @PostMapping("/register")
    public Response accountRegister(@Validated @RequestBody UserParams params,HttpServletRequest request, HttpServletResponse response) {
    	logger.info("用户注册>> {}",new Log().setIp(request.getRemoteAddr()).setParam(params.toString()));
        AuthUser authUser = new AuthUser();
        //Integer uid = authUserMapper.selectMaxId() + 1;
        String password = params.getPassword();//params.get("password");
        if ( StringUtils.isEmpty(password)) {
            // 必须信息缺一不可,返回注册账号信息缺失
        	logger.info("用户注册>> {账户信息缺失}",new Log().setIp(request.getRemoteAddr()).setParam(params.toString()));
            return new Response().Fail(1111, "账户信息缺失");
        }
//        if (accountService.isAccountExistByUid(uid)) {
//        	logger.info("用户注册>> {账户已存在}",new Log().setIp(request.getRemoteAddr()).setParam(params.toString()));
//            // 账户已存在
//            return new Response().Fail(1111, "账户已存在");
//        }
        AuthUser au = authUserMapper.selectByName(params.getUsername());
        if(au != null) {
        	logger.info("用户注册>> {账户已存在}",new Log().setIp(request.getRemoteAddr()).setParam(params.toString()));
        	return new Response().Fail(1111, "账户已存在");
        }
//        authUser.setUid(uid);
        String salt = CommonUtil.getRandomString(6);
        // 存储到数据库的密码为 MD5(原密码+盐值)
        authUser.setPassword(Md5Util.md5(password + salt));
        authUser.setSalt(salt);
        authUser.setCreateTime(new Date());
        authUser.setUserName(params.getUsername());
        authUser.setStatus(1);
        if (accountService.registerAccount(authUser) != null) {
            LogExeManager.getInstance().executeLogTask(LogTaskFactory.registerLog(authUser.getUID(), IpUtil.getIpFromRequest(WebUtils.toHttp(request)),  1, "注册成功"));
            logger.info("用户注册>> {注册成功}",new Log().setIp(request.getRemoteAddr()).setParam(authUser.toString()));
            return new Response().Success(2002, "注册成功");
        } else {
            LogExeManager.getInstance().executeLogTask(LogTaskFactory.registerLog(authUser.getUID(), IpUtil.getIpFromRequest(WebUtils.toHttp(request)),  0, "注册失败"));
            logger.info("用户注册>> {注册失败}",new Log().setIp(request.getRemoteAddr()).setParam(params.toString()));
            return new Response().Success(1111, "注册失败");
        }
    }
}
