package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	SysApi	表 SysApi
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	SysApi	")
public class SysApi
{
	/** ID */
	@Excel(name = "ID")
	private Integer ID;
	/** 名称 */
	@Excel(name = "名称")
	private String Name;
	/** 代码 */
	@Excel(name = "代码")
	private String Code;
	/** 路径 */
	@Excel(name = "路径")
	private String Uri;
	/** 方法 */
	@Excel(name = "方法")
	private String Method;
	/** 类别 */
	@Excel(name = "类别")
	private Integer Sort;
	/** 状态 */
	@Excel(name = "状态")
	private Integer Status;
	/** 是否已删除 */
	@Excel(name = "是否已删除")
	private Integer IsDelete;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateTime;
	/** 修改时间 */
	@Excel(name = "修改时间")
	private Date UpdateTime;
}
