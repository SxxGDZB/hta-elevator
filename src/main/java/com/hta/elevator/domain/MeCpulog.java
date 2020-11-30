package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	ME_CpuLog	表 ME_CpuLog
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	ME_CpuLog	")
public class MeCpulog
{
	/** ID */
	@Excel(name = "ID")
	private Integer ID;
	/** CpuID */
	@Excel(name = "CpuID")
	private String CpuID;
	/** 项目 */
	@Excel(name = "项目")
	private String Event;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateDate;
}
