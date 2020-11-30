package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	Role	表 Role
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	Role	")
public class Role
{
	/** ID */
	@Excel(name = "ID")
	private Integer Id;
	/** 名称 */
	@Excel(name = "名称")
	private String Name;
	/** 描述 */
	@Excel(name = "描述")
	private String Description;
	/** 代码类别 */
	@Excel(name = "代码类别")
	private Integer SortCode;
	/** 创建者 */
	@Excel(name = "创建者")
	private Integer CreateId;
	/** 由谁创建 */
	@Excel(name = "由谁创建")
	private String CreateBy;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateTime;
	/** 修改者 */
	@Excel(name = "修改者")
	private Integer UpdateId;
	/** 由谁修改 */
	@Excel(name = "由谁修改")
	private String UpdateBy;
	/** 修改时间 */
	@Excel(name = "修改时间")
	private Date UpdateTime;
}
