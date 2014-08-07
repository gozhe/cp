package com.jckjkj.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jckjkj.mybatis.model.RoutingInspectionModel;
import com.jckjkj.service.RouteCheckService;
import com.jckjkj.utils.JsonUtils;

@Controller
public class RouteCheckController {
	private RouteCheckService routeCheckService;

	public RouteCheckService getRouteCheckService() {
		return routeCheckService;
	}
	@Autowired
	public void setRouteCheckService(RouteCheckService routeCheckService) {
		this.routeCheckService = routeCheckService;
	}
	
//	@RequestMapping(value = "getAll.do", method = RequestMethod.GET)
//	public void getAll(PrintWriter printWriter) {
//		try {
//			List<EquipmentState> list = baseService.getAll();
//			String results = JsonUtils.collection2json(list);
//			System.out.println(list);
//			printWriter.write(results);
//			printWriter.flush();
//			printWriter.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
	@RequestMapping("getAll")
	public String getRouteCheckInfoAll(HttpServletRequest request){
		
		try {		
			List<RoutingInspectionModel> list = routeCheckService.getAll();
			request.setAttribute("ResultList", list);
			return "_xj/listAll";
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("InfoMessage", "" + e.getMessage());
			return "result";
		}
	}

}
