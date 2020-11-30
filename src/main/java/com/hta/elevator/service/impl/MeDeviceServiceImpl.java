package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.MeDeviceMapper;
import com.hta.elevator.domain.MeDevice;
import com.hta.elevator.service.MeDeviceService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	ME_Device	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class MeDeviceServiceImpl extends BaseServiceImpl<MeDevice> implements MeDeviceService 
{
	@Autowired
	private MeDeviceMapper meDeviceMapper;


	
}
