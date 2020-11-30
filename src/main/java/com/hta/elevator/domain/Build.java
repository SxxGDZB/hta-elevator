package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 楼盘表 Build
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "楼盘")
public class Build
{
	/** ID */
	@Excel(name = "ID")
	private Integer Id;
	/** 楼盘名称 */
	@Excel(name = "楼盘名称")
	private String BuildName;
	/** 楼盘类型 */
	@Excel(name = "楼盘类型")
	private String BuildType;
	/** 省份 */
	@Excel(name = "省份")
	private String Province;
	/** 城市 */
	@Excel(name = "城市")
	private String City;
	/** 区县 */
	@Excel(name = "区县")
	private String Area;
	/** 详细地址 */
	@Excel(name = "详细地址")
	private String Addr;
	/** 联系人1 */
	@Excel(name = "联系人1")
	private String Contacts1;
	/** 联系人1手机号 */
	@Excel(name = "联系人1手机号")
	private String Phone1;
	/** 联系人2 */
	@Excel(name = "联系人2")
	private String Contacts2;
	/** 联系人2手机号 */
	@Excel(name = "联系人2手机号")
	private String Phone2;
	/** 群组ID */
	@Excel(name = "群组ID")
	private Integer GroupId;
	/** 创建者ID */
	@Excel(name = "创建者ID")
	private Integer CreateId;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateTime;
	/** 更新者ID */
	@Excel(name = "更新者ID")
	private Integer UpdateId;
	/** 更新时间 */
	@Excel(name = "更新时间")
	private Date UpdateTime;
	/** 是否已删除 */
	@Excel(name = "是否已删除")
	private Integer IsDelete;
}
