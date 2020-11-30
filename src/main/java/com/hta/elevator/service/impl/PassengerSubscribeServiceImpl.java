package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.PassengerSubscribeMapper;
import com.hta.elevator.domain.PassengerSubscribe;
import com.hta.elevator.service.PassengerSubscribeService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	PassengerSubscribe	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class PassengerSubscribeServiceImpl extends BaseServiceImpl<PassengerSubscribe> implements PassengerSubscribeService 
{
	@Autowired
	private PassengerSubscribeMapper passengerSubscribeMapper;


	
}
