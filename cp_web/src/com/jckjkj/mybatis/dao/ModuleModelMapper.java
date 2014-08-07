package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.ModuleModel;
import com.jckjkj.mybatis.model.ModuleModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModuleModelMapper {
    int countByExample(ModuleModelExample example);

    int deleteByExample(ModuleModelExample example);

    int deleteByPrimaryKey(Integer modelid);

    int insert(ModuleModel record);

    int insertSelective(ModuleModel record);

    List<ModuleModel> selectByExample(ModuleModelExample example);

    ModuleModel selectByPrimaryKey(Integer modelid);

    int updateByExampleSelective(@Param("record") ModuleModel record, @Param("example") ModuleModelExample example);

    int updateByExample(@Param("record") ModuleModel record, @Param("example") ModuleModelExample example);

    int updateByPrimaryKeySelective(ModuleModel record);

    int updateByPrimaryKey(ModuleModel record);
}