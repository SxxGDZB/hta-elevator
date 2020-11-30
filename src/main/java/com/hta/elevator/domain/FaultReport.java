package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 故障报告表 FaultReport
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "故障报告")
public class FaultReport
{
	/** ID */
	@Excel(name = "ID")
	private Long ID;
	/** 故障ID */
	@Excel(name = "故障ID")
	private Long FaultId;
	/** 用户ID */
	@Excel(name = "用户ID")
	private Integer UserId;
	/** 用户名称 */
	@Excel(name = "用户名称")
	private String UserName;
	/** FailureCauseType */
	@Excel(name = "FailureCauseType")
	private String FailureCauseType;
	/** FailureCauseCode */
	@Excel(name = "FailureCauseCode")
	private String FailureCauseCode;
	/** ReportMeasure */
	@Excel(name = "ReportMeasure")
	private String ReportMeasure;
	/** RescueNum */
	@Excel(name = "RescueNum")
	private Integer RescueNum;
	/** 上报时间 */
	@Excel(name = "上报时间")
	private Date ReportTime;
	/** 修改时间 */
	@Excel(name = "修改时间")
	private Date UpdateTime;
	/** 分组ID */
	@Excel(name = "分组ID")
	private Integer GroupId;
}
