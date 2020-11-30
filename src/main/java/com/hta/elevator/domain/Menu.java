package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	Menu	表 Menu
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	Menu	")
public class Menu
{
	/** ID */
	@Excel(name = "ID")
	private Integer ID;
	/** 名称 */
	@Excel(name = "名称")
	private String Name;
	/** 图片路径 */
	@Excel(name = "图片路径")
	private String ImageUrl;
	/** NavigateUrl */
	@Excel(name = "NavigateUrl")
	private String NavigateUrl;
	/** 备注 */
	@Excel(name = "备注")
	private String Remark;
	/** SortCode */
	@Excel(name = "SortCode")
	private Integer SortCode;
	/** 父ID */
	@Excel(name = "父ID")
	private Integer ParentID;
	/** 视图权利ID */
	@Excel(name = "视图权利ID")
	private Integer ViewPowerID;
}
