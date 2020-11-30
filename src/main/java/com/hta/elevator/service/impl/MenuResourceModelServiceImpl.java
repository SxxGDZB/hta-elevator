package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.MenuResourceModelMapper;
import com.hta.elevator.domain.MenuResourceModel;
import com.hta.elevator.service.MenuResourceModelService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 菜单资源模板 服务层实现
 * 
 * @author sxx
 * @date 2020-11-28
 */
@Service
public class MenuResourceModelServiceImpl extends BaseServiceImpl<MenuResourceModel> implements MenuResourceModelService 
{
	@Autowired
	private MenuResourceModelMapper menuResourceModelMapper;


	
}
