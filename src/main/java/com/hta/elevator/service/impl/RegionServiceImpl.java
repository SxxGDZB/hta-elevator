package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.RegionMapper;
import com.hta.elevator.domain.Region;
import com.hta.elevator.service.RegionService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 中国行政区划 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class RegionServiceImpl extends BaseServiceImpl<Region> implements RegionService 
{
	@Autowired
	private RegionMapper regionMapper;


	
}
