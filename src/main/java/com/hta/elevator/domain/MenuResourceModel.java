package com.hta.elevator.domain;


import com.hta.elevator.common.annotaion.EntityOperator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 菜单资源模板表 MenuResourceModel
 * 
 * @author sxx
 * @date 2020-11-28
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "菜单资源模板")
public class MenuResourceModel extends BaseEntity
{
	/**  */
	private Integer ID;
	/**  */
	private Integer MenuId;
	/**  */
	private Integer ResourceId;
}
