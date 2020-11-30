package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.ConfigMapper;
import com.hta.elevator.domain.Config;
import com.hta.elevator.service.ConfigService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * Config 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class ConfigServiceImpl extends BaseServiceImpl<Config> implements ConfigService 
{
	@Autowired
	private ConfigMapper configMapper;


	
}
