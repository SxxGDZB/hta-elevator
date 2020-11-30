package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	MContract	表 MContract
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	MContract	")
public class MContract
{
	/** ID */
	@Excel(name = "ID")
	private Long ID;
	/** McomID */
	@Excel(name = "McomID")
	private String McomID;
	/** PcomID */
	@Excel(name = "PcomID")
	private String PcomID;
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
