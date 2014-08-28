package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.RoutingAudit;
import com.jckjkj.mybatis.model.RoutingAuditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoutingAuditMapper {
    int countByExample(RoutingAuditExample example);

    int deleteByExample(RoutingAuditExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoutingAudit record);

    int insertSelective(RoutingAudit record);

    List<RoutingAudit> selectByExample(RoutingAuditExample example);

    RoutingAudit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoutingAudit record, @Param("example") RoutingAuditExample example);

    int updateByExample(@Param("record") RoutingAudit record, @Param("example") RoutingAuditExample example);

    int updateByPrimaryKeySelective(RoutingAudit record);

    int updateByPrimaryKey(RoutingAudit record);
}