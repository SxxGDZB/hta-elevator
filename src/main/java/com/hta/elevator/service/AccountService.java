package com.hta.elevator.service;

import com.hta.elevator.domain.AuthUser;
import com.hta.elevator.shiro.domain.Account;

/**
 * @author tomsun28
 * @date 22:02 2018/3/7
 */
public interface AccountService {

    /**
     * description TODO
     *
     * @param uid 1
     * @return com.kiwihouse.domain.vo.Account
     */
    Account loadAccount(Integer uid);


    Account loadAccountByUsername(String username);

    /**
     * description TODO
     *
     * @param uid 1
     * @return boolean
     */
    boolean isAccountExistByUid(Integer uid);

    /**
     * description TODO
     *
     * @param account 1
     * @return boolean
     */
    AuthUser registerAccount(AuthUser account);

    /**
     * description TODO
     *
     * @param uid 1
     * @return java.lang.String
     */
    String loadAccountRole(Integer uid);

    /**
     * description TODO
     *
     * @param uid 1
     * @return java.lang.String
     */
    String loadAccountRoleByUsername(String username);
}
