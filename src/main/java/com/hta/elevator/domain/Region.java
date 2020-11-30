package com.hta.elevator.domain;
import com.hta.elevator.common.annotaion.EntityOperator;
import com.hta.elevator.common.annotaion.Excel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 中国行政区划表 Region
 * 
 * @author sxx
 * @date 2020-11-30
 */
@ToString
@Setter
@Getter
@EntityOperator(operatorNaem = "中国行政区划")
public class Region
{
	/** ID */
	@Excel(name = "ID")
	private Integer TID;
	/** 区划ID */
	@Excel(name = "区划ID")
	private Integer ID;
	/** 父级ID */
	@Excel(name = "父级ID")
	private Integer ParentID;
	/** 行政区划全称 */
	@Excel(name = "行政区划全称")
	private String Name;
	/** 省市区全称聚合 */
	@Excel(name = "省市区全称聚合")
	private String MergerName;
	/** 行政区划简称 */
	@Excel(name = "行政区划简称")
	private String ShortName;
	/** 行政区划简称聚合 */
	@Excel(name = "行政区划简称聚合")
	private String MergerShortName;
	/** 行政区划级别：country-国家，province-省份，city-市，district-区县，street-街道 */
	@Excel(name = "行政区划级别：country-国家，province-省份，city-市，district-区县，street-街道")
	private String Level;
	/** 级别：0-国家，1-省(直辖市)，2-市，3-区(县)，4-街道 */
	@Excel(name = "级别：0-国家，1-省(直辖市)，2-市，3-区(县)，4-街道")
	private Integer LevelType;
	/** ID路径（110000,110100,110105） */
	@Excel(name = "ID路径（110000,110100,110105）")
	private String ParentPath;
	/** 电话区号 */
	@Excel(name = "电话区号")
	private String TelCode;
	/** 邮编 */
	@Excel(name = "邮编")
	private String ZipCode;
	/** 拼音 */
	@Excel(name = "拼音")
	private String Pinyin;
	/** 简拼 */
	@Excel(name = "简拼")
	private String Jianpin;
	/** 首字母 */
	@Excel(name = "首字母")
	private String FirstChar;
	/** 城市中心点 */
	@Excel(name = "城市中心点")
	private String Center;
	/** 经度 */
	@Excel(name = "经度")
	private String Longitude;
	/** 纬度 */
	@Excel(name = "纬度")
	private String Latitude;
	/** 状态 1可修改 2不可修改 3已删除 */
	@Excel(name = "状态 1可修改 2不可修改 3已删除")
	private Integer Status;
	/** 历史版本 */
	@Excel(name = "历史版本")
	private String Version;
}
