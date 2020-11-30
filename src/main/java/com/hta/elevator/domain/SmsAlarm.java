package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	SmsAlarm	表 SmsAlarm
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	SmsAlarm	")
public class SmsAlarm
{
	/** ID */
	@Excel(name = "ID")
	private Long Id;
	/** 故障ID */
	@Excel(name = "故障ID")
	private Long FaultId;
	/** 是否已重置 */
	@Excel(name = "是否已重置")
	private Integer IsReset;
	/** SmsContent */
	@Excel(name = "SmsContent")
	private String SmsContent;
	/** MobileCount */
	@Excel(name = "MobileCount")
	private Integer MobileCount;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateTime;
	/** ResultCode */
	@Excel(name = "ResultCode")
	private String ResultCode;
	/** ResultMessage */
	@Excel(name = "ResultMessage")
	private String ResultMessage;
}
