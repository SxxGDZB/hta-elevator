package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.PassengerMapper;
import com.hta.elevator.domain.Passenger;
import com.hta.elevator.service.PassengerService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	Passenger	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class PassengerServiceImpl extends BaseServiceImpl<Passenger> implements PassengerService 
{
	@Autowired
	private PassengerMapper passengerMapper;


	
}
