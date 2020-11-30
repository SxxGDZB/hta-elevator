package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.RoleUserMapper;
import com.hta.elevator.domain.RoleUser;
import com.hta.elevator.service.RoleUserService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	RoleUser	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class RoleUserServiceImpl extends BaseServiceImpl<RoleUser> implements RoleUserService 
{
	@Autowired
	private RoleUserMapper roleUserMapper;


	
}
