package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.RoutingInspection;
import com.jckjkj.mybatis.model.RoutingInspectionExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface RoutingInspectionMapper {
    int countByExample(RoutingInspectionExample example);

    int deleteByExample(RoutingInspectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoutingInspection record);

    int insertSelective(RoutingInspection record);

    List<RoutingInspection> selectByExample(RoutingInspectionExample example);

    RoutingInspection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoutingInspection record, @Param("example") RoutingInspectionExample example);

    int updateByExample(@Param("record") RoutingInspection record, @Param("example") RoutingInspectionExample example);

    int updateByPrimaryKeySelective(RoutingInspection record);

    int updateByPrimaryKey(RoutingInspection record);
    
    @Select("select * from x_routinginspection limit #{1} offset #{0}")
    List<RoutingInspection> selectByLimit(int start,int rows);
}