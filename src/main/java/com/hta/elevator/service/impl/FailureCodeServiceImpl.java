package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.FailureCodeMapper;
import com.hta.elevator.domain.FailureCode;
import com.hta.elevator.service.FailureCodeService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 故障模型 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class FailureCodeServiceImpl extends BaseServiceImpl<FailureCode> implements FailureCodeService 
{
	@Autowired
	private FailureCodeMapper failureCodeMapper;


	
}
