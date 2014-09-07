package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.VOrderRepair;
import com.jckjkj.mybatis.model.VOrderRepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VOrderRepairMapper {
    int countByExample(VOrderRepairExample example);

    int deleteByExample(VOrderRepairExample example);

    int insert(VOrderRepair record);

    int insertSelective(VOrderRepair record);

    List<VOrderRepair> selectByExampleWithBLOBs(VOrderRepairExample example);

    List<VOrderRepair> selectByExample(VOrderRepairExample example);

    int updateByExampleSelective(@Param("record") VOrderRepair record, @Param("example") VOrderRepairExample example);

    int updateByExampleWithBLOBs(@Param("record") VOrderRepair record, @Param("example") VOrderRepairExample example);

    int updateByExample(@Param("record") VOrderRepair record, @Param("example") VOrderRepairExample example);
}