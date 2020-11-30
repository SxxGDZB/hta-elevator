package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.PushConfigMapper;
import com.hta.elevator.domain.PushConfig;
import com.hta.elevator.service.PushConfigService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	PushConfig	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class PushConfigServiceImpl extends BaseServiceImpl<PushConfig> implements PushConfigService 
{
	@Autowired
	private PushConfigMapper pushConfigMapper;


	
}
