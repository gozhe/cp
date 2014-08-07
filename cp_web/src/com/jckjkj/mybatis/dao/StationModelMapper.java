package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.StationModel;
import com.jckjkj.mybatis.model.StationModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StationModelMapper {
    int countByExample(StationModelExample example);

    int deleteByExample(StationModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StationModel record);

    int insertSelective(StationModel record);

    List<StationModel> selectByExample(StationModelExample example);

    StationModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StationModel record, @Param("example") StationModelExample example);

    int updateByExample(@Param("record") StationModel record, @Param("example") StationModelExample example);

    int updateByPrimaryKeySelective(StationModel record);

    int updateByPrimaryKey(StationModel record);
}