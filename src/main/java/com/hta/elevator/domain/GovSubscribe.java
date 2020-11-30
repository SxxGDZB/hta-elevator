package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 订阅表 GovSubscribe
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "订阅")
public class GovSubscribe
{
	/** ID */
	@Excel(name = "ID")
	private Integer Id;
	/** 用户ID */
	@Excel(name = "用户ID")
	private Integer UserId;
	/** 电梯基本ID */
	@Excel(name = "电梯基本ID")
	private Integer LiftBaseId;
	/** 创建ID */
	@Excel(name = "创建ID")
	private Integer CreateId;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateTime;
}
