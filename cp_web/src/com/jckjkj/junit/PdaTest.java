package com.jckjkj.junit;

import java.io.IOException;

import com.jckjkj.mybatis.model.Person;
import com.jckjkj.utils.HttpRequest;
import com.jckjkj.utils.JsonUtils;

public class PdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = HttpRequest.sendGet(
				"http://localhost:8080/cp_web/pda/getPersonList.do",
				"dptid=w001");
		//System.out.println(res);
		
		Person p = new Person();
		p.setId(6);
		p.setPername("尹新东12356");
		p.setSex(0);
		p.setDptid("w001");
		p.setTel("1371727121");
		String param = JsonUtils.bean2json(p);
		HttpRequest.sendPost1("http://localhost:8080/cp_web/pda/personRegiste.do", param);
	}

}
