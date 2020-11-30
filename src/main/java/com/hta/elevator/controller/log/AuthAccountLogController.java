package com.hta.elevator.controller.log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hta.elevator.domain.AuthAccountLog;
import com.hta.elevator.service.AuthAccountLogService;
import com.hta.elevator.common.controller.BaseController;
/**
 * 登录日志 信息操作处理
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Controller
@RequestMapping("/elevator/authAccountLog")
public class AuthAccountLogController extends BaseController<AuthAccountLog> 
{
	
	@Autowired
	private AuthAccountLogService authAccountLogService;
	
	
}
