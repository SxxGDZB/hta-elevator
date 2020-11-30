package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.MenuResourceMapper;
import com.hta.elevator.domain.MenuResource;
import com.hta.elevator.service.MenuResourceService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 菜单资源关联 服务层实现
 * 
 * @author sxx
 * @date 2020-11-28
 */
@Service
public class MenuResourceServiceImpl extends BaseServiceImpl<MenuResource> implements MenuResourceService 
{
	@Autowired
	private MenuResourceMapper menuResourceMapper;


	
}
