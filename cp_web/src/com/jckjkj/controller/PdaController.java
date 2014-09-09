package com.jckjkj.controller;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jckjkj.mybatis.model.EquipmentState;
import com.jckjkj.mybatis.model.Person;
import com.jckjkj.mybatis.model.RoutingInspection;
import com.jckjkj.mybatis.model.VEquipRouting;
import com.jckjkj.service.PdaService;
import com.jckjkj.utils.JsonUtils;

@Controller
public class PdaController {

	private PdaService pdaService;

	public PdaService getPdaService() {
		return pdaService;
	}

	@Autowired
	public void setPdaService(PdaService pdaService) {
		this.pdaService = pdaService;
	}

	@RequestMapping(value = "getPersonList.do", method = RequestMethod.GET)
	public void getPersonList(@RequestParam("dptid") String dptid,
			HttpServletResponse response) {
		try {
			// System.out.println(request.getParameter("dptid"));
			List<Person> list = pdaService.getPerson(dptid);
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

	@RequestMapping("personRegiste.do")
	public void personRegiste(HttpServletRequest request,
			HttpServletResponse response) {
		Person entity = new Person();
		try {
			response.setContentType("text/html;charset=utf-8");
			response.setCharacterEncoding("utf-8");
			request.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();
			String pername = request.getParameter("pername");
			String dptid = request.getParameter("dptid");
			String tel = request.getParameter("tel");
			int sex = Integer.valueOf(request.getParameter("sex"));
			entity.setDptid(dptid);
			entity.setPername(pername);
			entity.setSex(sex);
			entity.setTel(tel);

			boolean result = pdaService.register(entity);
			if (result) {
				out.print("succeeded!");
			} else {
				out.print("error!");
			}
			out.flush();
			out.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@RequestMapping("getRoutingInspInfo")
	public void getRoutingInspInfo(HttpServletRequest request,
			HttpServletResponse response) {
		try {
			response.setContentType("text/html;charset=utf-8");
			response.setCharacterEncoding("utf-8");
			request.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();
			String mid = request.getParameter("mid");
			List<VEquipRouting> list = pdaService.getRoutingInspInfo(mid);
			String result = JsonUtils.collection2json(list);
			out.print(result);
			out.flush();
			out.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@RequestMapping("uploadRoutingInsp")
	public void uploadRoutingInsp(HttpServletRequest request,
			HttpServletResponse response){
		RoutingInspection entity = new RoutingInspection();
		try{
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			response.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();
			
			String equid= request.getParameter("equid");
			String signintime = request.getParameter("signintime");
			String signinlongitude = request.getParameter("signinlongitude");
			String signinlatitude = request.getParameter("signinlatitude");
			String equstate= request.getParameter("equstate");
			String roudescription = request.getParameter("roudescription");
			String personid = request.getParameter("personid");
			
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

}
