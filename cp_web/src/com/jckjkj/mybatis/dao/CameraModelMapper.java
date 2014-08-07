package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.CameraModel;
import com.jckjkj.mybatis.model.CameraModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CameraModelMapper {
    int countByExample(CameraModelExample example);

    int deleteByExample(CameraModelExample example);

    int deleteByPrimaryKey(String cameraid);

    int insert(CameraModel record);

    int insertSelective(CameraModel record);

    List<CameraModel> selectByExample(CameraModelExample example);

    CameraModel selectByPrimaryKey(String cameraid);

    int updateByExampleSelective(@Param("record") CameraModel record, @Param("example") CameraModelExample example);

    int updateByExample(@Param("record") CameraModel record, @Param("example") CameraModelExample example);

    int updateByPrimaryKeySelective(CameraModel record);

    int updateByPrimaryKey(CameraModel record);
}