package com.hta.elevator.domain;

	import java.util.Date;

import com.hta.elevator.common.annotaion.EntityOperator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 角色表 AuthRole
 * 
 * @author sxx
 * @date 2020-11-28
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "角色")
public class AuthRole extends BaseEntity
{
	/** 角色ID */
	private Integer ID;
	/** 父ID */
	private Integer ParentId;
	/** 角色编码 */
	private String Code;
	/** 角色名称 */
	private String Name;
	/** 状态   1:正常、9：禁用 */
	private Integer Status;
	/** 创建时间 */
	private Date CreateTime;
	/** 更新时间 */
	private Date UpdateTime;
	/** 分组ID列表 */
	private String Groups;
}
