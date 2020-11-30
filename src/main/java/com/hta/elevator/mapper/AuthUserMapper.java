package com.hta.elevator.mapper;

import com.hta.elevator.domain.AuthUser;
import java.util.List;	
import com.hta.elevator.common.mapper.BaseMapper;
/**
 * 用户 数据层
 * 
 * @author sxx
 * @date 2020-11-28
 */
public interface AuthUserMapper extends BaseMapper<AuthUser>
{

	/**
	 * 	根据名称查询
	 * @param username
	 * @return
	 */
	AuthUser selectByUsername(String username);
	/**
	 * 	根据用户ID查询用户角色信息
	 * @param uid
	 * @return
	 */
	String selectUserRoles(Integer uid);
	/**
	 * 	根据用户名查询用户角色
	 * @param username
	 * @return
	 */
	String selectUserRolesByUsername(String username);
	/**
	 * 	查询最大ID
	 * @return
	 */
	int selectMaxId();
	
	
}