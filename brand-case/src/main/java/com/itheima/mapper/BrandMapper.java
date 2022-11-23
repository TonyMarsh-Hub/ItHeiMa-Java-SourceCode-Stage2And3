package com.itheima.mapper;

import com.itheima.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BrandMapper {

    /**
     * 查询所有
     *
     * @return
     */
    @Select("select * from tb_brand")
    @ResultMap("brandResultMap")
    List<Brand> selectAll();

    /**
     * 添加数据
     *
     * @param brand
     */
    @Insert("insert into tb_brand values(null,#{brandName},#{companyName},#{ordered},#{description},#{status})")
    void add(Brand brand);

    /**
     * 根据id进行批量删除
     *
     * @param ids 传递的多个id
     */
    void deleteByIds(@Param("ids") int[] ids);

    /**
     * 分页查询
     *
     * @param start 开始位置
     * @param rows  每页显示的条数
     * @return
     */
    @Select("select * from tb_brand limit #{start},#{rows}")
    List<Brand> selectByPage(@Param("start") int start, @Param("rows") int rows);

    /**
     * 查询总条数
     *
     * @return
     */
    @Select("select count(*) from tb_brand")
    int selectTotalCount();

}
