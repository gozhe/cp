package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.PersionModel;
import com.jckjkj.mybatis.model.PersionModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersionModelMapper {
    int countByExample(PersionModelExample example);

    int deleteByExample(PersionModelExample example);

    int deleteByPrimaryKey(Long persionid);

    int insert(PersionModel record);

    int insertSelective(PersionModel record);

    List<PersionModel> selectByExample(PersionModelExample example);

    PersionModel selectByPrimaryKey(Long persionid);

    int updateByExampleSelective(@Param("record") PersionModel record, @Param("example") PersionModelExample example);

    int updateByExample(@Param("record") PersionModel record, @Param("example") PersionModelExample example);

    int updateByPrimaryKeySelective(PersionModel record);

    int updateByPrimaryKey(PersionModel record);
}