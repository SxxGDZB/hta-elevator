package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.GovSubscribeMapper;
import com.hta.elevator.domain.GovSubscribe;
import com.hta.elevator.service.GovSubscribeService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 订阅 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class GovSubscribeServiceImpl extends BaseServiceImpl<GovSubscribe> implements GovSubscribeService 
{
	@Autowired
	private GovSubscribeMapper govSubscribeMapper;


	
}
