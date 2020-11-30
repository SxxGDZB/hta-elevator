package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.CtrlMapper;
import com.hta.elevator.domain.Ctrl;
import com.hta.elevator.service.CtrlService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * Ctrl 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class CtrlServiceImpl extends BaseServiceImpl<Ctrl> implements CtrlService 
{
	@Autowired
	private CtrlMapper ctrlMapper;


	
}
