package com.jckjkj.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.jckjkj.mybatis.model.Department;
import com.jckjkj.mybatis.model.Equipment;
import com.jckjkj.mybatis.model.EquipmentState;
import com.jckjkj.mybatis.model.OrderList;
import com.jckjkj.mybatis.model.RoutingInspection;
import com.jckjkj.mybatis.model.Station;
import com.jckjkj.mybatis.model.User;
import com.jckjkj.mybatis.model.VOrderRepair;
import com.jckjkj.utils.TreeJson;

public interface BaseService {
	
	//TODO /*--用户验证模块--*/
	
	/**
	 * 用户登录验证
	 * @param username
	 * @param password
	 * @return
	 */
	List<User> login(String username,String password);
	
	/**
	 * 用户登出
	 * @param username
	 * @return
	 */
	boolean logout(String username);
	
	//TODO /*--设备分组模块--*/
	
	List<TreeJson> getStationTree(String dptid);
	

	//TODO /*--设备监控模块--*/
	
	/**
	 * 获取所属部门的设备监控列表
	 * @param dptid 部门ID
	 * @return
	 */
	List<EquipmentState> getEquipmentStateList(String dptid);
	
	/**
	 * 获取所属部门的设备监控列表
	 * @param dptid
	 * @param page 页
	 * @param rows 行
	 * @return
	 */
	List<EquipmentState> getEquipmentStateList(String dptid,int rows,int start);
	
	
	/**
	 * 获取所属部门的设备监控数量（分页）
	 * @param dptid
	 * @return
	 */
	int getEquipmentStateCount(String dptid);
	
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
	 * 获取工单状态列表
	 * @param dptid
	 * @param rows
	 * @param start
	 * @return
	 */
	List<OrderList> getOrderList(String dptid,int rows,int start);
	
	
	/**
	 * 分页-获取总数
	 * @param dptid
	 * @return
	 */
	int getOrderListCount(String dptid);
	
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
	 * 获取工单详细(处理)信息
	 * @param orderid 工单编号
	 * @return
	 */
	VOrderRepair getOrderListDetail(String faultid);
	
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
	 * 获取巡检记录列表
	 * @return
	 */
	List<RoutingInspection> getRoutingInspectionList(String dptid,int start,int rows);
	
	
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
	RoutingInspection getRoutingInspectionDetail(int id);
	
	
	/**
	 * 巡检记录审核提交
	 * @param routinginspection
	 * @return
	 */
	boolean routinginspectionAudio(RoutingInspection routinginspection);
	
}
