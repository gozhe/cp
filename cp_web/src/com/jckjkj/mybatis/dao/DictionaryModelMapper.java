package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.DictionaryModel;
import com.jckjkj.mybatis.model.DictionaryModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictionaryModelMapper {
    int countByExample(DictionaryModelExample example);

    int deleteByExample(DictionaryModelExample example);

    int deleteByPrimaryKey(Integer dicid);

    int insert(DictionaryModel record);

    int insertSelective(DictionaryModel record);

    List<DictionaryModel> selectByExample(DictionaryModelExample example);

    DictionaryModel selectByPrimaryKey(Integer dicid);

    int updateByExampleSelective(@Param("record") DictionaryModel record, @Param("example") DictionaryModelExample example);

    int updateByExample(@Param("record") DictionaryModel record, @Param("example") DictionaryModelExample example);

    int updateByPrimaryKeySelective(DictionaryModel record);

    int updateByPrimaryKey(DictionaryModel record);
}