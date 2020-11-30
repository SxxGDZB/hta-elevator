package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.LiftBaseMapper;
import com.hta.elevator.domain.LiftBase;
import com.hta.elevator.service.LiftBaseService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	LiftBase	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class LiftBaseServiceImpl extends BaseServiceImpl<LiftBase> implements LiftBaseService 
{
	@Autowired
	private LiftBaseMapper liftBaseMapper;


	
}
