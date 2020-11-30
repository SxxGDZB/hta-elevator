package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.SysCodeTypeMapper;
import com.hta.elevator.domain.SysCodeType;
import com.hta.elevator.service.SysCodeTypeService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 字典类别 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class SysCodeTypeServiceImpl extends BaseServiceImpl<SysCodeType> implements SysCodeTypeService 
{
	@Autowired
	private SysCodeTypeMapper sysCodeTypeMapper;


	
}
