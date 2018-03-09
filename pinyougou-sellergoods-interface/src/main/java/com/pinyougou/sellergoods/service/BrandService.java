package com.pinyougou.sellergoods.service;

import com.pinyougou.entity.PageResult;
import com.pinyougou.pojo.TbBrand;

import java.util.List;

/**
 * @author Kyle.Wang
 * 2018-03-08 21:01
 */
public interface BrandService {

    /**
     * 查询所有
     *
     * @return
     */
    List<TbBrand> findAll();

    /**
     * 返回分页列表
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageResult findPage(int pageNum, int pageSize);

    /**
     * 添加
     * @param brand
     */
    void add(TbBrand brand);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    TbBrand findOne(Long id);

    /**
     * 更新
     * @param brand
     */
    void update(TbBrand brand);

}
