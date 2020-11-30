package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	Mcompany	表 Mcompany
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	Mcompany	")
public class Mcompany
{
	/** ID */
	@Excel(name = "ID")
	private Integer Id;
	/** 磁芯存储器名称 */
	@Excel(name = "磁芯存储器名称")
	private String McomName;
	/** 信誉ID */
	@Excel(name = "信誉ID")
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
	/** 电话1 */
	@Excel(name = "电话1")
	private String Phone1;
	/** 联系人2 */
	@Excel(name = "联系人2")
	private String Contacts2;
	/** 电话2 */
	@Excel(name = "电话2")
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
