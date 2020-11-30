package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	SmsAlarmUser	表 SmsAlarmUser
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	SmsAlarmUser	")
public class SmsAlarmUser
{
	/** ID */
	@Excel(name = "ID")
	private Long Id;
	/** SmsAlarmId */
	@Excel(name = "SmsAlarmId")
	private Long SmsAlarmId;
	/** 用户ID */
	@Excel(name = "用户ID")
	private Integer UserId;
	/** 电话 */
	@Excel(name = "电话")
	private String Phone;
	/** 发送时间 */
	@Excel(name = "发送时间")
	private Date SendTime;
	/** SmsId */
	@Excel(name = "SmsId")
	private String SmsId;
	/** 异常代码 */
	@Excel(name = "异常代码")
	private Integer ErrCode;
	/** 异常消息 */
	@Excel(name = "异常消息")
	private String ErrMsg;
}
