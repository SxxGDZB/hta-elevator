package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.PowerMapper;
import com.hta.elevator.domain.Power;
import com.hta.elevator.service.PowerService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	Power	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class PowerServiceImpl extends BaseServiceImpl<Power> implements PowerService 
{
	@Autowired
	private PowerMapper powerMapper;


	
}
