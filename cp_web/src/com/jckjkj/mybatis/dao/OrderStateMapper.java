package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.OrderState;
import com.jckjkj.mybatis.model.OrderStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderStateMapper {
    int countByExample(OrderStateExample example);

    int deleteByExample(OrderStateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderState record);

    int insertSelective(OrderState record);

    List<OrderState> selectByExample(OrderStateExample example);

    OrderState selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderState record, @Param("example") OrderStateExample example);

    int updateByExample(@Param("record") OrderState record, @Param("example") OrderStateExample example);

    int updateByPrimaryKeySelective(OrderState record);

    int updateByPrimaryKey(OrderState record);
}