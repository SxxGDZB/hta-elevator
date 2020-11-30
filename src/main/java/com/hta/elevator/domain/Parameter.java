package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	Parameter	表 Parameter
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	Parameter	")
public class Parameter
{
	/** pmst */
	@Excel(name = "pmst")
	private String Pmst;
	/** pmky */
	@Excel(name = "pmky")
	private String Pmky;
	/** pmco */
	@Excel(name = "pmco")
	private String Pmco;
	/** pmnm */
	@Excel(name = "pmnm")
	private String Pmnm;
	/** pmv1 */
	@Excel(name = "pmv1")
	private String Pmv1;
	/** pmv2 */
	@Excel(name = "pmv2")
	private String Pmv2;
	/** pmv3 */
	@Excel(name = "pmv3")
	private String Pmv3;
	/** pmv4 */
	@Excel(name = "pmv4")
	private String Pmv4;
}
