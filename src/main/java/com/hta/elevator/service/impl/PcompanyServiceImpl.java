package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.PcompanyMapper;
import com.hta.elevator.domain.Pcompany;
import com.hta.elevator.service.PcompanyService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	Pcompany	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class PcompanyServiceImpl extends BaseServiceImpl<Pcompany> implements PcompanyService 
{
	@Autowired
	private PcompanyMapper pcompanyMapper;


	
}
