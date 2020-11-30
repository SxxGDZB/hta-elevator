package com.hta.elevator.domain;
import java.math.BigDecimal;
import java.util.Date;

import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 电梯状态表 LiftStatus
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "电梯状态")
public class LiftStatus
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
	/** EMU ID */
	@Excel(name = "EMU ID")
	private Integer EMU;
	/** 分组ID */
	@Excel(name = "分组ID")
	private Integer GroupId;
	/** 数字状态数据 */
	@Excel(name = "数字状态数据")
	private Long DigitalData;
	/** 告警状态数据 */
	@Excel(name = "告警状态数据")
	private Long AlarmData;
	/** 模拟状态数据 */
	@Excel(name = "模拟状态数据")
	private Long AnalogData;
	/** 物理楼层 */
	@Excel(name = "物理楼层")
	private Integer LevNo;
	/** 运行方向 */
	@Excel(name = "运行方向")
	private Integer Direction;
	/** 是否平层 */
	@Excel(name = "是否平层")
	private Integer Level;
	/** 门 */
	@Excel(name = "门")
	private Integer DoorSw;
	/** 车门 */
	@Excel(name = "车门")
	private Integer CarDoorSw;
	/** DoorOpenLimite */
	@Excel(name = "DoorOpenLimite")
	private Integer DoorOpenLimite;
	/** DoorOpenBottom */
	@Excel(name = "DoorOpenBottom")
	private Integer DoorOpenBottom;
	/** FireSw */
	@Excel(name = "FireSw")
	private Integer FireSw;
	/** EmuSw */
	@Excel(name = "EmuSw")
	private Integer EmuSw;
	/** PsEmu */
	@Excel(name = "PsEmu")
	private Integer PsEmu;
	/** Ps3P */
	@Excel(name = "Ps3P")
	private Integer Ps3P;
	/** Ps1P */
	@Excel(name = "Ps1P")
	private Integer Ps1P;
	/** PsCon */
	@Excel(name = "PsCon")
	private Integer PsCon;
	/** Auto */
	@Excel(name = "Auto")
	private Integer Mainten;
	/** Normal */
	@Excel(name = "Normal")
	private Integer Auto;
	/** Normal */
	@Excel(name = "Normal")
	private Integer Normal;
	/** Lock */
	@Excel(name = "Lock")
	private Integer Lock;
	/** CarCall */
	@Excel(name = "CarCall")
	private Integer CarCall;
	/** AlarmBell */
	@Excel(name = "AlarmBell")
	private Integer AlarmBell;
	/** OverLoad */
	@Excel(name = "OverLoad")
	private Integer OverLoad;
	/** Gprs */
	@Excel(name = "Gprs")
	private Integer Gprs;
	/** Water */
	@Excel(name = "Water")
	private Integer Water;
	/** Humity */
	@Excel(name = "Humity")
	private Integer Humity;
	/** Tempareture */
	@Excel(name = "Tempareture")
	private BigDecimal Tempareture;
	/** EBV */
	@Excel(name = "EBV")
	private BigDecimal EBV;
	/** EMUBV */
	@Excel(name = "EMUBV")
	private BigDecimal EMUBV;
	/** FcNo */
	@Excel(name = "FcNo")
	private Integer FcNo;
	/** MainCode */
	@Excel(name = "MainCode")
	private Integer MainCode;
	/** SubCode */
	@Excel(name = "SubCode")
	private Integer SubCode;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateTime;
	/** 控制器故障码 */
	@Excel(name = "控制器故障码")
	private Integer SourFC;
	/** 轿厢内是否有乘客人 */
	@Excel(name = "轿厢内是否有乘客人")
	private Integer PassengeIn;
	/** 乘客人数 */
	@Excel(name = "乘客人数")
	private Integer PassengeCnt;
	/** 广告屏呼救按钮动作 */
	@Excel(name = "广告屏呼救按钮动作")
	private Integer PassengeCallGgp;
	/** 运行里程（米） */
	@Excel(name = "运行里程（米）")
	private Long RideDis;
	/** 关门次数 */
	@Excel(name = "关门次数")
	private Long DoorswCnt;
	/** 累计服务人次 */
	@Excel(name = "累计服务人次")
	private Long PassegerCnt;
	/** 累计启动次数 */
	@Excel(name = "累计启动次数")
	private Long StartoverCnt;
	/** 累计运行时间（小时） */
	@Excel(name = "累计运行时间（小时）")
	private Long RunTime;
	/** 运行速度（m/s） */
	@Excel(name = "运行速度（m/s）")
	private BigDecimal Vel;
}
