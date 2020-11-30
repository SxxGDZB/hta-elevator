package com.hta.elevator.mapper;

import com.hta.elevator.domain.AuthResource;
import com.hta.elevator.shiro.rule.RolePermRule;

import java.util.List;

import org.springframework.context.annotation.Primary;

import com.hta.elevator.common.mapper.BaseMapper;
/**
 * 资源(菜单,资源) 数据层
 * 
 * @author sxx
 * @date 2020-11-28
 */
@Primary
public interface AuthResourceMapper extends BaseMapper<AuthResource>
{

	/**
	 * 
	 * @return
	 */
	List<RolePermRule> selectRoleRules();
	
	
}