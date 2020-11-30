package com.hta.elevator.domain;
import java.math.BigDecimal;
import java.util.Date;

import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	MaintOrder	表 MaintOrder
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	MaintOrder	")
public class MaintOrder
{
	/** ID */
	@Excel(name = "ID")
	private Long Id;
	/** 电梯基础id */
	@Excel(name = "电梯基础id")
	private Integer LiftBaseId;
	/** 电梯id */
	@Excel(name = "电梯id")
	private Integer LiftId;
	/** 维修项目 */
	@Excel(name = "维修项目")
	private String MaintItem;
	/** 说明 */
	@Excel(name = "说明")
	private String Desc;
	/** 报价 */
	@Excel(name = "报价")
	private BigDecimal Price;
	/** 预计维修开始时间 */
	@Excel(name = "预计维修开始时间")
	private Date EstimatedStartTime;
	/** 预计维修完成时间 */
	@Excel(name = "预计维修完成时间")
	private Date EstimatedEndTime;
	/** 更新时间 */
	@Excel(name = "更新时间")
	private Date UpdateTime;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateTime;
	/** 更新用户id */
	@Excel(name = "更新用户id")
	private Integer UpdateId;
	/** 创建用户id */
	@Excel(name = "创建用户id")
	private Integer CreateId;
	/** 状态 */
	@Excel(name = "状态")
	private Integer Status;
	/** 接单维修员ID */
	@Excel(name = "接单维修员ID")
	private Integer MaintUserId;
	/** 维修情况备注 */
	@Excel(name = "维修情况备注")
	private String MaintRemark;
}
