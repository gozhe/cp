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
<link rel="stylesheet" style="text/css" href="css/default.css">
<title></title>
</head>
<body>
	<div id="title" style="float: left;">
		<label id="currentPath" style="float: left;">系统功能>设备监控</label>
	</div>
	<div>
		<marquee id="marquee" direction="left" behavior="scroll" width="600" height="30" 
		 scrollamount="2" scrolldelay="150" style="float: right;">
		 系统上线测试，望各部门做好测试及结果反馈工作！中心处下发！2014-07-31</marquee>
	</div>

</body>
</html>