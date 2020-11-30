package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	Passenger	表 Passenger
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	Passenger	")
public class Passenger
{
	/** ID */
	@Excel(name = "ID")
	private Integer Id;
	/** Mobile */
	@Excel(name = "Mobile")
	private String Mobile;
	/** 密码 */
	@Excel(name = "密码")
	private String Password;
	/** UnionId */
	@Excel(name = "UnionId")
	private String UnionId;
	/** WxOpenId */
	@Excel(name = "WxOpenId")
	private String WxOpenId;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateTime;
	/** 修改时间 */
	@Excel(name = "修改时间")
	private Date UpdateTime;
}
