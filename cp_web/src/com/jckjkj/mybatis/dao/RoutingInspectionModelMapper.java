package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.RoutingInspectionModel;
import com.jckjkj.mybatis.model.RoutingInspectionModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoutingInspectionModelMapper {
    int countByExample(RoutingInspectionModelExample example);

    int deleteByExample(RoutingInspectionModelExample example);

    int deleteByPrimaryKey(Long rouid);

    int insert(RoutingInspectionModel record);

    int insertSelective(RoutingInspectionModel record);

    List<RoutingInspectionModel> selectByExample(RoutingInspectionModelExample example);

    RoutingInspectionModel selectByPrimaryKey(Long rouid);

    int updateByExampleSelective(@Param("record") RoutingInspectionModel record, @Param("example") RoutingInspectionModelExample example);

    int updateByExample(@Param("record") RoutingInspectionModel record, @Param("example") RoutingInspectionModelExample example);

    int updateByPrimaryKeySelective(RoutingInspectionModel record);

    int updateByPrimaryKey(RoutingInspectionModel record);
}