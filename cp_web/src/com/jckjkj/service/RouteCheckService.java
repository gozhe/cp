package com.jckjkj.service;

import java.util.List;

import com.jckjkj.mybatis.model.RoutingInspectionModel;

public interface RouteCheckService {

	List<RoutingInspectionModel> getAll();
	
}
