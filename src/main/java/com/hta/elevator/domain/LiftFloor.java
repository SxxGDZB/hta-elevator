package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	LiftFloor	表 LiftFloor
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	LiftFloor	")
public class LiftFloor
{
	/** 电梯ID */
	@Excel(name = "电梯ID")
	private Integer LiftID;
	/** LevNo */
	@Excel(name = "LevNo")
	private Integer LevNo;
	/** 楼层视图 */
	@Excel(name = "楼层视图")
	private String FloorView;
	/** 是否是基础配置 */
	@Excel(name = "是否是基础配置")
	private Integer IsBaseStation;
}
