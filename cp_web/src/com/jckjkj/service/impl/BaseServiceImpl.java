package com.jckjkj.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jckjkj.mybatis.dao.EquipmentMapper;
import com.jckjkj.mybatis.dao.EquipmentStateMapper;
import com.jckjkj.mybatis.dao.OrderListMapper;
import com.jckjkj.mybatis.dao.RoutingInspectionMapper;
import com.jckjkj.mybatis.dao.StationMapper;
import com.jckjkj.mybatis.dao.UserMapper;
import com.jckjkj.mybatis.dao.VOrderRepairMapper;
import com.jckjkj.mybatis.model.Department;
import com.jckjkj.mybatis.model.Equipment;
import com.jckjkj.mybatis.model.EquipmentExample;
import com.jckjkj.mybatis.model.EquipmentState;
import com.jckjkj.mybatis.model.EquipmentStateExample;
import com.jckjkj.mybatis.model.OrderList;
import com.jckjkj.mybatis.model.OrderListExample;
import com.jckjkj.mybatis.model.RoutingInspection;
import com.jckjkj.mybatis.model.RoutingInspectionExample;
import com.jckjkj.mybatis.model.Station;
import com.jckjkj.mybatis.model.User;
import com.jckjkj.mybatis.model.VOrderRepair;
import com.jckjkj.mybatis.model.VOrderRepairExample;
import com.jckjkj.service.BaseService;
import com.jckjkj.utils.TreeJson;

@Service("baseService")
public class BaseServiceImpl implements BaseService {

	private UserMapper userMapper;
	private StationMapper stationMapper;
	private EquipmentStateMapper equipmentStateMapper;
	private EquipmentMapper equipmentMapper;
	private OrderListMapper orderListMapper;
	private VOrderRepairMapper vOrderRepairMapper;
	private RoutingInspectionMapper routingInspectionMapper;

	private SqlSessionFactory sqlSessionFactory;

	// TODO ------------接口实现-----------

	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logout(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<TreeJson> getStationTree(String dptid) {
		// TODO Auto-generated method stub

		return stationMapper.selectByParam(dptid);
	}

	@Override
	public List<EquipmentState> getEquipmentStateList(String dptid) {
		// TODO Auto-generated method stub
		EquipmentStateExample example = new EquipmentStateExample();
		example.createCriteria().andEquidIsNotNull();
		return equipmentStateMapper.selectByExample(example);
	}

	@Override
	public List<EquipmentState> getEquipmentStateList(String dptid, int start,
			int rows) {
		// TODO Auto-generated method stub
		// dptid-->stationid->sid
		// Map<String, Object> param=new HashMap<String, Object>();
		// param.put("start", start);
		// param.put("rows", rows);
		return equipmentStateMapper.selectByLimit(start, rows);
	}

	@Override
	public int getEquipmentStateCount(String dptid) {
		// TODO Auto-generated method stub
		EquipmentStateExample example = new EquipmentStateExample();
		example.createCriteria().andEquidIsNotNull();
		return equipmentStateMapper.countByExample(example);
	}

	@Override
	public Equipment getEquipmentDetail(String equid) {
		// TODO Auto-generated method stub
		EquipmentExample example = new EquipmentExample();
		example.createCriteria().andEquidEqualTo(equid);
		List<Equipment> list = equipmentMapper.selectByExample(example);
		if (list.size() > 0) {
			return list.get(0);
		} else {
			return null;
		}
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
	public List<OrderList> getOrderList(String dptid, int rows, int start) {
		// TODO Auto-generated method stub
		return orderListMapper.selectByLimit(start, rows);
	}

	@Override
	public int getOrderListCount(String dptid) {
		// TODO Auto-generated method stub
		OrderListExample example = new OrderListExample();
		example.createCriteria().andIdIsNotNull();
		return orderListMapper.selectByExample(example).size();
	}

	@Override
	public List<OrderList> getOrderListByQuery(String[] params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VOrderRepair getOrderListDetail(String faultid) {
		VOrderRepairExample example = new VOrderRepairExample();
		example.createCriteria().andFaultidEqualTo(faultid);
		List<VOrderRepair> list = vOrderRepairMapper.selectByExample(example);
		return list == null ? null : list.get(0);
	}

	@Override
	public OrderList getOrderlistById(String equid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean OrderDispatch(OrderList orderlist) {
		// TODO Auto-generated method stub
		return orderListMapper.insertSelective(orderlist) > 0 ? true : false;
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

	// TODO ------------Spring自动装配--@Autowired

	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public StationMapper getStationMapper() {
		return stationMapper;
	}

	@Autowired
	public void setStationMapper(StationMapper stationMapper) {
		this.stationMapper = stationMapper;
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

	public VOrderRepairMapper getvOrderRepairMapper() {
		return vOrderRepairMapper;
	}

	@Autowired
	public void setvOrderRepairMapper(VOrderRepairMapper vOrderRepairMapper) {
		this.vOrderRepairMapper = vOrderRepairMapper;
	}

	public RoutingInspectionMapper getRoutingInspectionMapper() {
		return routingInspectionMapper;
	}

	@Autowired
	public void setRoutingInspectionMapper(
			RoutingInspectionMapper routingInspectionMapper) {
		this.routingInspectionMapper = routingInspectionMapper;
	}

	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

}
