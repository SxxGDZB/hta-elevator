package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.AuthResourceMapper;
import com.hta.elevator.domain.AuthResource;
import com.hta.elevator.service.AuthResourceService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 资源(菜单,资源) 服务层实现
 * 
 * @author sxx
 * @date 2020-11-28
 */
@Service
@Primary
public class AuthResourceServiceImpl extends BaseServiceImpl<AuthResource> implements AuthResourceService 
{
	@Autowired
	private AuthResourceMapper authResourceMapper;


	
}
