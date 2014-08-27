package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.Auditopion;
import com.jckjkj.mybatis.model.AuditopionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuditopionMapper {
    int countByExample(AuditopionExample example);

    int deleteByExample(AuditopionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Auditopion record);

    int insertSelective(Auditopion record);

    List<Auditopion> selectByExample(AuditopionExample example);

    Auditopion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Auditopion record, @Param("example") AuditopionExample example);

    int updateByExample(@Param("record") Auditopion record, @Param("example") AuditopionExample example);

    int updateByPrimaryKeySelective(Auditopion record);

    int updateByPrimaryKey(Auditopion record);
}