package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.LiftMapper;
import com.hta.elevator.domain.Lift;
import com.hta.elevator.service.LiftService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 电梯 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class LiftServiceImpl extends BaseServiceImpl<Lift> implements LiftService 
{
	@Autowired
	private LiftMapper liftMapper;


	
}
