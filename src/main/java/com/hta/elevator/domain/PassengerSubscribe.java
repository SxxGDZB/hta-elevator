package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	PassengerSubscribe	表 PassengerSubscribe
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	PassengerSubscribe	")
public class PassengerSubscribe
{
	/** ID */
	@Excel(name = "ID")
	private Integer Id;
	/** 电梯基本ID */
	@Excel(name = "电梯基本ID")
	private Integer LiftBaseId;
	/** 发布 */
	@Excel(name = "发布")
	private Integer Subscribe;
	/** 发布时间 */
	@Excel(name = "发布时间")
	private Date SubscribeTime;
	/** 发布结束时间 */
	@Excel(name = "发布结束时间")
	private Date UnsubscribeTime;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateTime;
	/** 修改时间 */
	@Excel(name = "修改时间")
	private Date UpdateTime;
}
