package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.ManufacturerMapper;
import com.hta.elevator.domain.Manufacturer;
import com.hta.elevator.service.ManufacturerService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	Manufacturer	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class ManufacturerServiceImpl extends BaseServiceImpl<Manufacturer> implements ManufacturerService 
{
	@Autowired
	private ManufacturerMapper manufacturerMapper;


	
}
