package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	bak_EMU_0415表 bak_EMU_0415
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	bak_EMU_0415")
public class BakEmu0415
{
	/** ID */
	@Excel(name = "ID")
	private Integer Id;
	/** IMEI */
	@Excel(name = "IMEI")
	private String IMEI;
	/** 出厂序列号 */
	@Excel(name = "出厂序列号")
	private String FactorySn;
	/** 出厂时间 */
	@Excel(name = "出厂时间")
	private Date FactoryTime;
	/** 设备ID */
	@Excel(name = "设备ID")
	private Integer DeviceId;
	/** Mobile */
	@Excel(name = "Mobile")
	private String Mobile;
	/** SIM */
	@Excel(name = "SIM")
	private String SIM;
	/** VH */
	@Excel(name = "VH")
	private String VH;
	/** VS */
	@Excel(name = "VS")
	private String VS;
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
	/** 电梯ID */
	@Excel(name = "电梯ID")
	private Integer LiftId;
}
