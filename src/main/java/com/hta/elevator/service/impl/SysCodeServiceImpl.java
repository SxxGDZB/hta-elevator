package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.SysCodeMapper;
import com.hta.elevator.domain.SysCode;
import com.hta.elevator.service.SysCodeService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	SysCode 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class SysCodeServiceImpl extends BaseServiceImpl<SysCode> implements SysCodeService 
{
	@Autowired
	private SysCodeMapper sysCodeMapper;


	
}
