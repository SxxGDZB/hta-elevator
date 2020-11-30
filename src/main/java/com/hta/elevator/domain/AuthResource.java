package com.hta.elevator.domain;
import java.util.Date;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 资源(菜单,资源)表 AuthResource
 * 
 * @author sxx
 * @date 2020-11-28
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "角色资源")
public class AuthResource extends BaseEntity
{
	/** 资源ID */
	@Excel(name = "资源ID")
	private Integer ID;
	/** 资源名称 */
	@Excel(name = "资源描述")
	private String Code;
	/** 资源描述 */
	@Excel(name = "资源名称")
	private String Name;
	/** 父资源编码->菜单 */
	@Excel(name = "父ID")
	private Integer ParentID;
	/** 访问地址URL */
	private String Url;
	/** 类型 1:菜单menu 2:资源element(rest-api) 3:资源分类 */
	private Integer Type;
	/** 访问方式 GET POST PUT DELETE PATCH */
	private String Method;
	/** 图标 */
	private String Icon;
	/** 状态   1:正常、9：禁用 */
	private Integer Status;
	/** 创建时间 */
	private Date CreateTime;
	/** 更新时间 */
	private Date UpadateTime;
	
	
	
}
