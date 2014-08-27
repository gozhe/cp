package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.RepairResult;
import com.jckjkj.mybatis.model.RepairResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepairResultMapper {
    int countByExample(RepairResultExample example);

    int deleteByExample(RepairResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RepairResult record);

    int insertSelective(RepairResult record);

    List<RepairResult> selectByExample(RepairResultExample example);

    RepairResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RepairResult record, @Param("example") RepairResultExample example);

    int updateByExample(@Param("record") RepairResult record, @Param("example") RepairResultExample example);

    int updateByPrimaryKeySelective(RepairResult record);

    int updateByPrimaryKey(RepairResult record);
}