package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.Department;
import com.jckjkj.mybatis.model.DepartmentExample;
import com.jckjkj.mybatis.model.EquipmentState;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface DepartmentMapper {
    int countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExample(DepartmentExample example);

    Department selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
    
    @Select("select * from x_department limit #{1} offset #{0}")
    List<Department> selectByLimit(int start,int rows);
}