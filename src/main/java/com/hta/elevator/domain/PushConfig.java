package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;
	import java.util.Date;
    
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 	PushConfig	表 PushConfig
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "	PushConfig	")
public class PushConfig
{
	/** ID */
	@Excel(name = "ID")
	private Integer Id;
	/** 分组ID */
	@Excel(name = "分组ID")
	private Integer GroupId;
	/** 角色ID */
	@Excel(name = "角色ID")
	private Integer RoleId;
	/** UnitId */
	@Excel(name = "UnitId")
	private Integer UnitId;
	/** WxPushExclude */
	@Excel(name = "WxPushExclude")
	private String WxPushExclude;
	/** SmsPushExclude */
	@Excel(name = "SmsPushExclude")
	private String SmsPushExclude;
	/** AppPushExclude */
	@Excel(name = "AppPushExclude")
	private String AppPushExclude;
	/** 创建者 */
	@Excel(name = "创建者")
	private Integer CreateId;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date CreateTime;
	/** 修改者 */
	@Excel(name = "修改者")
	private Integer UpdateId;
	/** 修改时间 */
	@Excel(name = "修改时间")
	private Date UpdateTime;
}
