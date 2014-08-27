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

import com.jckjkj.mybatis.model.EquipmentState;
import com.jckjkj.mybatis.model.Person;
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
			//System.out.println(request.getParameter("dptid"));
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

	@RequestMapping(value = "personRegiste.do",method = RequestMethod.POST)
	public boolean personRegiste(HttpServletRequest request,
			HttpServletResponse response) {
		StringBuffer jb = new StringBuffer();
		String line = null;
		try {
			BufferedReader reader = request.getReader();
			while ((line = reader.readLine()) != null)
				jb.append(line);
		} catch (Exception e) { /* report an error */
		}
		try {
			Person person = JsonUtils.toBean(jb.toString(), Person.class);
			return  pdaService.register(person);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}
	
	
	

}
