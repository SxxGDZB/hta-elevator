package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.FaultMapper;
import com.hta.elevator.domain.Fault;
import com.hta.elevator.service.FaultService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 故障 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class FaultServiceImpl extends BaseServiceImpl<Fault> implements FaultService 
{
	@Autowired
	private FaultMapper faultMapper;


	
}
