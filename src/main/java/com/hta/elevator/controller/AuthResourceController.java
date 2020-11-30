package com.hta.elevator.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.hta.elevator.domain.AuthResource;
import com.hta.elevator.service.AuthResourceService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import com.hta.elevator.common.bean.Code;
import com.hta.elevator.common.bean.Response;
import com.hta.elevator.common.controller.BaseController;
import com.hta.elevator.common.util.ExcelUtil;
/**
 * 资源(菜单,资源) 信息操作处理
 * 
 * @author sxx
 * @date 2020-11-28
 */
@Controller
@RequestMapping("/elevator/authResource")
public class AuthResourceController extends BaseController<AuthResource> 
{
	
	@Autowired
	private AuthResourceService authResourceService;
	
}
