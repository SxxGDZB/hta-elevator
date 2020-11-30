package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.MContractMapper;
import com.hta.elevator.domain.MContract;
import com.hta.elevator.service.MContractService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	MContract	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class MContractServiceImpl extends BaseServiceImpl<MContract> implements MContractService 
{
	@Autowired
	private MContractMapper mContractMapper;


	
}
