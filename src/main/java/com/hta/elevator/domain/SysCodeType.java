package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 字典类别表 SysCodeType
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "字典类别")
public class SysCodeType
{
	/** 类别编码 */
	@Excel(name = "类别编码")
	private String CodeType;
	/** 类别名称 */
	@Excel(name = "类别名称")
	private String CodeTypeName;
	/** 是否有效 */
	@Excel(name = "是否有效")
	private Integer Enabled;
	/** 允许编辑 */
	@Excel(name = "允许编辑")
	private Integer AllowEdit;
	/** 允许删除 */
	@Excel(name = "允许删除")
	private Integer AllowDelete;
	/** 描述 */
	@Excel(name = "描述")
	private String Description;
	/** 排序码 */
	@Excel(name = "排序码")
	private Integer SortCode;
	/** 创建者 */
	@Excel(name = "创建者")
	private String CreatePerson;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateDate;
	/** 修改者 */
	@Excel(name = "修改者")
	private String UpdatePerson;
	/** 修改时间 */
	@Excel(name = "修改时间")
	private Date UpdateDate;
}
