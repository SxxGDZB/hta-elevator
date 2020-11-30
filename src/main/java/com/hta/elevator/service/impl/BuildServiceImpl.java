package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.BuildMapper;
import com.hta.elevator.domain.Build;
import com.hta.elevator.service.BuildService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 楼盘 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class BuildServiceImpl extends BaseServiceImpl<Build> implements BuildService 
{
	@Autowired
	private BuildMapper buildMapper;


	
}
