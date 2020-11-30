package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.MeCustomerMapper;
import com.hta.elevator.domain.MeCustomer;
import com.hta.elevator.service.MeCustomerService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	ME_Customer 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class MeCustomerServiceImpl extends BaseServiceImpl<MeCustomer> implements MeCustomerService 
{
	@Autowired
	private MeCustomerMapper meCustomerMapper;


	
}
