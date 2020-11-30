package com.hta.elevator.controller.account.params;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class WeChatLogin {

	private String code;
	private String appKey;
}
