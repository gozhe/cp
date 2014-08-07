package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.AuditopionModel;
import com.jckjkj.mybatis.model.AuditopionModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuditopionModelMapper {
    int countByExample(AuditopionModelExample example);

    int deleteByExample(AuditopionModelExample example);

    int deleteByPrimaryKey(Integer aoid);

    int insert(AuditopionModel record);

    int insertSelective(AuditopionModel record);

    List<AuditopionModel> selectByExample(AuditopionModelExample example);

    AuditopionModel selectByPrimaryKey(Integer aoid);

    int updateByExampleSelective(@Param("record") AuditopionModel record, @Param("example") AuditopionModelExample example);

    int updateByExample(@Param("record") AuditopionModel record, @Param("example") AuditopionModelExample example);

    int updateByPrimaryKeySelective(AuditopionModel record);

    int updateByPrimaryKey(AuditopionModel record);
}