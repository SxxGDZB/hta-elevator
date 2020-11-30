package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	Policy	表 Policy
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	Policy	")
public class Policy
{
	/** ID */
	@Excel(name = "ID")
	private Integer Id;
	/** 分组ID */
	@Excel(name = "分组ID")
	private Integer GroupId;
	/** PolicyNum */
	@Excel(name = "PolicyNum")
	private String PolicyNum;
	/** 开始时间 */
	@Excel(name = "开始时间")
	private Date StartTime;
	/** 结束时间 */
	@Excel(name = "结束时间")
	private Date EndTime;
	/** 修改时间 */
	@Excel(name = "修改时间")
	private Date UpdateTime;
	/** 修改者ID */
	@Excel(name = "修改者ID")
	private Integer UpdateId;
	/** 创建者ID */
	@Excel(name = "创建者ID")
	private Integer CreateId;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateTime;
	/** Attachment */
	@Excel(name = "Attachment")
	private String Attachment;
	/** PolicyType */
	@Excel(name = "PolicyType")
	private String PolicyType;
}
