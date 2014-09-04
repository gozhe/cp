package com.jckjkj.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtils {

	// 日期加(天数)
	public static java.util.Date addTimeByDay(java.util.Date date, int days)
			throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) + days);
		return calendar.getTime();
	}

	public static java.util.Date addTimeByMinutes(java.util.Date date,
			int minutes) throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.MINUTE, calendar.get(Calendar.MINUTE) + minutes);
		return calendar.getTime();
	}

	public static java.util.Date addTimeBySeconds(java.util.Date date,
			int seconds) throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND) + seconds);
		return calendar.getTime();
	}

	// 得到当前日期
	public static java.util.Date nowTime() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String datestr = sdf.format(java.util.Calendar.getInstance().getTime());

		return sdf.parse(datestr);
	}

	// 得到当前时间
	public static java.util.Date nowFullTime() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String datestr = sdf.format(java.util.Calendar.getInstance().getTime());
		return sdf.parse(datestr);
	}

	public static java.util.Date nowFullTime(String format) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String datestr = sdf.format(java.util.Calendar.getInstance().getTime());
		return sdf.parse(datestr);
	}

	public static String convertDateStrToString(String datestr, String format)
			throws Exception {
		String result = null;
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			result = sdf.format(sdf.parse(datestr));
		} catch (Exception ex) {
			sdf = new SimpleDateFormat("yyyy-MM-dd");
			result = sdf.format(sdf.parse(datestr));
		}
		return result;
	}

	public static String convertDateToString(java.util.Date date, String format)
			throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	public static java.util.Date formatDateStr(String datestr) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		return sdf.parse(datestr);
	}

	public static java.util.Date formatDateStr(String datestr, String format)
			throws Exception {
		java.util.Date result = null;
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			result = sdf.parse(datestr);
		} catch (Exception ex) {
			sdf = new SimpleDateFormat("yyyy-MM-dd");
			result = sdf.parse(datestr);
		}
		return result;
	}

	public static java.util.Date formatFullDateStr(String datestr)
			throws Exception {
		java.util.Date result = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			result = sdf.parse(datestr);
		} catch (Exception ex) {
			sdf = new SimpleDateFormat("yyyy-MM-dd");
			result = sdf.parse(datestr);
		}
		return result;
	}

}
