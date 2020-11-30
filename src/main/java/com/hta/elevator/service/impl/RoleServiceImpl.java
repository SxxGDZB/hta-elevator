package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.RoleMapper;
import com.hta.elevator.domain.Role;
import com.hta.elevator.service.RoleService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	Role	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService 
{
	@Autowired
	private RoleMapper roleMapper;


	
}
