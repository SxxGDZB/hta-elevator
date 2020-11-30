package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 固件表 Fireware
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "固件")
public class Fireware
{
	/** ID */
	@Excel(name = "ID")
	private Integer Id;
	/** 版本 */
	@Excel(name = "版本")
	private String Version;
	/** 分类 */
	@Excel(name = "分类")
	private Integer Category;
	/** 大小 */
	@Excel(name = "大小")
	private Integer Size;
	/** 备注 */
	@Excel(name = "备注")
	private String Remark;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateTime;
}
