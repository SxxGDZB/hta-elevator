package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.FirewareMapper;
import com.hta.elevator.domain.Fireware;
import com.hta.elevator.service.FirewareService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 固件 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class FirewareServiceImpl extends BaseServiceImpl<Fireware> implements FirewareService 
{
	@Autowired
	private FirewareMapper firewareMapper;


	
}
