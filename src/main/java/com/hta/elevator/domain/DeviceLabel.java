package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 设备标签表 DeviceLabel
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "设备标签")
public class DeviceLabel
{
	/** 设备序列号 */
	@Excel(name = "设备序列号")
	private Integer DeviceSn;
	/** LabelSn */
	@Excel(name = "LabelSn")
	private String LabelSn;
	/** ICCID */
	@Excel(name = "ICCID")
	private String Iccid;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateTime;
	/** 修改时间 */
	@Excel(name = "修改时间")
	private Date UpdateTime;
}
