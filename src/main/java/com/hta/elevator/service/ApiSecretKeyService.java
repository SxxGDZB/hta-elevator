package com.hta.elevator.service;
import com.hta.elevator.common.service.BaseService;
import com.hta.elevator.domain.ApiSecretKey;

/**
 * 微信秘钥 服务层
 * 
 * @author sxx
 * @date 2020-11-30
 */
public interface ApiSecretKeyService extends BaseService<ApiSecretKey>
{
	/**
	 *	 根据userId、api查询密钥信息
	 * @param userId
	 * @param api
	 * @return
	 */
	ApiSecretKey selectByUserIdAndApi(Integer userId);
	
	
}
