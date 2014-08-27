package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.MobileStation;
import com.jckjkj.mybatis.model.MobileStationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MobileStationMapper {
    int countByExample(MobileStationExample example);

    int deleteByExample(MobileStationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MobileStation record);

    int insertSelective(MobileStation record);

    List<MobileStation> selectByExample(MobileStationExample example);

    MobileStation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MobileStation record, @Param("example") MobileStationExample example);

    int updateByExample(@Param("record") MobileStation record, @Param("example") MobileStationExample example);

    int updateByPrimaryKeySelective(MobileStation record);

    int updateByPrimaryKey(MobileStation record);
}