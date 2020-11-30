package com.hta.elevator.service;
import com.hta.elevator.common.service.BaseService;
import com.hta.elevator.domain.AuthUser;
import java.util.List;

/**
 * 用户 服务层
 * 
 * @author sxx
 * @date 2020-11-28
 */
public interface AuthUserService extends BaseService<AuthUser>
{

	/**
	 * 	给新用户授权访客角色
	 * @param uid
	 * @param roleId
	 */
	boolean authorityUserRole(Integer uid, Integer roleId);
	
	
}
