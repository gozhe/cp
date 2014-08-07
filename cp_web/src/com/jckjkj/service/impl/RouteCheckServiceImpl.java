package com.jckjkj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jckjkj.mybatis.dao.RoutingInspectionModelMapper;
import com.jckjkj.mybatis.model.RoutingInspectionModel;
import com.jckjkj.mybatis.model.RoutingInspectionModelExample;
import com.jckjkj.service.RouteCheckService;

@Service("routeCheckService")
public class RouteCheckServiceImpl implements RouteCheckService {

	private RoutingInspectionModelMapper routeCheckMapper;
	
	public RoutingInspectionModelMapper getRouteCheckMapper() {
		return routeCheckMapper;
	}
	@Autowired
	public void setRouteCheckMapper(RoutingInspectionModelMapper routeCheckMapper) {
		this.routeCheckMapper = routeCheckMapper;
	}
	
	@Override
	public List<RoutingInspectionModel> getAll() {
		RoutingInspectionModelExample example = new RoutingInspectionModelExample();
		example.createCriteria().andRouidIsNotNull();
		return routeCheckMapper.selectByExample(example);
	}


}
