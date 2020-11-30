package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 微信秘钥表 ApiSecretKey
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "微信秘钥")
public class ApiSecretKey
{
	/** 自增id */
	@Excel(name = "自增id")
	private Long Id;
	/** 所属群组id */
	@Excel(name = "所属群组id")
	private Integer GroupId;
	/** 备注 */
	@Excel(name = "备注")
	private String Remark;
	/** secretkey */
	@Excel(name = "appid")
	private String AppId;
	/** appid */
	@Excel(name = "secretkey")
	private String SecretKey;
	/** 更新时间 */
	@Excel(name = "更新时间")
	private Date UpdateTime;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateTime;
	/** 创建者id */
	@Excel(name = "创建者id")
	private Integer UpdateUserId;
	/** 更新者id */
	@Excel(name = "更新者id")
	private Integer CreateUserId;
}
