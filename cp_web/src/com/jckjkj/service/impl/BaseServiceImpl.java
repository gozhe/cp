package com.jckjkj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jckjkj.mybatis.dao.EquipmentMapper;
import com.jckjkj.mybatis.dao.EquipmentStateMapper;
import com.jckjkj.mybatis.model.Equipment;
import com.jckjkj.mybatis.model.EquipmentExample;
import com.jckjkj.mybatis.model.EquipmentState;
import com.jckjkj.mybatis.model.EquipmentStateExample;
import com.jckjkj.service.BaseService;

@Service("baseService")
public class BaseServiceImpl implements BaseService {

	private EquipmentStateMapper equipmentStateMapper;
	private EquipmentMapper equipmentMapper;

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

	@Override
	public List<EquipmentState> getAll() {
		// TODO Auto-generated method stub
		return equipmentStateMapper.selectAll();
	}

	@Override
	public List<Equipment> getEquipmentAll() {
		// TODO Auto-generated method stub
		EquipmentExample example = new EquipmentExample();
		example.createCriteria().andEquipIsNotNull();
		return equipmentMapper.selectByExample(example);
	}

}
