package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	RoleUser	表 RoleUser
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	RoleUser	")
public class RoleUser
{
	/** 角色ID */
	@Excel(name = "角色ID")
	private Integer RoleID;
	/** 用户ID */
	@Excel(name = "用户ID")
	private String UserID;
}
