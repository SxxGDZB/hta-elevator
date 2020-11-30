package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.SysMenuMapper;
import com.hta.elevator.domain.SysMenu;
import com.hta.elevator.service.SysMenuService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 菜单 服务层实现
 * 
 * @author sxx
 * @date 2020-11-28
 */
@Service
public class SysMenuServiceImpl extends BaseServiceImpl<SysMenu> implements SysMenuService 
{
	@Autowired
	private SysMenuMapper sysMenuMapper;


	
}
