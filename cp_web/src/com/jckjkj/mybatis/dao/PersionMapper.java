package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.Persion;
import com.jckjkj.mybatis.model.PersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersionMapper {
    int countByExample(PersionExample example);

    int deleteByExample(PersionExample example);

    int deleteByPrimaryKey(Long persionid);

    int insert(Persion record);

    int insertSelective(Persion record);

    List<Persion> selectByExample(PersionExample example);

    Persion selectByPrimaryKey(Long persionid);

    int updateByExampleSelective(@Param("record") Persion record, @Param("example") PersionExample example);

    int updateByExample(@Param("record") Persion record, @Param("example") PersionExample example);

    int updateByPrimaryKeySelective(Persion record);

    int updateByPrimaryKey(Persion record);
}