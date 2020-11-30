package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.LiftStatusMapper;
import com.hta.elevator.domain.LiftStatus;
import com.hta.elevator.service.LiftStatusService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 电梯状态 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class LiftStatusServiceImpl extends BaseServiceImpl<LiftStatus> implements LiftStatusService 
{
	@Autowired
	private LiftStatusMapper liftStatusMapper;


	
}
