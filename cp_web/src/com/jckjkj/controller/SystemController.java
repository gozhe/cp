package com.jckjkj.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jckjkj.mybatis.model.Department;
import com.jckjkj.mybatis.model.Equipment;
import com.jckjkj.mybatis.model.EquipmentState;
import com.jckjkj.mybatis.model.Mobile;
import com.jckjkj.mybatis.model.User;
import com.jckjkj.service.SystemService;
import com.jckjkj.utils.JsonUtils;

@Controller
public class SystemController {

	private SystemService systemService;

	public SystemService getSystemService() {
		return systemService;
	}

	@Autowired
	public void setSystemService(SystemService systemService) {
		this.systemService = systemService;
	}

	@RequestMapping("getDepartmentList")
	public void getDepartmentList(HttpServletRequest request,
			HttpServletResponse response) {
		try {
			String page = request.getParameter("page");
			String rows = request.getParameter("rows");
			int intPage = Integer.parseInt(page);
			int number = Integer.parseInt(rows);
			int start = (intPage - 1) * number;
			List<Department> list = systemService.getDepartmentList(start,
					number);
			int total = systemService.getDepartmentList().size();
			Map<String, Object> jsonMap = new HashMap<String, Object>();// 定义map
			jsonMap.put("total", total);
			jsonMap.put("rows", list);
			String results = JsonUtils.map2json(jsonMap);// 格式化result
			System.out.println(results);
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=UTF-8");
			response.getWriter().write(results);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("getPhoneList")
	public void getPhoneList(HttpServletRequest request,
			HttpServletResponse response) {
		try {
			String page = request.getParameter("page");
			String rows = request.getParameter("rows");
			int intPage = Integer.parseInt(page);
			int number = Integer.parseInt(rows);
			int start = (intPage - 1) * number;
			List<Mobile> list = systemService.getMobileList(start, number);
			int total = systemService.getMobileList().size();
			Map<String, Object> jsonMap = new HashMap<String, Object>();// 定义map
			jsonMap.put("total", total);
			jsonMap.put("rows", list);
			String results = JsonUtils.map2json(jsonMap);// 格式化result
			System.out.println(results);
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=UTF-8");
			response.getWriter().write(results);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping("getUserList")
	public void getUserList(HttpServletRequest request,
			HttpServletResponse response) {
		try {
			String page = request.getParameter("page");
			String rows = request.getParameter("rows");
			int intPage = Integer.parseInt(page);
			int number = Integer.parseInt(rows);
			int start = (intPage - 1) * number;
			List<User> list = systemService.getUserList(start, number);
			int total = systemService.getUserList().size();
			Map<String, Object> jsonMap = new HashMap<String, Object>();// 定义map
			jsonMap.put("total", total);
			jsonMap.put("rows", list);
			String results = JsonUtils.map2json(jsonMap);// 格式化result
			System.out.println(results);
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=UTF-8");
			response.getWriter().write(results);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("getEquipmentList")
	public void getEquipmentList(HttpServletRequest request,
			HttpServletResponse response) {
		try {
			String page = request.getParameter("page");
			String rows = request.getParameter("rows");
			int intPage = Integer.parseInt(page);
			int number = Integer.parseInt(rows);
			int start = (intPage - 1) * number;
			List<Equipment> list = systemService
					.getEquipmentList(start, number);
			int total = systemService.getEquipmentList().size();
			Map<String, Object> jsonMap = new HashMap<String, Object>();// 定义map
			jsonMap.put("total", total);
			jsonMap.put("rows", list);
			String results = JsonUtils.map2json(jsonMap);// 格式化result
			System.out.println(results);
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=UTF-8");
			response.getWriter().write(results);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
