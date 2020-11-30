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
import com.hta.elevator.domain.MContract;
import com.hta.elevator.service.MContractService;
import com.hta.elevator.common.controller.BaseController;
import io.swagger.annotations.Api;
/**
 * 	MContract	 操作
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Controller
@Api(tags = "	MContract	 操作")
@RequestMapping("/elevator/mContract")
public class MContractController extends BaseController<MContract> 
{
	
	@Autowired
	private MContractService mContractService;
	
	
}
