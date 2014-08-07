package com.jckjkj.service;

import java.util.List;

import com.jckjkj.mybatis.model.Equipment;
import com.jckjkj.mybatis.model.EquipmentState;

public interface BaseService {

	List<EquipmentState> getAll();
	
	List<Equipment>  getEquipmentAll();
}
