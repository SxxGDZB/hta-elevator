package com.hta.elevator.shiro.provider.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hta.elevator.mapper.AuthResourceMapper;
import com.hta.elevator.shiro.provider.ShiroFilterRulesProvider;
import com.hta.elevator.shiro.rule.RolePermRule;

import java.util.List;

/**
 * @author tomsun28
 * @date 16:46 2018/3/7
 */
@Service("ShiroFilterRulesProvider")
public class ShiroFilterRulesProviderImpl implements ShiroFilterRulesProvider {

    @Autowired
    private AuthResourceMapper authResourceMapper;

    @Override
    public List<RolePermRule> loadRolePermRules() {

        return authResourceMapper.selectRoleRules();
    }

}
