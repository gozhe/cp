package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.Postpone;
import com.jckjkj.mybatis.model.PostponeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostponeMapper {
    int countByExample(PostponeExample example);

    int deleteByExample(PostponeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Postpone record);

    int insertSelective(Postpone record);

    List<Postpone> selectByExample(PostponeExample example);

    Postpone selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Postpone record, @Param("example") PostponeExample example);

    int updateByExample(@Param("record") Postpone record, @Param("example") PostponeExample example);

    int updateByPrimaryKeySelective(Postpone record);

    int updateByPrimaryKey(Postpone record);
}