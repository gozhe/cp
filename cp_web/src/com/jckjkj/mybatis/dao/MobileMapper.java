package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.Mobile;
import com.jckjkj.mybatis.model.MobileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MobileMapper {
    int countByExample(MobileExample example);

    int deleteByExample(MobileExample example);

    int deleteByPrimaryKey(Long mobileid);

    int insert(Mobile record);

    int insertSelective(Mobile record);

    List<Mobile> selectByExample(MobileExample example);

    Mobile selectByPrimaryKey(Long mobileid);

    int updateByExampleSelective(@Param("record") Mobile record, @Param("example") MobileExample example);

    int updateByExample(@Param("record") Mobile record, @Param("example") MobileExample example);

    int updateByPrimaryKeySelective(Mobile record);

    int updateByPrimaryKey(Mobile record);
}