package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.MaintOrderMapper;
import com.hta.elevator.domain.MaintOrder;
import com.hta.elevator.service.MaintOrderService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	MaintOrder	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class MaintOrderServiceImpl extends BaseServiceImpl<MaintOrder> implements MaintOrderService 
{
	@Autowired
	private MaintOrderMapper maintOrderMapper;


	
}
