package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 故障码表 FaultCode
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "故障码")
public class FaultCode
{
	/** 故障代码 */
	@Excel(name = "故障代码")
	private String FaultCode;
	/** 故障名称 */
	@Excel(name = "故障名称")
	private String FaultName;
	/** 类型 */
	@Excel(name = "类型")
	private Integer Sort;
}
