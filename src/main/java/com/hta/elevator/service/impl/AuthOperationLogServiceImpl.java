package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.AuthOperationLogMapper;
import com.hta.elevator.domain.AuthOperationLog;
import com.hta.elevator.service.AuthOperationLogService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 操作日志 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class AuthOperationLogServiceImpl extends BaseServiceImpl<AuthOperationLog> implements AuthOperationLogService 
{
	@Autowired
	private AuthOperationLogMapper authOperationLogMapper;


	
}
