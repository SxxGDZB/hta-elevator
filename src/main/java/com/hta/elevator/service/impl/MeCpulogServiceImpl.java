package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.MeCpulogMapper;
import com.hta.elevator.domain.MeCpulog;
import com.hta.elevator.service.MeCpulogService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	ME_CpuLog	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class MeCpulogServiceImpl extends BaseServiceImpl<MeCpulog> implements MeCpulogService 
{
	@Autowired
	private MeCpulogMapper meCpulogMapper;


	
}
