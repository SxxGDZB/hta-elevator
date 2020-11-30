package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	ME_Customer表 ME_Customer
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	ME_Customer")
public class MeCustomer
{
	/** 顾客ID */
	@Excel(name = "顾客ID")
	private String CustomerID;
	/** 顾客名称 */
	@Excel(name = "顾客名称")
	private String CustomerName;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateDate;
	/** 修改时间 */
	@Excel(name = "修改时间")
	private Date UpdateDate;
}
