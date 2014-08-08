package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.EquipmentState;
import com.jckjkj.mybatis.model.EquipmentStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipmentStateMapper {
    int countByExample(EquipmentStateExample example);

    int deleteByExample(EquipmentStateExample example);

    int deleteByPrimaryKey(Long equstateid);

    int insert(EquipmentState record);

    int insertSelective(EquipmentState record);

    List<EquipmentState> selectByExample(EquipmentStateExample example);

    EquipmentState selectByPrimaryKey(Long equstateid);

    int updateByExampleSelective(@Param("record") EquipmentState record, @Param("example") EquipmentStateExample example);

    int updateByExample(@Param("record") EquipmentState record, @Param("example") EquipmentStateExample example);

    int updateByPrimaryKeySelective(EquipmentState record);

    int updateByPrimaryKey(EquipmentState record);
}