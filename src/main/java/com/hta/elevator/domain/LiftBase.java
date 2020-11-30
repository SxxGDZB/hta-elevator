package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 电梯基础表 LiftBase
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "电梯基础")
public class LiftBase
{
	/** LiftBaseId */
	@Excel(name = "LiftBaseId")
	private Integer LiftBaseId;
	/** 注册码 */
	@Excel(name = "注册码")
	private String RegisterCode;
	/** 制造厂 */
	@Excel(name = "制造厂")
	private String Manufacturer;
	/** 省 */
	@Excel(name = "省")
	private String Province;
	/** 市 */
	@Excel(name = "市")
	private String City;
	/** 区 */
	@Excel(name = "区")
	private String Area;
	/** 详细地址 */
	@Excel(name = "详细地址")
	private String Address;
	/** 创建者ID */
	@Excel(name = "创建者ID")
	private Integer CreateId;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateTime;
	/** 修改者ID */
	@Excel(name = "修改者ID")
	private Integer UpdateId;
	/** 修改时间 */
	@Excel(name = "修改时间")
	private Date UpdateTime;
	/** 是否失效 */
	@Excel(name = "是否失效")
	private Integer Enabled;
	/** 图片路径 */
	@Excel(name = "图片路径")
	private String ImagePath;
}
