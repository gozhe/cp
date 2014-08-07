package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.UserModel;
import com.jckjkj.mybatis.model.UserModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserModelMapper {
    int countByExample(UserModelExample example);

    int deleteByExample(UserModelExample example);

    int deleteByPrimaryKey(Long userid);

    int insert(UserModel record);

    int insertSelective(UserModel record);

    List<UserModel> selectByExample(UserModelExample example);

    UserModel selectByPrimaryKey(Long userid);

    int updateByExampleSelective(@Param("record") UserModel record, @Param("example") UserModelExample example);

    int updateByExample(@Param("record") UserModel record, @Param("example") UserModelExample example);

    int updateByPrimaryKeySelective(UserModel record);

    int updateByPrimaryKey(UserModel record);
}