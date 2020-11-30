/**  
 * 
 * @Title:  BaseMapper.java   
 * @Package com.gdzb.sys.mapper   
 * @Description:    TODO
 * @author: sxx     
 * @date:   2019年5月29日 上午11:12:57   
 * @version V1.0 
   *   注意：本内容仅限于507内部传阅，禁止外泄以及用于其他的商业目
 */  
package com.hta.elevator.common.mapper;

import java.util.List;
/**   
 * @ClassName:  BaseMapper   
 * @Description:TODO
 * @author: sxx
 * @date:   2019年5月29日 上午11:12:57   
 *     
   * 注意：本内容仅限507内部传阅，禁止外泄以及用于其他的商业目 
 */
public interface BaseMapper<T>{
		/**
	     * 查询全部(或者分页查询)
	     * @param record
	     * @return
	     */
	    List<T> selectListOrPage(T record);
	    /**
	     * 查询全部记录条数
	     * @param record
	     * @return
	     */
	    int selectListCount(T record);
	    /**
	     * 	根据ID查询
	     * @param id
	     * @return
	     */
	    T selectByPrimaryKey(Integer id);
	    /**
	     * 	根据实体类插入
	     * @param record
	     * @return
	     */
	    int insertSelective(T record);
	    /**
	     * 	选择性修改
	     * @param record
	     * @return
	     */
	    int updateByPrimaryKeySelective(T record);
		/**
		 * 	根据Key删除
		 * @param id
		 * @return
		 */
	 	int deleteByPrimaryKey(Integer id);
	    /**
	     * 根据名称查询
	     * @param name
	     * @return
	     */
	    T selectByName(String name);
	    /**
	     * 批量删除
	     * @param ids
	     * @return
	     */
	    int batchDeleteByIds(String [] ids);
	    /**
	     * 根据字段删除
	     * @param record
	     * @return
	     */
//	    int deleteByColumn(T record);
	    /**
	     * 批量修改根据实体类
	     * @param listRecord
	     * @return
	     */
//	    int batchUpdate(List<T> listRecord);
	    /**
	     * 批量插入
	     * @param listRecord
	     * @return
	     */
	    int batchInsert(List<T> listRecord);
	    
}
