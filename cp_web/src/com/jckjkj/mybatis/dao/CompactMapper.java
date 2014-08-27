package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.Compact;
import com.jckjkj.mybatis.model.CompactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompactMapper {
    int countByExample(CompactExample example);

    int deleteByExample(CompactExample example);

    int deleteByPrimaryKey(String id);

    int insert(Compact record);

    int insertSelective(Compact record);

    List<Compact> selectByExample(CompactExample example);

    Compact selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Compact record, @Param("example") CompactExample example);

    int updateByExample(@Param("record") Compact record, @Param("example") CompactExample example);

    int updateByPrimaryKeySelective(Compact record);

    int updateByPrimaryKey(Compact record);
}