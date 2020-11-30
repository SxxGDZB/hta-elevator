package com.hta.elevator.domain;

	import java.util.Date;

import com.hta.elevator.common.annotaion.EntityOperator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 操作日志表 AuthOperationLog
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "操作日志")
public class AuthOperationLog extends BaseEntity
{
	/** 用户操作日志主键 */
	private Integer ID;
	/** 日志名称 */
	private String LogName;
	/** 用户id */
	private Integer UserId;
	/** api名称 */
	private String Api;
	/** 方法名称 */
	private String Method;
	/** 创建时间 */
	private Date CreateTime;
	/** 是否执行成功(0失败1成功) */
	private Integer Succeed;
	/** 具体消息备注 */
	private String Message;
}
