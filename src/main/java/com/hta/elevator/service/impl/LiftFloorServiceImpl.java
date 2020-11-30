package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.LiftFloorMapper;
import com.hta.elevator.domain.LiftFloor;
import com.hta.elevator.service.LiftFloorService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	LiftFloor	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class LiftFloorServiceImpl extends BaseServiceImpl<LiftFloor> implements LiftFloorService 
{
	@Autowired
	private LiftFloorMapper liftFloorMapper;


	
}
