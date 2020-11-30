package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	PowerGroup	表 PowerGroup
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	PowerGroup	")
public class PowerGroup
{
	/** 分组ID */
	@Excel(name = "分组ID")
	private Integer GroupID;
	/** 分组名称 */
	@Excel(name = "分组名称")
	private String GroupName;
	/** 分类代码 */
	@Excel(name = "分类代码")
	private Integer SortCode;
}
