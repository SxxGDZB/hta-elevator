package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.SmsAlarmMapper;
import com.hta.elevator.domain.SmsAlarm;
import com.hta.elevator.service.SmsAlarmService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	SmsAlarm	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class SmsAlarmServiceImpl extends BaseServiceImpl<SmsAlarm> implements SmsAlarmService 
{
	@Autowired
	private SmsAlarmMapper smsAlarmMapper;


	
}
