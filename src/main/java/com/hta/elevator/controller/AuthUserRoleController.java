package com.hta.elevator.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hta.elevator.domain.AuthUserRole;
import com.hta.elevator.service.AuthUserRoleService;
import com.hta.elevator.common.controller.BaseController;
/**
 * 用户角色关联 信息操作处理
 * 
 * @author sxx
 * @date 2020-11-28
 */
@Controller
@RequestMapping("/elevator/authUserRole")
public class AuthUserRoleController extends BaseController<AuthUserRole> 
{
	
	@Autowired
	private AuthUserRoleService authUserRoleService;
	
	
}
