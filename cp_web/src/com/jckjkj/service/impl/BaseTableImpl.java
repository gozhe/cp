package com.jckjkj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.jckjkj.mybatis.dao.AuditopionMapper;
import com.jckjkj.mybatis.dao.CameraMapper;
import com.jckjkj.mybatis.dao.DepartmentMapper;
import com.jckjkj.mybatis.dao.DictionaryMapper;
import com.jckjkj.mybatis.dao.EquipmentMapper;
import com.jckjkj.mybatis.dao.EquipmentStateMapper;
import com.jckjkj.mybatis.dao.FaultGradeMapper;
import com.jckjkj.mybatis.dao.MobileMapper;
import com.jckjkj.mybatis.dao.ModuleMapper;
import com.jckjkj.mybatis.dao.OfflineRecordMapper;
import com.jckjkj.mybatis.dao.OrderListMapper;
import com.jckjkj.mybatis.dao.PersionMapper;
import com.jckjkj.mybatis.dao.RepairResultMapper;
import com.jckjkj.mybatis.dao.RoutingInspectionMapper;
import com.jckjkj.mybatis.dao.StationMapper;
import com.jckjkj.mybatis.dao.UserMapper;
import com.jckjkj.mybatis.model.Camera;
import com.jckjkj.mybatis.model.Department;
import com.jckjkj.mybatis.model.Station;

public class BaseTableImpl{

	private CameraMapper cameraMapper;
	private StationMapper stationMapper;
	private AuditopionMapper auditopinionMapper;
	private DictionaryMapper dictionaryMapper;
	private DepartmentMapper departmentMapper;
	private EquipmentMapper equipmentMapper;
	private EquipmentStateMapper equipmentStateMapper;
	private FaultGradeMapper faultGradeMapper;
	private MobileMapper mobileMapper;
	private ModuleMapper moduleMapper;
	private OfflineRecordMapper offlineRecordMapper;
	private OrderListMapper orderListMapper; 
	private PersionMapper persionMapper;
	private RepairResultMapper repairResultMapper;
	private RoutingInspectionMapper routingInspectionMapper;
	private UserMapper userMapper;

	public void inserDataTest(){
		
	}
	
	public void updateDataTest(){
		
	}
	
	public CameraMapper getCameraMapper() {
		return cameraMapper;
	}

	@Autowired
	public void setCameraMapper(CameraMapper cameraMapper) {
		this.cameraMapper = cameraMapper;
	}

	public StationMapper getStationMapper() {
		return stationMapper;
	}

	@Autowired
	public void setStationMapper(StationMapper stationMapper) {
		this.stationMapper = stationMapper;
	}

	public AuditopionMapper getAuditopinionMapper() {
		return auditopinionMapper;
	}

	@Autowired
	public void setAuditopinionMapper(AuditopionMapper auditopinionMapper) {
		this.auditopinionMapper = auditopinionMapper;
	}

	public DictionaryMapper getDictionaryMapper() {
		return dictionaryMapper;
	}

	@Autowired
	public void setDictionaryMapper(DictionaryMapper dictionaryMapper) {
		this.dictionaryMapper = dictionaryMapper;
	}

	public DepartmentMapper getDepartmentMapper() {
		return departmentMapper;
	}

	@Autowired
	public void setDepartmentMapper(DepartmentMapper departmentMapper) {
		this.departmentMapper = departmentMapper;
	}

	public EquipmentMapper getEquipmentMapper() {
		return equipmentMapper;
	}

	@Autowired
	public void setEquipmentMapper(EquipmentMapper equipmentMapper) {
		this.equipmentMapper = equipmentMapper;
	}

	public EquipmentStateMapper getEquipmentStateMapper() {
		return equipmentStateMapper;
	}

	@Autowired
	public void setEquipmentStateMapper(
			EquipmentStateMapper equipmentStateMapper) {
		this.equipmentStateMapper = equipmentStateMapper;
	}

	public FaultGradeMapper getFaultGradeMapper() {
		return faultGradeMapper;
	}

	@Autowired
	public void setFaultGradeMapper(FaultGradeMapper faultGradeMapper) {
		this.faultGradeMapper = faultGradeMapper;
	}

	public MobileMapper getMobileMapper() {
		return mobileMapper;
	}

	@Autowired
	public void setMobileMapper(MobileMapper mobileMapper) {
		this.mobileMapper = mobileMapper;
	}

	public ModuleMapper getModuleMapper() {
		return moduleMapper;
	}

	@Autowired
	public void setModuleMapper(ModuleMapper moduleMapper) {
		this.moduleMapper = moduleMapper;
	}

	public OfflineRecordMapper getOfflineRecordMapper() {
		return offlineRecordMapper;
	}

	@Autowired
	public void setOfflineRecordMapper(OfflineRecordMapper offlineRecordMapper) {
		this.offlineRecordMapper = offlineRecordMapper;
	}

	public OrderListMapper getOrderListMapper() {
		return orderListMapper;
	}

	@Autowired
	public void setOrderListMapper(OrderListMapper orderListMapper) {
		this.orderListMapper = orderListMapper;
	}

	public PersionMapper getPersionMapper() {
		return persionMapper;
	}

	@Autowired
	public void setPersionMapper(PersionMapper persionMapper) {
		this.persionMapper = persionMapper;
	}

	public RepairResultMapper getRepairResultMapper() {
		return repairResultMapper;
	}

	@Autowired
	public void setRepairResultMapper(RepairResultMapper repairResultMapper) {
		this.repairResultMapper = repairResultMapper;
	}

	public RoutingInspectionMapper getRoutingInspectionMapper() {
		return routingInspectionMapper;
	}

	@Autowired
	public void setRoutingInspectionMapper(
			RoutingInspectionMapper routingInspectionMapper) {
		this.routingInspectionMapper = routingInspectionMapper;
	}

	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

}
