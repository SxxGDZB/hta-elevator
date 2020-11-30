package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	ME_Device	表 ME_Device
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	ME_Device	")
public class MeDevice
{
	/** 设备序列号 */
	@Excel(name = "设备序列号")
	private Integer DeviceSN;
	/** 所属客户 */
	@Excel(name = "所属客户")
	private String CustomerID;
	/** LicenseKey */
	@Excel(name = "LicenseKey")
	private String LicenseKey;
	/** 出厂唯一ID */
	@Excel(name = "出厂唯一ID")
	private String IDCode;
	/** VH */
	@Excel(name = "VH")
	private String VH;
	/** VS */
	@Excel(name = "VS")
	private String VS;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateDate;
	/** 移动电话 */
	@Excel(name = "移动电话")
	private String Mobile;
}
