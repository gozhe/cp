package com.jckjkj.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 尹新东
 * @date 2014年6月6日 下午5:32:22
 */
public class BussinessUtils {
	
	/**
	 * 创建故障编号
	 * 
	 * @return
	 */
	public static String creatFaultID() {

		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");

		Date date = new Date();

		System.out.println("f_" + format.format(date));

		return "f_" + format.format(date);

	}
}
