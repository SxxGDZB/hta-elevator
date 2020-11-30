package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.RolePowerMapper;
import com.hta.elevator.domain.RolePower;
import com.hta.elevator.service.RolePowerService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	RolePower	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class RolePowerServiceImpl extends BaseServiceImpl<RolePower> implements RolePowerService 
{
	@Autowired
	private RolePowerMapper rolePowerMapper;


	
}
