package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	ME_License	表 ME_License
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	ME_License	")
public class MeLicense
{
	/** LicenseKey */
	@Excel(name = "LicenseKey")
	private String LicenseKey;
	/** 顾客ID */
	@Excel(name = "顾客ID")
	private String CustomerID;
	/** 授权数量 */
	@Excel(name = "授权数量")
	private Integer LicenseNum;
	/** SN0 */
	@Excel(name = "SN0")
	private Integer SN0;
	/** SN1 */
	@Excel(name = "SN1")
	private Integer SN1;
	/** 已授权数量 */
	@Excel(name = "已授权数量")
	private Integer Licensed;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateDate;
	/** 修改时间 */
	@Excel(name = "修改时间")
	private Date UpdateDate;
	/** 创建者 */
	@Excel(name = "创建者")
	private String CreateBy;
	/** 修改者 */
	@Excel(name = "修改者")
	private String UpdateBy;
}
