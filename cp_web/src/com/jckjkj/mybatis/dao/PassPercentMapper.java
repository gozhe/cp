package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.PassPercent;
import com.jckjkj.mybatis.model.PassPercentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PassPercentMapper {
    int countByExample(PassPercentExample example);

    int deleteByExample(PassPercentExample example);

    int insert(PassPercent record);

    int insertSelective(PassPercent record);

    List<PassPercent> selectByExample(PassPercentExample example);

    int updateByExampleSelective(@Param("record") PassPercent record, @Param("example") PassPercentExample example);

    int updateByExample(@Param("record") PassPercent record, @Param("example") PassPercentExample example);
}