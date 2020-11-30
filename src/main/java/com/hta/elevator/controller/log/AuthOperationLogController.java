package com.hta.elevator.controller.log;

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
import com.hta.elevator.domain.AuthOperationLog;
import com.hta.elevator.service.AuthOperationLogService;
import com.hta.elevator.common.controller.BaseController;
/**
 * 操作日志 信息操作处理
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Controller
@RequestMapping("/elevator/authOperationLog")
public class AuthOperationLogController extends BaseController<AuthOperationLog> 
{
	
	@Autowired
	private AuthOperationLogService authOperationLogService;
	
	
}
