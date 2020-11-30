package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 故障模型表 FailureCode
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "故障模型")
public class FailureCode
{
	/** ID */
	@Excel(name = "ID")
	private String ID;
	/** 控制器标识码 */
	@Excel(name = "控制器标识码")
	private String CtrlCode;
	/** 控制器类型 */
	@Excel(name = "控制器类型")
	private String CtrlType;
	/** 自定义ID */
	@Excel(name = "自定义ID")
	private String CustomerID;
	/** 主编码 */
	@Excel(name = "主编码")
	private Integer MainCode;
	/** 订阅编码 */
	@Excel(name = "订阅编码")
	private Integer SubCode;
	/** 故障类容 */
	@Excel(name = "故障类容")
	private String FaultContent;
	/** 故障原因 */
	@Excel(name = "故障原因")
	private String FaultCause;
	/** 修改时间 */
	@Excel(name = "修改时间")
	private Date UpdateTime;
}
