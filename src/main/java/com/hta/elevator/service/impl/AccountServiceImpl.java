package com.hta.elevator.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.hta.elevator.domain.AuthUser;
import com.hta.elevator.mapper.AuthUserMapper;
import com.hta.elevator.service.AccountService;
import com.hta.elevator.service.AuthUserService;
import com.hta.elevator.shiro.domain.Account;

/**
 * @author tomsun28
 * @date 22:04 2018/3/7
 */
@Service("AccountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AuthUserMapper authUserMapper;
    @Autowired 
    AuthUserService authUserService;

    @Override
    public Account loadAccount(Integer uid) throws DataAccessException {
        AuthUser user = authUserMapper.selectByPrimaryKey(uid);
        return user != null ? new Account(user.getUserName(), user.getPassword(), user.getSalt()) : null;
    }

    @Override
    public Account loadAccountByUsername(String username) throws DataAccessException {
        AuthUser user = authUserMapper.selectByName(username);
        return user != null ? new Account(user.getUserName(), user.getPassword(), user.getSalt()) : null;
    }

    @Override
    public boolean isAccountExistByUid(Integer uid) {
        AuthUser user = authUserMapper.selectByPrimaryKey(uid);
        return user != null ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override
    public AuthUser registerAccount(AuthUser account) throws DataAccessException {
    	if(authUserMapper.insertSelective(account)>0) {
    		// 给新用户授权访客角色
        	authUserService.authorityUserRole(account.getUID(), 103);
    		return account;
    	}else {
    		return null;
    	}
    }

    @Override
    public String loadAccountRole(Integer uid) throws DataAccessException {

        return authUserMapper.selectUserRoles(uid);
    }

    @Override
    public String loadAccountRoleByUsername(String username) throws DataAccessException {
        return authUserMapper.selectUserRolesByUsername(username);
    }
}
