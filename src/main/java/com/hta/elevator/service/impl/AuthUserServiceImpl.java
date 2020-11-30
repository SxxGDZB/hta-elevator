package com.hta.elevator.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import com.hta.elevator.mapper.AuthUserMapper;
import com.hta.elevator.mapper.AuthUserRoleMapper;
import com.hta.elevator.domain.AuthUser;
import com.hta.elevator.domain.AuthUserRole;
import com.hta.elevator.service.AuthUserService;
import com.hta.elevator.common.service.impl.BaseServiceImpl;
/**
 * 用户 服务层实现
 * 
 * @author sxx
 * @date 2020-11-28
 */
@Service
public class AuthUserServiceImpl extends BaseServiceImpl<AuthUser> implements AuthUserService 
{
	@Autowired
	private AuthUserMapper authUserMapper;

	@Autowired 
	AuthUserRoleMapper authUserRoleMapper;
	
	@Override
    public boolean authorityUserRole(Integer uid, Integer roleId) throws DataAccessException {
        AuthUserRole authUserRole = new AuthUserRole();
        authUserRole.setRoleId(roleId);
        authUserRole.setUserId(uid);
        authUserRole.setCreateTime(new Date());
        authUserRole.setUpdateTime(new Date());
        return authUserRoleMapper.insertSelective(authUserRole) == 1? Boolean.TRUE :Boolean.FALSE;
    }
	
}
