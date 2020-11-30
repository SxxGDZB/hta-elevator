package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	Manufacturer	表 Manufacturer
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	Manufacturer	")
public class Manufacturer
{
	/** 终端设备厂商编号 */
	@Excel(name = "终端设备厂商编号")
	private String ManufacturerCode;
	/** 终端设备厂商名称 */
	@Excel(name = "终端设备厂商名称")
	private String ManufacturerName;
}
