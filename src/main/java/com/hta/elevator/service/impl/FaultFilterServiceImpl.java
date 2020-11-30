package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.FaultFilterMapper;
import com.hta.elevator.domain.FaultFilter;
import com.hta.elevator.service.FaultFilterService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * FaultFilter 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class FaultFilterServiceImpl extends BaseServiceImpl<FaultFilter> implements FaultFilterService 
{
	@Autowired
	private FaultFilterMapper faultFilterMapper;


	
}
