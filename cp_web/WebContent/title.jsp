<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
String path = request.getContextPath();

String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" style="text/css" href="css/title.css">
<link rel="stylesheet" type="text/css"
	href="../jquery.easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="../jquery.easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="../jquery.easyui/demo.css">
<script type="text/javascript" src="../jquery.easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="../jquery.easyui/jquery.easyui.min.js"></script>
<title></title>
</head>
<body>
	
		<div id="title" style="float: left;height: 26px;width:180px;">
			<img alt="" src="images/navi.png" style="border: 0px; float: left;width:26px;height: 26px; ">
			<div style="float: left;line-height: 26px;font-family: 微软雅黑;">
				<span>当前位置：</span>
				<a href="#">设备监控</a>
			</div>
		</div>
		<div style="float: left;height: 26px;line-height: 26px;margin-left: 40px;">
			最新通告：<marquee id="marquee" direction="left" behavior="scroll" width="500" height="26" 
			 scrollamount="2" scrolldelay="150" style="float: right;color: red;">
			 系统上线测试，望各部门做好测试及结果反馈工作！中心处下发！2014-07-31</marquee>
		</div>
		<div style="float: right;height: 26px;line-height: 26px;margin-right: 25px;padding-left: 10px;">
			<span>欢迎您:</span>
			<span>尹新东</span>
			<span>部门:</span>
			<span>信通处</span>
		</div>

</body>
</html>