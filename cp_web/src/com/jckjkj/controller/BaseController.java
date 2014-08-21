package com.jckjkj.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jckjkj.mybatis.model.Equipment;
import com.jckjkj.mybatis.model.EquipmentState;
import com.jckjkj.mybatis.model.OrderList;
import com.jckjkj.mybatis.model.RoutingInspection;
import com.jckjkj.service.BaseService;
import com.jckjkj.utils.JsonUtils;

@Controller
public class BaseController {

	private BaseService baseService;

	public BaseService getBaseService() {
		return baseService;
	}

	@Autowired
	public void setBaseService(BaseService baseService) {
		this.baseService = baseService;
	}

	@RequestMapping(value = "getEquipmentStateList.do", method = RequestMethod.GET)
	public void getEquipmentStateList(@RequestParam("dptid") String dptid,
			HttpServletResponse response) {
		try {
			List<EquipmentState> list = baseService
					.getEquipmentStateList(dptid);
			String results = JsonUtils.collection2json(list);
			System.out.println(results);
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter pw = response.getWriter();
			pw.write(results);
			pw.flush();
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("getEquipmentDetail.do")
	public String getEquipmentDetail(@RequestParam("equid") String equid,
			HttpServletRequest request) {
		try {
			Equipment equipment = baseService.getEquipmentDetail(equid);
			//String results = JsonUtils.bean2json(equipment);
			//System.out.println(results);
			request.setAttribute("ResultList", equipment);
			return "_sb/sbxx";
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("InfoMessage", "error" + e.getMessage());
			return "error";
		}
	}

	@RequestMapping("getRoutingInspectionList.do")
	public String getRoutingInspectionList(HttpServletRequest request) {
		try {
			List<RoutingInspection> list = baseService
					.getRoutingInspectionList();
			request.setAttribute("ResultList", list);
			return "_xj/xjgl";
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("InfoMessage", "" + e.getMessage());
			return "error";
		}
	}
	
	@RequestMapping("getOrderList.do")
	public String getOrderList(HttpServletRequest request){
		try {
			List<OrderList> list = baseService.getOrderList();
			request.setAttribute("ResultList", list);
			return "_gd/gdgl";
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("InfoMessage", "" + e.getMessage());
			return "error";
		}
	}

}
