package com.hta.elevator.domain;

	import java.util.Date;

import com.hta.elevator.common.annotaion.EntityOperator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 用户角色关联表 AuthUserRole
 * 
 * @author sxx
 * @date 2020-11-28
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "用户角色")
public class AuthUserRole extends BaseEntity
{
	/** 用户角色关联表主键 */
	private Integer ID;
	/** 用户UID */
	private Integer UserId;
	/** 角色ID */
	private Integer RoleId;
	/** 创建时间 */
	private Date CreateTime;
	/** 更新时间 */
	private Date UpdateTime;
}
