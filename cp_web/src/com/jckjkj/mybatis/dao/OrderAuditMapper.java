package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.OrderAudit;
import com.jckjkj.mybatis.model.OrderAuditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderAuditMapper {
    int countByExample(OrderAuditExample example);

    int deleteByExample(OrderAuditExample example);

    int insert(OrderAudit record);

    int insertSelective(OrderAudit record);

    List<OrderAudit> selectByExample(OrderAuditExample example);

    int updateByExampleSelective(@Param("record") OrderAudit record, @Param("example") OrderAuditExample example);

    int updateByExample(@Param("record") OrderAudit record, @Param("example") OrderAuditExample example);
}