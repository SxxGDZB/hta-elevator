package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	SubscribeLift表 SubscribeLift
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	SubscribeLift")
public class SubscribeLift
{
	/** 用户ID */
	@Excel(name = "用户ID")
	private Integer UserID;
	/** 电梯ID */
	@Excel(name = "电梯ID")
	private Integer LiftID;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateTime;
}
