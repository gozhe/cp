package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.Fault;
import com.jckjkj.mybatis.model.FaultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FaultMapper {
    int countByExample(FaultExample example);

    int deleteByExample(FaultExample example);

    int insert(Fault record);

    int insertSelective(Fault record);

    List<Fault> selectByExample(FaultExample example);

    int updateByExampleSelective(@Param("record") Fault record, @Param("example") FaultExample example);

    int updateByExample(@Param("record") Fault record, @Param("example") FaultExample example);
}