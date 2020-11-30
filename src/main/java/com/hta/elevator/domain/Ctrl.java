package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * Ctrl表 Ctrl
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "Ctrl")
public class Ctrl
{
	/** 控制代码 */
	@Excel(name = "控制代码")
	private String CtrlCode;
	/** 控制器类型 */
	@Excel(name = "控制器类型")
	private String CtrlType;
	/** 自定义ID */
	@Excel(name = "自定义ID")
	private String CustomerId;
	/** 控制器昵称 */
	@Excel(name = "控制器昵称")
	private String CtrlNickName;
}
