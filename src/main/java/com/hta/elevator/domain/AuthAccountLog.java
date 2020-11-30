package com.hta.elevator.domain;

	import java.util.Date;

import com.hta.elevator.common.annotaion.EntityOperator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 登录日志表 AuthAccountLog
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "登录登出日志")
public class AuthAccountLog extends BaseEntity
{
	/** 用户账户操作日志主键 */
	private Integer ID;
	/** 日志名称(login,register,logout) */
	private String LogName;
	/** 用户id */
	private Integer UserId;
	/** 创建时间 */
	private Date CreateTime;
	/** 是否执行成功(0失败1成功) */
	private Integer Succeed;
	/** 具体消息 */
	private String Message;
	/** 登录ip */
	private String Ip;
}
