package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.AuthUserRoleMapper;
import com.hta.elevator.domain.AuthUserRole;
import com.hta.elevator.service.AuthUserRoleService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 用户角色关联 服务层实现
 * 
 * @author sxx
 * @date 2020-11-28
 */
@Service
public class AuthUserRoleServiceImpl extends BaseServiceImpl<AuthUserRole> implements AuthUserRoleService 
{
	@Autowired
	private AuthUserRoleMapper authUserRoleMapper;


	
}
