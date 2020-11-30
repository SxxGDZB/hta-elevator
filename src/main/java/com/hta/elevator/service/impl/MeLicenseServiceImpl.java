package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.MeLicenseMapper;
import com.hta.elevator.domain.MeLicense;
import com.hta.elevator.service.MeLicenseService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	ME_License	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class MeLicenseServiceImpl extends BaseServiceImpl<MeLicense> implements MeLicenseService 
{
	@Autowired
	private MeLicenseMapper meLicenseMapper;


	
}
