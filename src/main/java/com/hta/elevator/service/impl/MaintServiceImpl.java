package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.MaintMapper;
import com.hta.elevator.domain.Maint;
import com.hta.elevator.service.MaintService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	Maint	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class MaintServiceImpl extends BaseServiceImpl<Maint> implements MaintService 
{
	@Autowired
	private MaintMapper maintMapper;


	
}
