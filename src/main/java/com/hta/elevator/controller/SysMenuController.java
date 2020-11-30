package com.hta.elevator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hta.elevator.domain.SysMenu;
import com.hta.elevator.service.SysMenuService;
import com.hta.elevator.common.controller.BaseController;
/**
 * 菜单 信息操作处理
 * 
 * @author sxx
 * @date 2020-11-28
 */
@Controller
@RequestMapping("/elevator/sysMenu")
public class SysMenuController extends BaseController<SysMenu> 
{
	
	@Autowired
	private SysMenuService sysMenuService;
	
	
}
