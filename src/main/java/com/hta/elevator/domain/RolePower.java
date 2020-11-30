package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	RolePower	表 RolePower
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	RolePower	")
public class RolePower
{
	/** 角色ID */
	@Excel(name = "角色ID")
	private Integer RoleID;
	/** 权限ID */
	@Excel(name = "权限ID")
	private Integer PowerID;
}
