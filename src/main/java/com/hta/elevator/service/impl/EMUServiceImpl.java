package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.EMUMapper;
import com.hta.elevator.domain.EMU;
import com.hta.elevator.service.EMUService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * EMU 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class EMUServiceImpl extends BaseServiceImpl<EMU> implements EMUService 
{
	@Autowired
	private EMUMapper eMUMapper;


	
}
