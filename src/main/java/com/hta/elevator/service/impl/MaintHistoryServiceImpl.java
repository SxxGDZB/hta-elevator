package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.MaintHistoryMapper;
import com.hta.elevator.domain.MaintHistory;
import com.hta.elevator.service.MaintHistoryService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 	MaintHistory	 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class MaintHistoryServiceImpl extends BaseServiceImpl<MaintHistory> implements MaintHistoryService 
{
	@Autowired
	private MaintHistoryMapper maintHistoryMapper;


	
}
