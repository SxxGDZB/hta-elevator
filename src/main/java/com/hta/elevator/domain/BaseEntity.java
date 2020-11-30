package com.hta.elevator.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class BaseEntity {
	@ApiModelProperty(value = "用户ID",name = "UID",required = true,example = "1")
	public Integer UID;
}
