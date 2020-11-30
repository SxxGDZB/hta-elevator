package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * Config表 Config
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "Config")
public class Config
{
	/** ID */
	@Excel(name = "ID")
	private Integer ID;
	/** ConfigKey */
	@Excel(name = "ConfigKey")
	private String ConfigKey;
	/** ConfigValue */
	@Excel(name = "ConfigValue")
	private String ConfigValue;
	/** 备注 */
	@Excel(name = "备注")
	private String Remark;
}
