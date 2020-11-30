package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.BakFault2Mapper;
import com.hta.elevator.domain.BakFault2;
import com.hta.elevator.service.BakFault2Service;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	bakFault2 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class BakFault2ServiceImpl extends BaseServiceImpl<BakFault2> implements BakFault2Service 
{
	@Autowired
	private BakFault2Mapper bakFault2Mapper;


	
}
