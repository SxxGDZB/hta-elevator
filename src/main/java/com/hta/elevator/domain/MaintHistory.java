package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	MaintHistory	表 MaintHistory
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	MaintHistory	")
public class MaintHistory
{
	/** ID */
	@Excel(name = "ID")
	private Long Id;
	/** 报告ID */
	@Excel(name = "报告ID")
	private Long ReportId;
	/** 电梯基本ID */
	@Excel(name = "电梯基本ID")
	private Integer LiftBaseId;
	/** 电梯ID */
	@Excel(name = "电梯ID")
	private Integer LiftId;
	/** 用户ID */
	@Excel(name = "用户ID")
	private Integer UserId;
	/**  */
	@Excel(name = "")
	private String McomName;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateTime;
	/** 修改时间 */
	@Excel(name = "修改时间")
	private Date UpdateTime;
	/** 类容类型 */
	@Excel(name = "类容类型")
	private Integer ContentType;
	/** 正常运行时间 */
	@Excel(name = "正常运行时间")
	private Date NormalMainTtime;
	/** 维修时间 */
	@Excel(name = "维修时间")
	private Date MaintTime;
	/** 保养时间 */
	@Excel(name = "保养时间")
	private Date MakeupTime;
	/** 建议 */
	@Excel(name = "建议")
	private String Suggest;
	/** 维修员 */
	@Excel(name = "维修员")
	private String MaintStaff;
	/** 用户意见 */
	@Excel(name = "用户意见")
	private String UseorgOpinion;
	/**  */
	@Excel(name = "")
	private Date UseorgConTime;
	/**  */
	@Excel(name = "")
	private String UseorgStaff;
	/**  */
	@Excel(name = "")
	private Integer ReportStatus;
	/**  */
	@Excel(name = "")
	private String MaintRemark;
	/**  */
	@Excel(name = "")
	private String MaintImage;
	/**  */
	@Excel(name = "")
	private Integer Hm1;
	/**  */
	@Excel(name = "")
	private Integer Hm2;
	/**  */
	@Excel(name = "")
	private Integer Hm3;
	/**  */
	@Excel(name = "")
	private Integer Hm4;
	/**  */
	@Excel(name = "")
	private Integer Hm5;
	/**  */
	@Excel(name = "")
	private Integer Hm6;
	/**  */
	@Excel(name = "")
	private Integer Hm7;
	/**  */
	@Excel(name = "")
	private Integer Hm8;
	/**  */
	@Excel(name = "")
	private Integer Hm9;
	/**  */
	@Excel(name = "")
	private Integer Hm10;
	/**  */
	@Excel(name = "")
	private Integer Hm11;
	/**  */
	@Excel(name = "")
	private Integer Hm12;
	/**  */
	@Excel(name = "")
	private Integer Hm13;
	/**  */
	@Excel(name = "")
	private Integer Hm14;
	/**  */
	@Excel(name = "")
	private Integer Hm15;
	/**  */
	@Excel(name = "")
	private Integer Hm16;
	/**  */
	@Excel(name = "")
	private Integer Hm17;
	/**  */
	@Excel(name = "")
	private Integer Hm18;
	/**  */
	@Excel(name = "")
	private Integer Hm19;
	/**  */
	@Excel(name = "")
	private Integer Hm20;
	/**  */
	@Excel(name = "")
	private Integer Hm21;
	/**  */
	@Excel(name = "")
	private Integer Hm22;
	/**  */
	@Excel(name = "")
	private Integer Hm23;
	/**  */
	@Excel(name = "")
	private Integer Hm24;
	/**  */
	@Excel(name = "")
	private Integer Hm25;
	/**  */
	@Excel(name = "")
	private Integer Hm26;
	/**  */
	@Excel(name = "")
	private Integer Hm27;
	/**  */
	@Excel(name = "")
	private Integer Hm28;
	/**  */
	@Excel(name = "")
	private Integer Hm29;
	/**  */
	@Excel(name = "")
	private Integer Hm30;
	/**  */
	@Excel(name = "")
	private Integer Hm31;
	/**  */
	@Excel(name = "")
	private Integer Qtr1;
	/**  */
	@Excel(name = "")
	private Integer Qtr2;
	/**  */
	@Excel(name = "")
	private Integer Qtr3;
	/**  */
	@Excel(name = "")
	private Integer Qtr4;
	/**  */
	@Excel(name = "")
	private Integer Qtr5;
	/**  */
	@Excel(name = "")
	private Integer Qtr6;
	/**  */
	@Excel(name = "")
	private Integer Qtr7;
	/**  */
	@Excel(name = "")
	private Integer Qtr8;
	/**  */
	@Excel(name = "")
	private Integer Qtr9;
	/**  */
	@Excel(name = "")
	private Integer Qtr10;
	/**  */
	@Excel(name = "")
	private Integer Qtr11;
	/**  */
	@Excel(name = "")
	private Integer Qtr12;
	/**  */
	@Excel(name = "")
	private Integer Qtr13;
	/**  */
	@Excel(name = "")
	private Integer Hy1;
	/**  */
	@Excel(name = "")
	private Integer Hy2;
	/**  */
	@Excel(name = "")
	private Integer Hy3;
	/**  */
	@Excel(name = "")
	private Integer Hy4;
	/**  */
	@Excel(name = "")
	private Integer Hy5;
	/**  */
	@Excel(name = "")
	private Integer Hy6;
	/**  */
	@Excel(name = "")
	private Integer Hy7;
	/**  */
	@Excel(name = "")
	private Integer Hy8;
	/**  */
	@Excel(name = "")
	private Integer Hy9;
	/**  */
	@Excel(name = "")
	private Integer Hy10;
	/**  */
	@Excel(name = "")
	private Integer Hy11;
	/**  */
	@Excel(name = "")
	private Integer Hy12;
	/**  */
	@Excel(name = "")
	private Integer Hy13;
	/**  */
	@Excel(name = "")
	private Integer Hy14;
	/**  */
	@Excel(name = "")
	private Integer Hy15;
	/**  */
	@Excel(name = "")
	private Integer Y1;
	/**  */
	@Excel(name = "")
	private Integer Y2;
	/**  */
	@Excel(name = "")
	private Integer Y3;
	/**  */
	@Excel(name = "")
	private Integer Y4;
	/**  */
	@Excel(name = "")
	private Integer Y5;
	/**  */
	@Excel(name = "")
	private Integer Y6;
	/**  */
	@Excel(name = "")
	private Integer Y7;
	/**  */
	@Excel(name = "")
	private Integer Y8;
	/**  */
	@Excel(name = "")
	private Integer Y9;
	/**  */
	@Excel(name = "")
	private Integer Y10;
	/**  */
	@Excel(name = "")
	private Integer Y11;
	/**  */
	@Excel(name = "")
	private Integer Y12;
	/**  */
	@Excel(name = "")
	private Integer Y13;
	/**  */
	@Excel(name = "")
	private Integer Y14;
	/**  */
	@Excel(name = "")
	private Integer Y15;
	/**  */
	@Excel(name = "")
	private Integer Y16;
	/**  */
	@Excel(name = "")
	private Integer Y17;
}
