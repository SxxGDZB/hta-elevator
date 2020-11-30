package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.AuthAccountLogMapper;
import com.hta.elevator.domain.AuthAccountLog;
import com.hta.elevator.service.AuthAccountLogService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 登录日志 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class AuthAccountLogServiceImpl extends BaseServiceImpl<AuthAccountLog> implements AuthAccountLogService 
{
	@Autowired
	private AuthAccountLogMapper authAccountLogMapper;


	
}
