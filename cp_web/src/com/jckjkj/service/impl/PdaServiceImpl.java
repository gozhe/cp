package com.jckjkj.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jckjkj.mybatis.dao.CameraMapper;
import com.jckjkj.mybatis.dao.MobileMapper;
import com.jckjkj.mybatis.dao.MobileStationMapper;
import com.jckjkj.mybatis.dao.OrderListMapper;
import com.jckjkj.mybatis.dao.PersonMapper;
import com.jckjkj.mybatis.dao.PostponeMapper;
import com.jckjkj.mybatis.dao.RepairMapper;
import com.jckjkj.mybatis.dao.RoutingInspectionMapper;
import com.jckjkj.mybatis.dao.VEquipRoutingMapper;
import com.jckjkj.mybatis.model.Camera;
import com.jckjkj.mybatis.model.CameraExample;
import com.jckjkj.mybatis.model.MobileStation;
import com.jckjkj.mybatis.model.MobileStationExample;
import com.jckjkj.mybatis.model.OrderList;
import com.jckjkj.mybatis.model.OrderListExample;
import com.jckjkj.mybatis.model.Person;
import com.jckjkj.mybatis.model.PersonExample;
import com.jckjkj.mybatis.model.Postpone;
import com.jckjkj.mybatis.model.Repair;
import com.jckjkj.mybatis.model.RoutingInspection;
import com.jckjkj.mybatis.model.RoutingInspectionExample;
import com.jckjkj.mybatis.model.VEquipRouting;
import com.jckjkj.mybatis.model.VEquipRoutingExample;
import com.jckjkj.service.PdaService;
import com.jckjkj.utils.JsonUtils;

@Service("pdaService")
public class PdaServiceImpl implements PdaService {

	private CameraMapper cameraMapper;
	private MobileMapper mobileMapper;
	private MobileStationMapper mobileStationMapper;
	private PersonMapper personMapper;
	private RoutingInspectionMapper routingInspectionMapper;
	private OrderListMapper orderListMapper;
	private RepairMapper repairMapper;
	private PostponeMapper postponeMapper;
	private VEquipRoutingMapper vEquipRoutingMapper;

	@Override
	public List<Person> getPerson(String dptid) {
		// TODO Auto-generated method stub
		System.out.print(dptid);
		PersonExample example = new PersonExample();
		example.createCriteria().andDptidEqualTo(dptid);
		List<Person> list = personMapper.selectByExample(example);
		return list;
	}

	@Override
	public boolean register(Person person) {
		// TODO Auto-generated method stub
		int res = personMapper.insert(person);
		return res > 0 ? true : false;
	}

	@Override
	public List<VEquipRouting> getRoutingInspInfo(int mid) {
		// TODO Auto-generated method stub
		// ①通过mid获得设备分组stationid
		// ②通过分组stationid获得设备信息（equipid,x,y,状态)-view_equip_routing
//		MobileStationExample example = new MobileStationExample();
//		example.createCriteria().andMidEqualTo(mid);
//		List<MobileStation> list = mobileStationMapper.selectByExample(example);
//		List<Integer> values = new ArrayList<Integer>();
//		for (MobileStation v : list) {
//			values.add(v.getStationid());
//		}
//		VEquipRoutingExample example1 = new VEquipRoutingExample();
//		example1.createCriteria().andStationIdIn(values);
//		return vEquipRoutingMapper.selectByExample(example1);
		return null;
	}

	@Override
	public boolean UploadRoutingInsp(RoutingInspection info) {
		// TODO Auto-generated method stub
		int res = routingInspectionMapper.insert(info);
		return res > 0 ? true : false;
	}

	@Override
	public List<OrderList> getOrderInfo(int mid) {
		// TODO Auto-generated method stub
		// ①通过mid获得设备分组stationid
		// ②通过分组stationid获得设备信息（equid)
		// ③通过equid获得工单列表
		List<OrderList> list = orderListMapper.selectByMobileId(mid);
		return list;
		//return null;
	}

	@Override
	public boolean UploadOrderInfo(OrderList orderlist) {
		// TODO Auto-generated method stub
		int res = orderListMapper.insert(orderlist);
		return res > 0 ? true : false;
	}

	@Override
	public boolean UploadPostpone(Postpone postpone) {
		// TODO Auto-generated method stub
		int res = postponeMapper.insert(postpone);
		return res > 0 ? true : false;
	}

	@Override
	public boolean UploadOrderRepair(Repair repair) {
		// TODO Auto-generated method stub
		int res = repairMapper.insert(repair);
		return res > 0 ? true : false;
	}
	
	
	//TODO ------------Spring自动装配

	public CameraMapper getCameraMapper() {
		return cameraMapper;
	}
	@Autowired
	public void setCameraMapper(CameraMapper cameraMapper) {
		this.cameraMapper = cameraMapper;
	}

	public MobileMapper getMobileMapper() {
		return mobileMapper;
	}
	@Autowired
	public void setMobileMapper(MobileMapper mobileMapper) {
		this.mobileMapper = mobileMapper;
	}

	public MobileStationMapper getMobileStationMapper() {
		return mobileStationMapper;
	}
	@Autowired
	public void setMobileStationMapper(MobileStationMapper mobileStationMapper) {
		this.mobileStationMapper = mobileStationMapper;
	}

	public VEquipRoutingMapper getvEquipRoutingMapper() {
		return vEquipRoutingMapper;
	}
	@Autowired
	public void setvEquipRoutingMapper(VEquipRoutingMapper vEquipRoutingMapper) {
		this.vEquipRoutingMapper = vEquipRoutingMapper;
	}

	public PersonMapper getPersonMapper() {
		return personMapper;
	}
	@Autowired
	public void setPersonMapper(PersonMapper personMapper) {
		this.personMapper = personMapper;
	}

	public RoutingInspectionMapper getRoutingInspectionMapper() {
		return routingInspectionMapper;
	}
	@Autowired
	public void setRoutingInspectionMapper(
			RoutingInspectionMapper routingInspectionMapper) {
		this.routingInspectionMapper = routingInspectionMapper;
	}

	public OrderListMapper getOrderListMapper() {
		return orderListMapper;
	}
	@Autowired
	public void setOrderListMapper(OrderListMapper orderListMapper) {
		this.orderListMapper = orderListMapper;
	}

	public RepairMapper getRepairMapper() {
		return repairMapper;
	}
	@Autowired
	public void setRepairMapper(RepairMapper repairMapper) {
		this.repairMapper = repairMapper;
	}

	public PostponeMapper getPostponeMapper() {
		return postponeMapper;
	}
	@Autowired
	public void setPostponeMapper(PostponeMapper postponeMapper) {
		this.postponeMapper = postponeMapper;
	}
}
