package com.hta.elevator.domain;
import java.math.BigDecimal;
import java.util.Date;

import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	bakFault2表 bakFault2
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	bakFault2")
public class BakFault2
{
	/** ID */
	@Excel(name = "ID")
	private Long Id;
	/** 电梯ID */
	@Excel(name = "电梯ID")
	private Integer LiftId;
	/** 电梯基本ID */
	@Excel(name = "电梯基本ID")
	private Integer LiftBaseId;
	/** EMU */
	@Excel(name = "EMU")
	private Integer EMU;
	/** 分组ID */
	@Excel(name = "分组ID")
	private Integer GroupId;
	/** 故障类型 */
	@Excel(name = "故障类型")
	private String FaultType;
	/** 故障代码 */
	@Excel(name = "故障代码")
	private String FaultCode;
	/** 是否已经重置 */
	@Excel(name = "是否已经重置")
	private Integer IsReset;
	/** 设置时间 */
	@Excel(name = "设置时间")
	private Date SetTime;
	/** 重置时间 */
	@Excel(name = "重置时间")
	private Date ResetTime;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateTime;
	/** 创建源 */
	@Excel(name = "创建源")
	private Integer CreateSource;
	/** DigitalData1 */
	@Excel(name = "DigitalData1")
	private Long DigitalData1;
	/** AnalogData1 */
	@Excel(name = "AnalogData1")
	private Long AnalogData1;
	/** Humity1 */
	@Excel(name = "Humity1")
	private Integer Humity1;
	/** Tempareture1 */
	@Excel(name = "Tempareture1")
	private BigDecimal Tempareture1;
	/** DigitalData2 */
	@Excel(name = "DigitalData2")
	private Long DigitalData2;
	/** Humity2 */
	@Excel(name = "Humity2")
	private Integer Humity2;
	/** Tempareture2 */
	@Excel(name = "Tempareture2")
	private BigDecimal Tempareture2;
	/** NoticeTime1 */
	@Excel(name = "NoticeTime1")
	private Date NoticeTime1;
	/** NoticeTime2 */
	@Excel(name = "NoticeTime2")
	private Date NoticeTime2;
	/** NoticeTime3 */
	@Excel(name = "NoticeTime3")
	private Date NoticeTime3;
	/** AckTime */
	@Excel(name = "AckTime")
	private Date AckTime;
	/** AckUserId */
	@Excel(name = "AckUserId")
	private Integer AckUserId;
	/** AckLocation */
	@Excel(name = "AckLocation")
	private String AckLocation;
	/** ArriveTime */
	@Excel(name = "ArriveTime")
	private Date ArriveTime;
	/** ArriveUserId1 */
	@Excel(name = "ArriveUserId1")
	private Integer ArriveUserId1;
	/** ArriveUserId2 */
	@Excel(name = "ArriveUserId2")
	private Integer ArriveUserId2;
	/** RelieveTime */
	@Excel(name = "RelieveTime")
	private Date RelieveTime;
	/** RelieveUserId */
	@Excel(name = "RelieveUserId")
	private Integer RelieveUserId;
	/** RelieveReport */
	@Excel(name = "RelieveReport")
	private String RelieveReport;
	/** ReportTime */
	@Excel(name = "ReportTime")
	private Date ReportTime;
	/** ReportUserId */
	@Excel(name = "ReportUserId")
	private Integer ReportUserId;
	/** ReportFailureCauseType */
	@Excel(name = "ReportFailureCauseType")
	private String ReportFailureCauseType;
	/** ReportFailureCauseCode */
	@Excel(name = "ReportFailureCauseCode")
	private String ReportFailureCauseCode;
	/** ReportMeasure */
	@Excel(name = "ReportMeasure")
	private String ReportMeasure;
	/** FinishTime */
	@Excel(name = "FinishTime")
	private Date FinishTime;
	/** ProcessStatus */
	@Excel(name = "ProcessStatus")
	private Integer ProcessStatus;
	/** ResponseTime */
	@Excel(name = "ResponseTime")
	private Integer ResponseTime;
	/** RepairTime */
	@Excel(name = "RepairTime")
	private Integer RepairTime;
	/** UnableServeTime */
	@Excel(name = "UnableServeTime")
	private Integer UnableServeTime;
	/** RescueTime */
	@Excel(name = "RescueTime")
	private Integer RescueTime;
	/** SchuleOffTime */
	@Excel(name = "SchuleOffTime")
	private Date SchuleOffTime;
	/** SchuleOnTime */
	@Excel(name = "SchuleOnTime")
	private Date SchuleOnTime;
	/** ElevatorOnTime */
	@Excel(name = "ElevatorOnTime")
	private Date ElevatorOnTime;
	/** FcNo */
	@Excel(name = "FcNo")
	private Integer FcNo;
	/** MainCode */
	@Excel(name = "MainCode")
	private Integer MainCode;
	/** SubCode */
	@Excel(name = "SubCode")
	private Integer SubCode;
	/** RescueNum */
	@Excel(name = "RescueNum")
	private Integer RescueNum;
	/** FaultUuid */
	@Excel(name = "FaultUuid")
	private String FaultUuid;
	/** AckLng */
	@Excel(name = "AckLng")
	private BigDecimal AckLng;
	/** AckLat */
	@Excel(name = "AckLat")
	private BigDecimal AckLat;
}
