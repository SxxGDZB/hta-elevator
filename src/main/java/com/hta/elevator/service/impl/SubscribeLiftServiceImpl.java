package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.SubscribeLiftMapper;
import com.hta.elevator.domain.SubscribeLift;
import com.hta.elevator.service.SubscribeLiftService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	SubscribeLift 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class SubscribeLiftServiceImpl extends BaseServiceImpl<SubscribeLift> implements SubscribeLiftService 
{
	@Autowired
	private SubscribeLiftMapper subscribeLiftMapper;


	
}
