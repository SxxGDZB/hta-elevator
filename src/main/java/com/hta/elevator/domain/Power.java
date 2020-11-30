package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	Power	表 Power
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	Power	")
public class Power
{
	/** ID */
	@Excel(name = "ID")
	private Integer ID;
	/** 分组ID */
	@Excel(name = "分组ID")
	private Integer GroupID;
	/** 名称 */
	@Excel(name = "名称")
	private String Name;
	/** 标题 */
	@Excel(name = "标题")
	private String Title;
	/** 备注 */
	@Excel(name = "备注")
	private String Remark;
	/** 分类代码 */
	@Excel(name = "分类代码")
	private Integer SortCode;
}
