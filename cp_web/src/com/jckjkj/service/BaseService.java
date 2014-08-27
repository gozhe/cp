package com.jckjkj.service;

import java.util.List;
import java.util.Map;

import com.jckjkj.mybatis.model.Equipment;
import com.jckjkj.mybatis.model.EquipmentState;
import com.jckjkj.mybatis.model.OrderList;
import com.jckjkj.mybatis.model.RoutingInspection;
import com.jckjkj.mybatis.model.User;

public interface BaseService {
	
	//TODO /*--用户验证模块--*/
	
	/**
	 * 用户登录验证
	 * @param username
	 * @param password
	 * @return
	 */
	User Login(String username,String password);
	
	/**
	 * 用户登出
	 * @param username
	 * @return
	 */
	boolean Logout(String username);
	
	
	//TODO /*--设备监控模块--*/
	
	/**
	 * 获取所属部门的设备监控列表
	 * @param dptid 部门ID
	 * @return
	 */
	List<EquipmentState> getEquipmentStateList(String dptid);
	
	/**
	 * 获取设备详细信息描述
	 * @param equid 设备编号
	 * @return
	 */
	Equipment getEquipmentDetail(String equid); 
	
	
	/**
	 * 条件查询设备监控列表
	 * @param params
	 * [0]为告警类型
	 * [1]为告警登记
	 * [2]为告警状态
	 * [3]为设备类型
	 * @return
	 */
	List<Equipment> getEquipmentByQuery(String[] params);
	
	
	//TODO /*--工单管理模块--*/
	
	/**
	 * 获取工单状态列表
	 * @return
	 */
	List<OrderList> getOrderList();
	
	
	/**
	 * 条件查询工单列表
	 * @param params
	 * [0]分组
	 * [1]时间段
	 * [2]设备标示
	 * @return
	 */
	List<OrderList> getOrderListByQuery(String[] params); 
	
	/**
	 * 获取工单详细信息
	 * @param orderid 工单编号
	 * @return
	 */
	OrderList getOrderListDetail(String orderid);
	
	/**
	 * 工单派发入口
	 * @param equid 设备ID
	 * @return
	 */
	OrderList getOrderlistById(String equid); 
	
	/**
	 * 工单派发（保存）
	 * @param orderlist
	 * @return
	 */
	boolean OrderDispatch(OrderList orderlist);
	
	/**
	 * 工单审核提交
	 * @param orderlist
	 * @return
	 */
	boolean orderAudto(OrderList orderlist);
	
	
	//TODO /*--巡检管理模块--*/
	
	/**
	 * 获取巡检记录列表
	 * @return
	 */
	List<RoutingInspection> getRoutingInspectionList();
	
	
	/**
	 * 条件查询巡检记录列表
	 * @param params
	 * [0]分组查询
	 * [1]年、月时间段查询
	 * [2]其他
	 * @return
	 */
	List<RoutingInspection> getRoutingInspectionByQuery(String[] params);
	
	
	/**
	 * 查询巡检详细信息
	 * @param rouid 巡检ID
	 * @return
	 */
	RoutingInspection getRoutingInspectionDetail(String rouid);
	
	
	/**
	 * 巡检记录审核提交
	 * @param routinginspection
	 * @return
	 */
	boolean routinginspectionAudio(RoutingInspection routinginspection);
	
}
