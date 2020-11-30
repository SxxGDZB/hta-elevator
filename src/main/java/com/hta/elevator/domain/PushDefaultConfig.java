package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	PushDefaultConfig	表 PushDefaultConfig
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	PushDefaultConfig	")
public class PushDefaultConfig
{
	/** ID */
	@Excel(name = "ID")
	private Integer Id;
	/** 角色ID */
	@Excel(name = "角色ID")
	private Integer RoleId;
	/** 申请 */
	@Excel(name = "申请")
	private String Application;
	/** 故障代码 */
	@Excel(name = "故障代码")
	private String FaultCode;
	/** 是否内置，不允许修改 */
	@Excel(name = "是否内置，不允许修改")
	private Integer IsSys;
}
