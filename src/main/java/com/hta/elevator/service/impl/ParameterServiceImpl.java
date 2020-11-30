package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.ParameterMapper;
import com.hta.elevator.domain.Parameter;
import com.hta.elevator.service.ParameterService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	Parameter	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class ParameterServiceImpl extends BaseServiceImpl<Parameter> implements ParameterService 
{
	@Autowired
	private ParameterMapper parameterMapper;


	
}
