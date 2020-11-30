package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	SysCode表 SysCode
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	SysCode")
public class SysCode
{
	/** ID */
	@Excel(name = "ID")
	private Integer ID;
	/** 父节点主键 */
	@Excel(name = "父节点主键")
	private Integer ParentID;
	/** 类别 */
	@Excel(name = "类别")
	private String CodeType;
	/** 类容 */
	@Excel(name = "类容")
	private String Value;
	/** Text输入框 */
	@Excel(name = "Text输入框")
	private String Text;
	/** 描述 */
	@Excel(name = "描述")
	private String Description;
	/** 是否启用 */
	@Excel(name = "是否启用")
	private Integer IsEnabled;
	/** 是否默认 */
	@Excel(name = "是否默认")
	private Integer IsDefault;
	/** 允许编辑 */
	@Excel(name = "允许编辑")
	private Integer AllowEdit;
	/** 允许删除 */
	@Excel(name = "允许删除")
	private Integer AllowDelete;
	/** 分类代码 */
	@Excel(name = "分类代码")
	private Integer SortCode;
	/** 创建者 */
	@Excel(name = "创建者")
	private String CretePerson;
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
