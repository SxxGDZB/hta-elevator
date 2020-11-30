package com.hta.elevator.domain;


import com.hta.elevator.common.annotaion.EntityOperator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 角色菜单关联表 AuthRoleMenu
 * 
 * @author sxx
 * @date 2020-11-28
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "角色菜单关联")
public class AuthRoleMenu extends BaseEntity
{
	/**  */
	private Integer RoleId;
	/**  */
	private Integer MenuId;
}
