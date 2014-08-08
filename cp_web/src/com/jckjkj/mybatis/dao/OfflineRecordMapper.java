package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.OfflineRecord;
import com.jckjkj.mybatis.model.OfflineRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfflineRecordMapper {
    int countByExample(OfflineRecordExample example);

    int deleteByExample(OfflineRecordExample example);

    int insert(OfflineRecord record);

    int insertSelective(OfflineRecord record);

    List<OfflineRecord> selectByExample(OfflineRecordExample example);

    int updateByExampleSelective(@Param("record") OfflineRecord record, @Param("example") OfflineRecordExample example);

    int updateByExample(@Param("record") OfflineRecord record, @Param("example") OfflineRecordExample example);
}