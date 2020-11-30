package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.DeviceLabelMapper;
import com.hta.elevator.domain.DeviceLabel;
import com.hta.elevator.service.DeviceLabelService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 设备标签 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class DeviceLabelServiceImpl extends BaseServiceImpl<DeviceLabel> implements DeviceLabelService 
{
	@Autowired
	private DeviceLabelMapper deviceLabelMapper;


	
}
