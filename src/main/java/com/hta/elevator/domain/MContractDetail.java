package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	MContractDetail	表 MContractDetail
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	MContractDetail	")
public class MContractDetail
{
	/** ID */
	@Excel(name = "ID")
	private Long ID;
	/** ContractID */
	@Excel(name = "ContractID")
	private Long ContractID;
	/** 电梯ID */
	@Excel(name = "电梯ID")
	private Integer LiftID;
	/** McomID */
	@Excel(name = "McomID")
	private String McomID;
	/** PcomID */
	@Excel(name = "PcomID")
	private String PcomID;
	/** 合同开始时间 */
	@Excel(name = "合同开始时间")
	private Date BeginTime;
	/** 合同结束时间 */
	@Excel(name = "合同结束时间")
	private Date EndTime;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateTime;
	/** 修改时间 */
	@Excel(name = "修改时间")
	private Date UpdateTime;
	/** 创建人 */
	@Excel(name = "创建人")
	private String CreatePerson;
	/** 修改人 */
	@Excel(name = "修改人")
	private String UpdatePerson;
}
