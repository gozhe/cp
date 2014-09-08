package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.User;
import com.jckjkj.mybatis.model.UserExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    @Select("select t1.*,t2.*,t3.* from x_user t1,x_department t2,x_role t3 where t1.dptid=t2.dptid and t1.roleid=t3.roleid and t1.username = #{0} and t1.password=#{1}")
    List<Map<String,Object>> queryByLogin(String username,String password);
    
    List<User> joinLogin(User user); 
}