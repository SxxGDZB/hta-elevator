package com.hta.elevator.domain;

	import java.util.Date;

import com.hta.elevator.common.annotaion.EntityOperator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 用户表 AuthUser
 * 
 * @author sxx
 * @date 2020-11-28
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "用户")
public class AuthUser
{
	/** uid,用户账号,主键 */
	private Integer UID;
	/** 用户名(nick_name) */
	private String UserName;
	/** 密码(MD5(密码+盐)) */
	private String Password;
	/** 盐 */
	private String Salt;
	/** 用户真名 */
	private String RealName;
	/** 头像 */
	private String Avatar;
	/** 电话号码(唯一) */
	private String Phone;
	/** 邮件地址(唯一) */
	private String Email;
	/** 性别(1.男 2.女) */
	private Integer Sex;
	/** 账户状态(1.正常 2.锁定 3.删除 4.非法) */
	private Integer Status;
	/** 创建时间 */
	private Date CreateTime;
	/** 更新时间 */
	private Date UpdateTime;
	/** 创建来源(1.web 2.android 3.ios 4.win 5.macos 6.ubuntu) */
	private Integer CreateWhere;
	/** 0管理员 1用户 */
	private Integer IsAdmin;
	/** 分组ID列表 */
	private String GroupIds;
	/** 用户的唯一标识 */
	private String OpenId;
	/** 同一用户，对同一个微信开放平台下的不同应用，UnionID是相同的 */
	private String UnionId;
	
	
}
