package com.jckjkj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jckjkj.mybatis.dao.EquipmentMapper;
import com.jckjkj.mybatis.dao.EquipmentStateMapper;
import com.jckjkj.mybatis.dao.OrderListMapper;
import com.jckjkj.mybatis.dao.RoutingInspectionMapper;
import com.jckjkj.mybatis.dao.UserMapper;
import com.jckjkj.mybatis.model.Equipment;
import com.jckjkj.mybatis.model.EquipmentExample;
import com.jckjkj.mybatis.model.EquipmentState;
import com.jckjkj.mybatis.model.EquipmentStateExample;
import com.jckjkj.mybatis.model.OrderList;
import com.jckjkj.mybatis.model.OrderListExample;
import com.jckjkj.mybatis.model.RoutingInspection;
import com.jckjkj.mybatis.model.RoutingInspectionExample;
import com.jckjkj.mybatis.model.User;
import com.jckjkj.service.BaseService;

@Service("baseService")
public class BaseServiceImpl implements BaseService {

	private UserMapper userMapper;
	private EquipmentStateMapper equipmentStateMapper;
	private EquipmentMapper equipmentMapper;
	private OrderListMapper orderListMapper;
	private RoutingInspectionMapper routingInspectionMapper;

	//TODO ------------接口实现-----------

	@Override
	public User Login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Logout(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<EquipmentState> getEquipmentStateList(String dptid) {
		// TODO Auto-generated method stub
		EquipmentStateExample example = new EquipmentStateExample();
		example.createCriteria().andEquidIsNotNull();
		return equipmentStateMapper.selectByExample(example);
	}

	@Override
	public Equipment getEquipmentDetail(String equid) {
		// TODO Auto-generated method stub
		//EquipmentExample example = new EquipmentExample();
		//example.createCriteria().andEquidEqualTo(equid);
		return equipmentMapper.selectByPrimaryKey(equid);
	}

	@Override
	public List<Equipment> getEquipmentByQuery(String[] params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderList> getOrderList() {
		// TODO Auto-generated method stub
		OrderListExample example = new OrderListExample();
		example.createCriteria().andIdIsNotNull();
		return orderListMapper.selectByExample(example);
	}

	@Override
	public List<OrderList> getOrderListByQuery(String[] params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderList getOrderListDetail(String orderid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderList getOrderlistById(String equid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean OrderDispatch(OrderList orderlist) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean orderAudto(OrderList orderlist) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<RoutingInspection> getRoutingInspectionList() {
		// TODO Auto-generated method stub
		RoutingInspectionExample example = new RoutingInspectionExample();
		example.createCriteria().andIdIsNotNull();
		return routingInspectionMapper.selectByExample(example);
	}

	@Override
	public List<RoutingInspection> getRoutingInspectionByQuery(String[] params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoutingInspection getRoutingInspectionDetail(String rouid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean routinginspectionAudio(RoutingInspection routinginspection) {
		// TODO Auto-generated method stub
		return false;
	}

	
	//TODO ------------Spring自动装配
	
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public EquipmentStateMapper getEquipmentStateMapper() {
		return equipmentStateMapper;
	}

	@Autowired
	public void setEquipmentStateMapper(
			EquipmentStateMapper equipmentStateMapper) {
		this.equipmentStateMapper = equipmentStateMapper;
	}

	public EquipmentMapper getEquipmentMapper() {
		return equipmentMapper;
	}

	@Autowired
	public void setEquipmentMapper(EquipmentMapper equipmentMapper) {
		this.equipmentMapper = equipmentMapper;
	}

	public OrderListMapper getOrderListMapper() {
		return orderListMapper;
	}

	@Autowired
	public void setOrderListMapper(OrderListMapper orderListMapper) {
		this.orderListMapper = orderListMapper;
	}

	public RoutingInspectionMapper getRoutingInspectionMapper() {
		return routingInspectionMapper;
	}

	@Autowired
	public void setRoutingInspectionMapper(
			RoutingInspectionMapper routingInspectionMapper) {
		this.routingInspectionMapper = routingInspectionMapper;
	}

}
