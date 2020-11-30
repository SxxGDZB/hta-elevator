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
import com.hta.elevator.domain.BakEmu0415;
import com.hta.elevator.service.BakEmu0415Service;
import com.hta.elevator.common.controller.BaseController;
import io.swagger.annotations.Api;
/**
 * 	bak_EMU_0415 操作
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Controller
@Api(tags = "	bak_EMU_0415 操作")
@RequestMapping("/elevator/bakEmu0415")
public class BakEmu0415Controller extends BaseController<BakEmu0415> 
{
	
	@Autowired
	private BakEmu0415Service bakEmu0415Service;
	
	
}
