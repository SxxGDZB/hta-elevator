package com.hta.elevator.domain;


import com.hta.elevator.common.annotaion.EntityOperator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 菜单资源关联表 MenuResource
 * 
 * @author sxx
 * @date 2020-11-28
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "菜单资源")
public class MenuResource extends BaseEntity
{
	/** 存放角色菜单不存在的API资源 */
	private Integer ID;
	/** 菜单ID */
	private Integer MenuId;
	/** 资源ID */
	private Integer ResourceId;
	/** 角色ID */
	private Integer RoleId;
}
