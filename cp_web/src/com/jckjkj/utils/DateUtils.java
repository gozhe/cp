package com.jckjkj.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.aspectj.weaver.ast.Var;

public class DateUtils {

	private static SimpleDateFormat DateAndTimeFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	private static SimpleDateFormat DateFormat=new SimpleDateFormat("yyyy-MM-dd"); 
	private static SimpleDateFormat DateFormat2=new SimpleDateFormat("yyyy-MM"); 
	/**
	 * 返回日期和时间字符串形式(yyyy-MM-dd HH:mm:ss)
	 * @param args
	 */
	public static String getDateAndTimeString(Date date) {
		// TODO Auto-generated method stub
		return DateAndTimeFormat.format(date);
	}
	/**
	 * 返回日期字符串形式(yyyy-MM-dd)
	 * @param args
	 */
	public static String getDateString(Date date) {
		// TODO Auto-generated method stub
		return DateFormat.format(date);
	}
	/**
	 * 返回日期和时间(yyyy-MM-dd HH:mm:ss)
	 * @param args
	 */
	public static Date getDateAndTime(String str) {
		// TODO Auto-generated method stub
		Date date;
		try {
			date= DateAndTimeFormat.parse(str);
			return date;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 返回日期(yyyy-MM-dd)
	 * @param args
	 */
	public static Date getDate(String str) {
		// TODO Auto-generated method stub
		Date date;
		try {
			date= DateFormat.parse(str);
			return date;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 返回日期(yyyy-MM)
	 * @param args
	 */
	public static Date getDate2(String str) {
		// TODO Auto-generated method stub
		Date date;
		try {
			date= DateFormat2.parse(str);
			return date;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
    
	/** 获取当前月末日期*/
	public static Date  getMonthLastDay()
	{ 
		Calendar calendar = Calendar.getInstance(); 
		calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR)); 
		calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH)); 
		int endday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); 
		String string=calendar.get(Calendar.YEAR)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"+endday+" 23:59:59";
		System.out.println(string); 
		return getDateAndTime(string);
	}
	/** 获取当前月01日期*/
	public static Date  getMonthFirstDay()
	{ 
		Calendar calendar = Calendar.getInstance(); 
		calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR)); 
		calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH)); 
		String string=calendar.get(Calendar.YEAR)+"-"+(calendar.get(Calendar.MONTH)+1)+"-01";
		System.out.println(string); 
		return getDate(string);
	}

}
