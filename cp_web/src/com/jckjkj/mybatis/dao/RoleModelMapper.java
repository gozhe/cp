package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.RoleModel;
import com.jckjkj.mybatis.model.RoleModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleModelMapper {
    int countByExample(RoleModelExample example);

    int deleteByExample(RoleModelExample example);

    int deleteByPrimaryKey(Long roleid);

    int insert(RoleModel record);

    int insertSelective(RoleModel record);

    List<RoleModel> selectByExample(RoleModelExample example);

    RoleModel selectByPrimaryKey(Long roleid);

    int updateByExampleSelective(@Param("record") RoleModel record, @Param("example") RoleModelExample example);

    int updateByExample(@Param("record") RoleModel record, @Param("example") RoleModelExample example);

    int updateByPrimaryKeySelective(RoleModel record);

    int updateByPrimaryKey(RoleModel record);
}