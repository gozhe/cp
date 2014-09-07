package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.EquipmentState;
import com.jckjkj.mybatis.model.EquipmentStateExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface EquipmentStateMapper {
    int countByExample(EquipmentStateExample example);

    int deleteByExample(EquipmentStateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EquipmentState record);

    int insertSelective(EquipmentState record);

    List<EquipmentState> selectByExample(EquipmentStateExample example);

    EquipmentState selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EquipmentState record, @Param("example") EquipmentStateExample example);

    int updateByExample(@Param("record") EquipmentState record, @Param("example") EquipmentStateExample example);

    int updateByPrimaryKeySelective(EquipmentState record);

    int updateByPrimaryKey(EquipmentState record);
    
    @Select("select * from x_equipmentstate limit #{1} offset #{0}")
    List<EquipmentState> selectByLimit(int start,int rows);
}