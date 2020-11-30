package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.SmsAlarmUserMapper;
import com.hta.elevator.domain.SmsAlarmUser;
import com.hta.elevator.service.SmsAlarmUserService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	SmsAlarmUser	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class SmsAlarmUserServiceImpl extends BaseServiceImpl<SmsAlarmUser> implements SmsAlarmUserService 
{
	@Autowired
	private SmsAlarmUserMapper smsAlarmUserMapper;


	
}
