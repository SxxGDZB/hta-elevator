package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.McompanyMapper;
import com.hta.elevator.domain.Mcompany;
import com.hta.elevator.service.McompanyService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	Mcompany	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class McompanyServiceImpl extends BaseServiceImpl<Mcompany> implements McompanyService 
{
	@Autowired
	private McompanyMapper mcompanyMapper;


	
}
