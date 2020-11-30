package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.MenuMapper;
import com.hta.elevator.domain.Menu;
import com.hta.elevator.service.MenuService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	Menu	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class MenuServiceImpl extends BaseServiceImpl<Menu> implements MenuService 
{
	@Autowired
	private MenuMapper menuMapper;


	
}
