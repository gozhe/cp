package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.DptStation;
import com.jckjkj.mybatis.model.DptStationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DptStationMapper {
    int countByExample(DptStationExample example);

    int deleteByExample(DptStationExample example);

    int insert(DptStation record);

    int insertSelective(DptStation record);

    List<DptStation> selectByExample(DptStationExample example);

    int updateByExampleSelective(@Param("record") DptStation record, @Param("example") DptStationExample example);

    int updateByExample(@Param("record") DptStation record, @Param("example") DptStationExample example);
}