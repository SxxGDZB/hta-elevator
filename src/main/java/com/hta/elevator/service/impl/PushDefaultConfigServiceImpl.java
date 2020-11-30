package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.PushDefaultConfigMapper;
import com.hta.elevator.domain.PushDefaultConfig;
import com.hta.elevator.service.PushDefaultConfigService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	PushDefaultConfig	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class PushDefaultConfigServiceImpl extends BaseServiceImpl<PushDefaultConfig> implements PushDefaultConfigService 
{
	@Autowired
	private PushDefaultConfigMapper pushDefaultConfigMapper;


	
}
