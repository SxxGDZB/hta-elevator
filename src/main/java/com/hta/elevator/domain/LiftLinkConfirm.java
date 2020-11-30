package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * LiftLinkConfirm表 LiftLinkConfirm
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "LiftLinkConfirm")
public class LiftLinkConfirm
{
	/** ID */
	@Excel(name = "ID")
	private Integer Id;
	/** 分组ID */
	@Excel(name = "分组ID")
	private Integer GroupId;
	/** 连接分组ID */
	@Excel(name = "连接分组ID")
	private Integer LinkToGroupId;
	/** 电梯ID */
	@Excel(name = "电梯ID")
	private Integer LiftId;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateTime;
	/** 修改时间 */
	@Excel(name = "修改时间")
	private Date UpdateTime;
	/** 监测状态 */
	@Excel(name = "监测状态")
	private Integer ConfirmStatus;
	/** 修改的用户ID */
	@Excel(name = "修改的用户ID")
	private Integer UpdateUserId;
	/** 创建的用户ID */
	@Excel(name = "创建的用户ID")
	private Integer CreateUserId;
}
