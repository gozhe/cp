package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.Mobile;
import com.jckjkj.mybatis.model.Person;
import com.jckjkj.mybatis.model.PersonExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface PersonMapper {
    int countByExample(PersonExample example);

    int deleteByExample(PersonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    int insertSelective(Person record);

    List<Person> selectByExample(PersonExample example);

    Person selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByExample(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
    
    @Select("select * from x_person limit #{1} offset #{0}")
    List<Person> selectByLimit(int start,int rows);
}