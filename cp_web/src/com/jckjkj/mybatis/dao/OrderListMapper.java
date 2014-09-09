package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.OrderList;
import com.jckjkj.mybatis.model.OrderListExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface OrderListMapper {
    int countByExample(OrderListExample example);

    int deleteByExample(OrderListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderList record);

    int insertSelective(OrderList record);

    List<OrderList> selectByExample(OrderListExample example);

    OrderList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderList record, @Param("example") OrderListExample example);

    int updateByExample(@Param("record") OrderList record, @Param("example") OrderListExample example);

    int updateByPrimaryKeySelective(OrderList record);

    int updateByPrimaryKey(OrderList record);
    
    @Select("select t.* from x_orderlist t where t.equid in(select t1.com_id from t_camera t1,x_mobile_station t2 where t1.station_id = t2.stationid")
    List<OrderList> selectByMobileId(String mid);
    
    @Select("select * from x_orderlist limit #{0} offset #{1}")
    List<OrderList> selectByLimit(int start,int rows);
}