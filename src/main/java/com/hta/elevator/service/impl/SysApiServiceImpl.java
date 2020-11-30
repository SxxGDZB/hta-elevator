package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.SysApiMapper;
import com.hta.elevator.domain.SysApi;
import com.hta.elevator.service.SysApiService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	SysApi	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class SysApiServiceImpl extends BaseServiceImpl<SysApi> implements SysApiService 
{
	@Autowired
	private SysApiMapper sysApiMapper;


	
}
