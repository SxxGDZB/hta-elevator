package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.LiftLinkConfirmMapper;
import com.hta.elevator.domain.LiftLinkConfirm;
import com.hta.elevator.service.LiftLinkConfirmService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * LiftLinkConfirm 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class LiftLinkConfirmServiceImpl extends BaseServiceImpl<LiftLinkConfirm> implements LiftLinkConfirmService 
{
	@Autowired
	private LiftLinkConfirmMapper liftLinkConfirmMapper;


	
}
