package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.PowerGroupMapper;
import com.hta.elevator.domain.PowerGroup;
import com.hta.elevator.service.PowerGroupService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	PowerGroup	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class PowerGroupServiceImpl extends BaseServiceImpl<PowerGroup> implements PowerGroupService 
{
	@Autowired
	private PowerGroupMapper powerGroupMapper;


	
}
