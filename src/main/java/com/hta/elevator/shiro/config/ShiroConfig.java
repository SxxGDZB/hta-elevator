package com.hta.elevator.shiro.config;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.mgt.DefaultSessionStorageEvaluator;
import org.apache.shiro.mgt.DefaultSubjectDAO;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hta.elevator.shiro.filter.FilterChainManager;
import com.hta.elevator.shiro.filter.StatelessWebSubjectFactory;
import com.hta.elevator.shiro.matcher.JwtMatcher;
import com.hta.elevator.shiro.matcher.PasswordMatcher;
import com.hta.elevator.shiro.provider.AccountProvider;
import com.hta.elevator.shiro.realm.AonModularRealmAuthenticator;
import com.hta.elevator.shiro.realm.JwtRealm;
import com.hta.elevator.shiro.realm.PasswordRealm;
import com.hta.elevator.shiro.token.JwtToken;
import com.hta.elevator.shiro.token.PasswordToken;

/**
 * @author xin
 * @date 2020/7/13
 */
@Configuration
public class ShiroConfig {
    private Logger logger = LoggerFactory.getLogger(ShiroConfig.class);
    @Autowired
    PasswordMatcher passwordMatcher;
    @Autowired
    JwtMatcher jwtMatcher;
    @Autowired
    AccountProvider accountProvider;

    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager, FilterChainManager filterChainManager) {
        RestShiroFilterFactoryBean shiroFilterFactoryBean = new RestShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        shiroFilterFactoryBean.setFilters(filterChainManager.initGetFilters());
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainManager.initGetFilterChain());
        return shiroFilterFactoryBean;
    }

    @Bean
    public DefaultWebSecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setAuthenticator(new AonModularRealmAuthenticator());
        securityManager.setRealms(new ArrayList<>(Arrays.asList(
                jwtRealm(),
                passwordRealm()
        )));

        // 无状态subjectFactory设置
        DefaultSessionStorageEvaluator evaluator = (DefaultSessionStorageEvaluator) ((DefaultSubjectDAO) securityManager.getSubjectDAO()).getSessionStorageEvaluator();
        evaluator.setSessionStorageEnabled(Boolean.FALSE);
        StatelessWebSubjectFactory subjectFactory = new StatelessWebSubjectFactory();
        securityManager.setSubjectFactory(subjectFactory);

        SecurityUtils.setSecurityManager(securityManager);
        return securityManager;
    }


    @Bean
    public Realm jwtRealm() {
        JwtRealm jwtRealm = new JwtRealm();
        jwtRealm.setCredentialsMatcher(jwtMatcher);
        jwtRealm.setAuthenticationTokenClass(JwtToken.class);
        return jwtRealm;
    }

    @Bean
    public Realm passwordRealm() {
        PasswordRealm passwordRealm = new PasswordRealm();
        passwordRealm.setAccountProvider(accountProvider);
        passwordRealm.setCredentialsMatcher(passwordMatcher);
        passwordRealm.setAuthenticationTokenClass(PasswordToken.class);
        return  passwordRealm;
    }
}