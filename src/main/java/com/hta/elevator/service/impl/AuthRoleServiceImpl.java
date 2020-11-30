package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.AuthRoleMapper;
import com.hta.elevator.domain.AuthRole;
import com.hta.elevator.service.AuthRoleService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 角色 服务层实现
 * 
 * @author sxx
 * @date 2020-11-28
 */
@Service
public class AuthRoleServiceImpl extends BaseServiceImpl<AuthRole> implements AuthRoleService 
{
	@Autowired
	private AuthRoleMapper authRoleMapper;


	
}
