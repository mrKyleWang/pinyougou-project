package com.pinyougou.sellergoods.service;

import com.pinyougou.entity.PageResult;
import com.pinyougou.pojo.TbSpecification;
import com.pinyougou.pojogroup.Specification;

import java.util.List;
import java.util.Map;

/**
 * 服务层接口
 * @author Kyle.Wang
 * 2018-03-13 23:27
 */
public interface SpecificationService {

	/**
	 * 返回全部列表
	 * @return
	 */
	List<TbSpecification> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	void add(Specification specification);
	
	
	/**
	 * 修改
	 */
	void update(Specification specification);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	Specification findOne(Long id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	void delete(Long[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	PageResult findPage(TbSpecification specification, int pageNum, int pageSize);
	
	
	List<Map> selectOptionList();
	
}
