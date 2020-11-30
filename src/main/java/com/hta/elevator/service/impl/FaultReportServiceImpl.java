package com.hta.elevator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.FaultReportMapper;
import com.hta.elevator.domain.FaultReport;
import com.hta.elevator.service.FaultReportService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 故障报告 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class FaultReportServiceImpl extends BaseServiceImpl<FaultReport> implements FaultReportService 
{
	@Autowired
	private FaultReportMapper faultReportMapper;


	
}
