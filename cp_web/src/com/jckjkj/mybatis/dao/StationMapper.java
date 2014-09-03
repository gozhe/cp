package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.Station;
import com.jckjkj.mybatis.model.StationExample;
import com.jckjkj.utils.TreeJson;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface StationMapper {
    int countByExample(StationExample example);

    int deleteByExample(StationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Station record);

    int insertSelective(Station record);

    List<Station> selectByExample(StationExample example);

    Station selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Station record, @Param("example") StationExample example);

    int updateByExample(@Param("record") Station record, @Param("example") StationExample example);

    int updateByPrimaryKeySelective(Station record);

    int updateByPrimaryKey(Station record);
    
    @Select("select t.id,t.name as text,t.pid from t_station t order by t.id")
    //暂不做权限处理
    List<TreeJson> selectByParam(String dptid);
}