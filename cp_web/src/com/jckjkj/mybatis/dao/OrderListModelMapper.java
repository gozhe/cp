package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.OrderListModel;
import com.jckjkj.mybatis.model.OrderListModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderListModelMapper {
    int countByExample(OrderListModelExample example);

    int deleteByExample(OrderListModelExample example);

    int deleteByPrimaryKey(String orderid);

    int insert(OrderListModel record);

    int insertSelective(OrderListModel record);

    List<OrderListModel> selectByExample(OrderListModelExample example);

    OrderListModel selectByPrimaryKey(String orderid);

    int updateByExampleSelective(@Param("record") OrderListModel record, @Param("example") OrderListModelExample example);

    int updateByExample(@Param("record") OrderListModel record, @Param("example") OrderListModelExample example);

    int updateByPrimaryKeySelective(OrderListModel record);

    int updateByPrimaryKey(OrderListModel record);
}