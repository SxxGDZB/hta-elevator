package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.AuthRoleMenuMapper;
import com.hta.elevator.domain.AuthRoleMenu;
import com.hta.elevator.service.AuthRoleMenuService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 角色菜单关联 服务层实现
 * 
 * @author sxx
 * @date 2020-11-28
 */
@Service
public class AuthRoleMenuServiceImpl extends BaseServiceImpl<AuthRoleMenu> implements AuthRoleMenuService 
{
	@Autowired
	private AuthRoleMenuMapper authRoleMenuMapper;


	
}
