package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.OrderStateModel;
import com.jckjkj.mybatis.model.OrderStateModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderStateModelMapper {
    int countByExample(OrderStateModelExample example);

    int deleteByExample(OrderStateModelExample example);

    int deleteByPrimaryKey(Integer osid);

    int insert(OrderStateModel record);

    int insertSelective(OrderStateModel record);

    List<OrderStateModel> selectByExample(OrderStateModelExample example);

    OrderStateModel selectByPrimaryKey(Integer osid);

    int updateByExampleSelective(@Param("record") OrderStateModel record, @Param("example") OrderStateModelExample example);

    int updateByExample(@Param("record") OrderStateModel record, @Param("example") OrderStateModelExample example);

    int updateByPrimaryKeySelective(OrderStateModel record);

    int updateByPrimaryKey(OrderStateModel record);
}