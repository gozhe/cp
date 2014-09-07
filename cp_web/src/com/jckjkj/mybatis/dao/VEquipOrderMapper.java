package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.VEquipOrder;
import com.jckjkj.mybatis.model.VEquipOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VEquipOrderMapper {
    int countByExample(VEquipOrderExample example);

    int deleteByExample(VEquipOrderExample example);

    int insert(VEquipOrder record);

    int insertSelective(VEquipOrder record);

    List<VEquipOrder> selectByExample(VEquipOrderExample example);

    int updateByExampleSelective(@Param("record") VEquipOrder record, @Param("example") VEquipOrderExample example);

    int updateByExample(@Param("record") VEquipOrder record, @Param("example") VEquipOrderExample example);
}