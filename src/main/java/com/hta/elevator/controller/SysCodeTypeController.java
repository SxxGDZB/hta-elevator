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
import com.hta.elevator.domain.SysCodeType;
import com.hta.elevator.service.SysCodeTypeService;
import com.hta.elevator.common.controller.BaseController;
import io.swagger.annotations.Api;
/**
 * 字典类别 操作
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Controller
@Api(tags = "字典类别 操作")
@RequestMapping("/elevator/sysCodeType")
public class SysCodeTypeController extends BaseController<SysCodeType> 
{
	
	@Autowired
	private SysCodeTypeService sysCodeTypeService;
	
	
}
