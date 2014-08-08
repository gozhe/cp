package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.FaultGrade;
import com.jckjkj.mybatis.model.FaultGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FaultGradeMapper {
    int countByExample(FaultGradeExample example);

    int deleteByExample(FaultGradeExample example);

    int deleteByPrimaryKey(Integer fgid);

    int insert(FaultGrade record);

    int insertSelective(FaultGrade record);

    List<FaultGrade> selectByExample(FaultGradeExample example);

    FaultGrade selectByPrimaryKey(Integer fgid);

    int updateByExampleSelective(@Param("record") FaultGrade record, @Param("example") FaultGradeExample example);

    int updateByExample(@Param("record") FaultGrade record, @Param("example") FaultGradeExample example);

    int updateByPrimaryKeySelective(FaultGrade record);

    int updateByPrimaryKey(FaultGrade record);
}