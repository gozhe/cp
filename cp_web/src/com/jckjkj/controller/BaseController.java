package com.jckjkj.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jckjkj.mybatis.model.Equipment;
import com.jckjkj.mybatis.model.EquipmentState;
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

	@RequestMapping(value = "getAll.do", method = RequestMethod.GET)
	public void getAll(HttpServletResponse response) {
		try {
			List<EquipmentState> list = baseService.getAll();
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

	@RequestMapping("getEquipAll")
	public String getEquipmentAll(HttpServletRequest request) {
		try {
			List<Equipment> list = baseService.getEquipmentAll();
			String results = JsonUtils.collection2json(list);
			System.out.println(results);
			request.setAttribute("addLists", results);
			return "listAll1";
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("InfoMessage",
					"信息载入失败！具体异常信息：" + e.getMessage());
			return "error";
		}
	}

}
