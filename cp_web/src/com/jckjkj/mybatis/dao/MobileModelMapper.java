package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.MobileModel;
import com.jckjkj.mybatis.model.MobileModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MobileModelMapper {
    int countByExample(MobileModelExample example);

    int deleteByExample(MobileModelExample example);

    int deleteByPrimaryKey(Long mobileid);

    int insert(MobileModel record);

    int insertSelective(MobileModel record);

    List<MobileModel> selectByExample(MobileModelExample example);

    MobileModel selectByPrimaryKey(Long mobileid);

    int updateByExampleSelective(@Param("record") MobileModel record, @Param("example") MobileModelExample example);

    int updateByExample(@Param("record") MobileModel record, @Param("example") MobileModelExample example);

    int updateByPrimaryKeySelective(MobileModel record);

    int updateByPrimaryKey(MobileModel record);
}