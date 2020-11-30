package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.PolicyMapper;
import com.hta.elevator.domain.Policy;
import com.hta.elevator.service.PolicyService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	Policy	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class PolicyServiceImpl extends BaseServiceImpl<Policy> implements PolicyService 
{
	@Autowired
	private PolicyMapper policyMapper;


	
}
