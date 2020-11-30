/**  
 * 
 * @Title:  BaseServiceImpl.java   
 * @Package com.gdzb.sys.service.impl   
 * @Description:    TODO
 * @author: sxx     
 * @date:   2019年5月29日 上午11:10:46   
 * @version V1.0 
   *   注意：本内容仅限于507内部传阅，禁止外泄以及用于其他的商业目
 */  
package com.hta.elevator.common.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.hta.elevator.common.mapper.BaseMapper;
import com.hta.elevator.common.service.BaseService;




/**   
 * @ClassName:  BaseServiceImpl   
 * @Description:TODO
 * @author: sxx
 * @date:   2019年5月29日 上午11:10:46   
 *     
   * 注意：本内容仅限507内部传阅，禁止外泄以及用于其他的商业目 
 */
public class BaseServiceImpl<T> implements BaseService<T>{
	@Autowired
	protected BaseMapper<T> baseMapper;

	@Override
	public List<T> selectListOrPage(T record) {
		
		// TODO Auto-generated method stub
		return baseMapper.selectListOrPage(record);
	}

	@Override
	public T selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return baseMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insertSelective(T record) {
		// TODO Auto-generated method stub
		return baseMapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(T record) {
		// TODO Auto-generated method stub
		return baseMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return baseMapper.deleteByPrimaryKey(id);
	}

	@Override
	public T selectByName(String name) {
		// TODO Auto-generated method stub
		return baseMapper.selectByName(name);
	}

	@Override
	public int batchDeleteByIds(String[] ids) {
		// TODO Auto-generated method stub
		return baseMapper.batchDeleteByIds(ids);
	}

	@Override
	public int batchInsert(List<T> listRecord) {
		// TODO Auto-generated method stub
		return baseMapper.batchInsert(listRecord);
	}
	
}
