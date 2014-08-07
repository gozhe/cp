package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.OfflineRecordModel;
import com.jckjkj.mybatis.model.OfflineRecordModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfflineRecordModelMapper {
    int countByExample(OfflineRecordModelExample example);

    int deleteByExample(OfflineRecordModelExample example);

    int insert(OfflineRecordModel record);

    int insertSelective(OfflineRecordModel record);

    List<OfflineRecordModel> selectByExample(OfflineRecordModelExample example);

    int updateByExampleSelective(@Param("record") OfflineRecordModel record, @Param("example") OfflineRecordModelExample example);

    int updateByExample(@Param("record") OfflineRecordModel record, @Param("example") OfflineRecordModelExample example);
}