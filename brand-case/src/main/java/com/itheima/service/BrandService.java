package com.itheima.service;

import com.itheima.pojo.Brand;

import java.util.List;

public interface BrandService {

    /**
     * 查询所有
     *
     * @return
     */
    List<Brand> selectAll();

    /**
     * 添加数据
     *
     * @param brand
     */
    void add(Brand brand);

    /**
     * 根据id进行批量删除
     *
     * @param ids 传递的多个id
     */
    void deleteByIds(int[] ids);
}
