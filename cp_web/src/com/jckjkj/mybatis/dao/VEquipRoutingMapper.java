package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.VEquipRouting;
import com.jckjkj.mybatis.model.VEquipRoutingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VEquipRoutingMapper {
    int countByExample(VEquipRoutingExample example);

    int deleteByExample(VEquipRoutingExample example);

    int insert(VEquipRouting record);

    int insertSelective(VEquipRouting record);

    List<VEquipRouting> selectByExample(VEquipRoutingExample example);

    int updateByExampleSelective(@Param("record") VEquipRouting record, @Param("example") VEquipRoutingExample example);

    int updateByExample(@Param("record") VEquipRouting record, @Param("example") VEquipRoutingExample example);
}