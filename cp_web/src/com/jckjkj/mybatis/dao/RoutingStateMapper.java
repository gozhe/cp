package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.RoutingState;
import com.jckjkj.mybatis.model.RoutingStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoutingStateMapper {
    int countByExample(RoutingStateExample example);

    int deleteByExample(RoutingStateExample example);

    int insert(RoutingState record);

    int insertSelective(RoutingState record);

    List<RoutingState> selectByExample(RoutingStateExample example);

    int updateByExampleSelective(@Param("record") RoutingState record, @Param("example") RoutingStateExample example);

    int updateByExample(@Param("record") RoutingState record, @Param("example") RoutingStateExample example);
}