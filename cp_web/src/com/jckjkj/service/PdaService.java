package com.jckjkj.service;

import java.util.List;
import java.util.Map;

import com.jckjkj.mybatis.model.OrderList;
import com.jckjkj.mybatis.model.Person;
import com.jckjkj.mybatis.model.Postpone;
import com.jckjkj.mybatis.model.Repair;
import com.jckjkj.mybatis.model.RoutingInspection;
import com.jckjkj.mybatis.model.VEquipRouting;

public interface PdaService {

	/**
	 * 获取用户信息
	 * 
	 * @return
	 */
	List<Person> getPerson(String dptid);

	/**
	 * 用户注册
	 * 
	 * @param person
	 * @return
	 */
	boolean register(Person person);

	/**
	 * 获取当前用户巡检任务、点位情况、巡检审核情况
	 * 
	 * @param mid
	 * @return
	 */
	List<VEquipRouting> getRoutingInspInfo(String mid);

	/**
	 * 提交巡检签到表单
	 * 
	 * @param info
	 * @return
	 */
	boolean UploadRoutingInsp(RoutingInspection info);


	/**
	 * 获取当前用户的工单任务
	 * 
	 * @param dptid
	 * @return
	 */
	List<OrderList> getOrderInfo(String mid);

	/**
	 * 巡检员创建工单
	 * 
	 * @param info
	 * @return
	 */
	boolean UploadOrderInfo(OrderList orderlist);

	/**
	 * 巡检员工单延期上报
	 * 
	 * @param info
	 * @return
	 */
	boolean UploadPostpone(Postpone postpone);

	/**
	 * 巡检员工单维修上报
	 * 
	 * @param info
	 * @return
	 */
	boolean UploadOrderRepair(Repair repair);

}
