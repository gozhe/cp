package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.FaultGradeModel;
import com.jckjkj.mybatis.model.FaultGradeModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FaultGradeModelMapper {
    int countByExample(FaultGradeModelExample example);

    int deleteByExample(FaultGradeModelExample example);

    int deleteByPrimaryKey(Integer fgid);

    int insert(FaultGradeModel record);

    int insertSelective(FaultGradeModel record);

    List<FaultGradeModel> selectByExample(FaultGradeModelExample example);

    FaultGradeModel selectByPrimaryKey(Integer fgid);

    int updateByExampleSelective(@Param("record") FaultGradeModel record, @Param("example") FaultGradeModelExample example);

    int updateByExample(@Param("record") FaultGradeModel record, @Param("example") FaultGradeModelExample example);

    int updateByPrimaryKeySelective(FaultGradeModel record);

    int updateByPrimaryKey(FaultGradeModel record);
}