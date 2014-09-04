package com.jckjkj.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jckjkj.mybatis.model.Equipment;
import com.jckjkj.mybatis.model.EquipmentState;
import com.jckjkj.mybatis.model.OrderList;
import com.jckjkj.mybatis.model.Person;
import com.jckjkj.mybatis.model.RoutingInspection;
import com.jckjkj.mybatis.model.Station;
import com.jckjkj.service.BaseService;
import com.jckjkj.utils.BussinessUtils;
import com.jckjkj.utils.DateUtils;
import com.jckjkj.utils.JsonUtils;
import com.jckjkj.utils.TreeJson;

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

	@RequestMapping("getStationTree.do")
	public void getStationTree(@RequestParam("dptid") String dptid,
			HttpServletResponse response) {
		List<TreeJson> list = TreeJson.formatTree(baseService
				.getStationTree(dptid));
		String result = JsonUtils.collection2json(list);
		System.out.println(result);

		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		try {
			response.getWriter().write(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@RequestMapping(value = "getEquipmentStateList.do", method = RequestMethod.GET)
	public void getEquipmentStateList(@RequestParam("dptid") String dptid,
			@RequestParam("rows") String rows,
			@RequestParam("page") String page, HttpServletRequest request,
			HttpServletResponse response) {
		try {
			// easyui datagrid 自身会通过 post 的形式传递 rows and page
			int intPage = Integer.parseInt(page);
			int number = Integer.parseInt(rows);
			System.out.println(intPage);
			System.out.println(number);

			// 每页的开始记录 第一页为1 第二页为number +1
			int start = (intPage - 1) * number;

			List<EquipmentState> list = baseService.getEquipmentStateList(
					dptid, start, number);

			Map<String, Object> jsonMap = new HashMap<String, Object>();// 定义map
			jsonMap.put("total", baseService.getEquipmentStateCount(dptid));// total键
																			// 存放总记录数，必须的
			jsonMap.put("rows", list);// rows键 存放每页记录 list

			String results = JsonUtils.map2json(jsonMap);// 格式化result
															// 一定要是JSONObject
			System.out.println(results);

			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=UTF-8");
			response.getWriter().write(results);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("getEquipmentDetail.do")
	public String getEquipmentDetail(@RequestParam("equid") String equid,
			HttpServletRequest request, HttpServletResponse response) {
		try {
			Equipment equipment = baseService.getEquipmentDetail(equid);
			// String results = JsonUtils.bean2json(equipment);
			// System.out.println(results);
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=UTF-8");
			// response.getWriter().write(results);

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
			return "_xj/listAll";
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("InfoMessage", "" + e.getMessage());
			return "error";
		}
	}

	@RequestMapping("InitWhenCreatOrder.do")
	public String InitWhenCreatOrder(HttpServletRequest request) {
		try {
			String equid = request.getParameter("equid").toString();
			Map<String, Object> infos = new HashMap<String, Object>();
			infos.put("equid", equid);
			infos.put("equname", equid);
			infos.put("createtime", DateUtils.convertDateToString(new Date(),
					"yyyy-MM-dd HH:mm:ss"));
			System.out.println("haha");
			// 故障编号-自动生成唯一识别码、不可编辑
			//String faultid = java.util.UUID.randomUUID().toString();
			String faultid = BussinessUtils.creatFaultID();
			infos.put("faultid", faultid);
			// List<OrderList> list = baseService.getOrderList();
			request.setAttribute("ResultList", infos);
			return "_gd/gdpf";
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("InfoMessage", "" + e.getMessage());
			return "error";
		}
	}

	@RequestMapping("getOrderList.do")
	public String getOrderList(HttpServletRequest request) {
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

	@RequestMapping("DoOrderDispatch.do")
	public void DoOrderDispatch(HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("Insert x_orderlist");
		String results = "";
		OrderList entity = new OrderList();
		try {
			String equid = request.getParameter("equid").toString();
			String createtime = request.getParameter("createtime").toString();
			String faultid = request.getParameter("faultid").toString();
			String faulttitle = request.getParameter("faulttitle").toString();
			String faultclass = request.getParameter("faultclass").toString();
			String faultclass1 = request.getParameter("faultclass1").toString();
			String faultgrade = request.getParameter("faultgrade").toString();
			String faultdescription = request.getParameter("faultdescription")
					.toString();
			
			
			String estcomptime = request.getParameter("estcomptime")
					.toString();
			estcomptime= DateUtils.convertDateToString(new Date(estcomptime),"yyyy-MM-dd HH:mm:ss");
			
			entity.setEquid(equid);
			entity.setCreatetime(DateUtils.formatFullDateStr(createtime));
			entity.setFaultid(faultid);
			entity.setFaulttitle(faulttitle);
			entity.setFaultclass(faultclass);
			entity.setFaultclass1(faultclass1);
			entity.setFaultgrade(faultgrade);
			entity.setFaultdescription(faultdescription);
			entity.setEstcomptime(DateUtils.formatFullDateStr(estcomptime));
			entity.setOrderstate(0);//状态-未接单0
			entity.setOrdersource(0);//来源-系统创建0
			
			if (baseService.OrderDispatch(entity)) {
				results = "success";
			} else {
				results = "error";
			}
			System.out.println(results);
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=UTF-8");
			response.getWriter().write(results);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}	
		
	}
}
