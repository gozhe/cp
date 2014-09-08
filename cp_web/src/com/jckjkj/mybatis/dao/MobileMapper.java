package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.Department;
import com.jckjkj.mybatis.model.Mobile;
import com.jckjkj.mybatis.model.MobileExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface MobileMapper {
    int countByExample(MobileExample example);

    int deleteByExample(MobileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mobile record);

    int insertSelective(Mobile record);

    List<Mobile> selectByExample(MobileExample example);

    Mobile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mobile record, @Param("example") MobileExample example);

    int updateByExample(@Param("record") Mobile record, @Param("example") MobileExample example);

    int updateByPrimaryKeySelective(Mobile record);

    int updateByPrimaryKey(Mobile record);
    
    @Select("select * from x_mobile limit #{1} offset #{0}")
    List<Mobile> selectByLimit(int start,int rows);
}