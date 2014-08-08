package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.OrderList;
import com.jckjkj.mybatis.model.OrderListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderListMapper {
    int countByExample(OrderListExample example);

    int deleteByExample(OrderListExample example);

    int deleteByPrimaryKey(String orderid);

    int insert(OrderList record);

    int insertSelective(OrderList record);

    List<OrderList> selectByExample(OrderListExample example);

    OrderList selectByPrimaryKey(String orderid);

    int updateByExampleSelective(@Param("record") OrderList record, @Param("example") OrderListExample example);

    int updateByExample(@Param("record") OrderList record, @Param("example") OrderListExample example);

    int updateByPrimaryKeySelective(OrderList record);

    int updateByPrimaryKey(OrderList record);
}