package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.Repair;
import com.jckjkj.mybatis.model.RepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepairMapper {
    int countByExample(RepairExample example);

    int deleteByExample(RepairExample example);

    int insert(Repair record);

    int insertSelective(Repair record);

    List<Repair> selectByExampleWithBLOBs(RepairExample example);

    List<Repair> selectByExample(RepairExample example);

    int updateByExampleSelective(@Param("record") Repair record, @Param("example") RepairExample example);

    int updateByExampleWithBLOBs(@Param("record") Repair record, @Param("example") RepairExample example);

    int updateByExample(@Param("record") Repair record, @Param("example") RepairExample example);
}