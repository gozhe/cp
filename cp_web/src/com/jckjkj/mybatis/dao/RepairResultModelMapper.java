package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.RepairResultModel;
import com.jckjkj.mybatis.model.RepairResultModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepairResultModelMapper {
    int countByExample(RepairResultModelExample example);

    int deleteByExample(RepairResultModelExample example);

    int deleteByPrimaryKey(Integer rrid);

    int insert(RepairResultModel record);

    int insertSelective(RepairResultModel record);

    List<RepairResultModel> selectByExample(RepairResultModelExample example);

    RepairResultModel selectByPrimaryKey(Integer rrid);

    int updateByExampleSelective(@Param("record") RepairResultModel record, @Param("example") RepairResultModelExample example);

    int updateByExample(@Param("record") RepairResultModel record, @Param("example") RepairResultModelExample example);

    int updateByPrimaryKeySelective(RepairResultModel record);

    int updateByPrimaryKey(RepairResultModel record);
}