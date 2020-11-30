package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * EMU表 EMU
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "EMU")
public class EMU
{
	/** 主键 */
	@Excel(name = "主键")
	private Integer Id;
	/** 条形码 */
	@Excel(name = "条形码")
	private String IMEI;
	/** 出厂序列号 */
	@Excel(name = "出厂序列号")
	private String FactorySn;
	/** 出厂时间 */
	@Excel(name = "出厂时间")
	private Date FactoryTime;
	/** 设备码 */
	@Excel(name = "设备码")
	private Integer DeviceId;
	/** sim卡手机号 */
	@Excel(name = "sim卡手机号")
	private String Mobile;
	/** sim卡码 */
	@Excel(name = "sim卡码")
	private String SIM;
	/** 硬件版本号 */
	@Excel(name = "硬件版本号")
	private String VH;
	/** 软件版本号 */
	@Excel(name = "软件版本号")
	private String VS;
	/** 所属组Id */
	@Excel(name = "所属组Id")
	private Integer GroupId;
	/** 创建者Id */
	@Excel(name = "创建者Id")
	private Integer CreateId;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateTime;
	/** 更新者Id */
	@Excel(name = "更新者Id")
	private Integer UpdateId;
	/** 更新时间 */
	@Excel(name = "更新时间")
	private Date UpdateTime;
	/** 绑定电梯Id */
	@Excel(name = "绑定电梯Id")
	private Integer LiftId;
	/** 是否有摄像头 */
	@Excel(name = "是否有摄像头")
	private Integer HasCamera;
}
