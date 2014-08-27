package com.jckjkj.mybatis.dao;

import com.jckjkj.mybatis.model.PaymentRatio;
import com.jckjkj.mybatis.model.PaymentRatioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentRatioMapper {
    int countByExample(PaymentRatioExample example);

    int deleteByExample(PaymentRatioExample example);

    int insert(PaymentRatio record);

    int insertSelective(PaymentRatio record);

    List<PaymentRatio> selectByExample(PaymentRatioExample example);

    int updateByExampleSelective(@Param("record") PaymentRatio record, @Param("example") PaymentRatioExample example);

    int updateByExample(@Param("record") PaymentRatio record, @Param("example") PaymentRatioExample example);
}