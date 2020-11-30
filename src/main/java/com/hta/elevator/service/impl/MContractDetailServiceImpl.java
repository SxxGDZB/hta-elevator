package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.MContractDetailMapper;
import com.hta.elevator.domain.MContractDetail;
import com.hta.elevator.service.MContractDetailService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	MContractDetail	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class MContractDetailServiceImpl extends BaseServiceImpl<MContractDetail> implements MContractDetailService 
{
	@Autowired
	private MContractDetailMapper mContractDetailMapper;


	
}
