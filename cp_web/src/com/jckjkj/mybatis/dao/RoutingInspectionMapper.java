package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.RoutingInspection;
import com.jckjkj.mybatis.model.RoutingInspectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoutingInspectionMapper {
    int countByExample(RoutingInspectionExample example);

    int deleteByExample(RoutingInspectionExample example);

    int deleteByPrimaryKey(Long rouid);

    int insert(RoutingInspection record);

    int insertSelective(RoutingInspection record);

    List<RoutingInspection> selectByExample(RoutingInspectionExample example);

    RoutingInspection selectByPrimaryKey(Long rouid);

    int updateByExampleSelective(@Param("record") RoutingInspection record, @Param("example") RoutingInspectionExample example);

    int updateByExample(@Param("record") RoutingInspection record, @Param("example") RoutingInspectionExample example);

    int updateByPrimaryKeySelective(RoutingInspection record);

    int updateByPrimaryKey(RoutingInspection record);
}