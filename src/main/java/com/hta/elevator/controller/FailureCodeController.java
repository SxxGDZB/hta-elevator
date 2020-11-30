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
import com.hta.elevator.domain.FailureCode;
import com.hta.elevator.service.FailureCodeService;
import com.hta.elevator.common.controller.BaseController;
import io.swagger.annotations.Api;
/**
 * 故障模型 操作
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Controller
@Api(tags = "故障模型 操作")
@RequestMapping("/elevator/failureCode")
public class FailureCodeController extends BaseController<FailureCode> 
{
	
	@Autowired
	private FailureCodeService failureCodeService;
	
	
}
