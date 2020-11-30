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
import com.hta.elevator.domain.MContractDetail;
import com.hta.elevator.service.MContractDetailService;
import com.hta.elevator.common.controller.BaseController;
import io.swagger.annotations.Api;
/**
 * 	MContractDetail	 操作
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Controller
@Api(tags = "	MContractDetail	 操作")
@RequestMapping("/elevator/mContractDetail")
public class MContractDetailController extends BaseController<MContractDetail> 
{
	
	@Autowired
	private MContractDetailService mContractDetailService;
	
	
}
