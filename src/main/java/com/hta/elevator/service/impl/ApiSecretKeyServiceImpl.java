package com.hta.elevator.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.ApiSecretKeyMapper;
import com.hta.elevator.domain.ApiSecretKey;
import com.hta.elevator.service.ApiSecretKeyService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 微信秘钥 服务层实现
 * 
 * @author sxx
 * @date 2020-11-30
 */
@Service
public class ApiSecretKeyServiceImpl extends BaseServiceImpl<ApiSecretKey> implements ApiSecretKeyService 
{
	@Autowired
	private ApiSecretKeyMapper apiSecretKeyMapper;

	@Override
	public ApiSecretKey selectByUserIdAndApi(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
