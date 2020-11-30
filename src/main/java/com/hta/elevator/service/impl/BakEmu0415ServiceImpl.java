package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.BakEmu0415Mapper;
import com.hta.elevator.domain.BakEmu0415;
import com.hta.elevator.service.BakEmu0415Service;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	bak_EMU_0415 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class BakEmu0415ServiceImpl extends BaseServiceImpl<BakEmu0415> implements BakEmu0415Service 
{
	@Autowired
	private BakEmu0415Mapper bakEmu0415Mapper;


	
}
