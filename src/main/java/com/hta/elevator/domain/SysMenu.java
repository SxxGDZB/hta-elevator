package com.hta.elevator.domain;

	import java.util.Date;

import com.hta.elevator.common.annotaion.EntityOperator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 菜单表 SysMenu
 * 
 * @author sxx
 * @date 2020-11-28
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "菜单")
public class SysMenu extends BaseEntity
{
	/** 主键 */
	private Integer ID;
	/** 名称 */
	private String Name;
	/** 父ID */
	private Integer ParentId;
	/** 显示顺序 */
	private Integer OrderNum;
	/** 请求地址 */
	private String Url;
	/** 是否隐藏 1显示 0隐藏 */
	private String Visible;
	/** 权限标识 */
	private String Perms;
	/** 字体图标 */
	private String Icon;
	/** 创建者 */
	private String CreateBy;
	/** 创建时间 */
	private Date CreateTime;
	/** 更新者 */
	private String UpdateBy;
	/** 更新时间 */
	private Date UpdateTime;
	/** 备注 */
	private String Remark;
	/** 1、不需要权限 0、需要权限 */
	private Integer IsBasic;
	/** 创建者所属角色ID */
	private Integer RoleId;
	/** 页面类型：1、静态含动态按钮 */
	private Integer PageType;
}
