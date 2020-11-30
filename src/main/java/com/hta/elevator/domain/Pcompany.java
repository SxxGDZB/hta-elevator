package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	Pcompany	表 Pcompany
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	Pcompany	")
public class Pcompany
{
	/** ID */
	@Excel(name = "ID")
	private Integer Id;
	/** PcomName */
	@Excel(name = "PcomName")
	private String PcomName;
	/** CreditID */
	@Excel(name = "CreditID")
	private String CreditID;
	/** 省 */
	@Excel(name = "省")
	private String Province;
	/** 市 */
	@Excel(name = "市")
	private String City;
	/** 区 */
	@Excel(name = "区")
	private String Area;
	/** 办公地址 */
	@Excel(name = "办公地址")
	private String OfficeAddr;
	/** 办公电话 */
	@Excel(name = "办公电话")
	private String OfficePhone;
	/** 联系人1 */
	@Excel(name = "联系人1")
	private String Contacts1;
	/** 联系电话1 */
	@Excel(name = "联系电话1")
	private String Phone1;
	/** 联系人2 */
	@Excel(name = "联系人2")
	private String Contacts2;
	/** 联系电话2 */
	@Excel(name = "联系电话2")
	private String Phone2;
	/** 分组ID */
	@Excel(name = "分组ID")
	private Integer GroupId;
	/** 创建者ID */
	@Excel(name = "创建者ID")
	private Integer CreateId;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateTime;
	/** 修改者ID */
	@Excel(name = "修改者ID")
	private Integer UpdateId;
	/** 修改时间 */
	@Excel(name = "修改时间")
	private Date UpdateTime;
	/** 是否已删除 */
	@Excel(name = "是否已删除")
	private Integer IsDelete;
}
