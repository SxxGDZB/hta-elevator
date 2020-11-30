package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.FaultCodeMapper;
import com.hta.elevator.domain.FaultCode;
import com.hta.elevator.service.FaultCodeService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 故障码 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class FaultCodeServiceImpl extends BaseServiceImpl<FaultCode> implements FaultCodeService 
{
	@Autowired
	private FaultCodeMapper faultCodeMapper;


	
}
