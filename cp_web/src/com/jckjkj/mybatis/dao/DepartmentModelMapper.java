package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.DepartmentModel;
import com.jckjkj.mybatis.model.DepartmentModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentModelMapper {
    int countByExample(DepartmentModelExample example);

    int deleteByExample(DepartmentModelExample example);

    int deleteByPrimaryKey(String dptid);

    int insert(DepartmentModel record);

    int insertSelective(DepartmentModel record);

    List<DepartmentModel> selectByExample(DepartmentModelExample example);

    DepartmentModel selectByPrimaryKey(String dptid);

    int updateByExampleSelective(@Param("record") DepartmentModel record, @Param("example") DepartmentModelExample example);

    int updateByExample(@Param("record") DepartmentModel record, @Param("example") DepartmentModelExample example);

    int updateByPrimaryKeySelective(DepartmentModel record);

    int updateByPrimaryKey(DepartmentModel record);
}