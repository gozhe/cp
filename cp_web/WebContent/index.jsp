<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>昌平区社会面图像信息管理系统</title>
</head>
<frameset rows="13%,*"  border="1" >
	<frame src="top.jsp" name="top" >
	<frameset cols="25%,75%">
		<frame src="left.jsp" name="left" >
		<frameset rows="30px,*">
			<frame src="title.jsp" name="title" >
			<frame src="_sb/sbjk.jsp" name="right" >
			<!--<frame src="routecheck/getAll.do" name="right" >-->
		</frameset>
	</frameset>
</frameset>
<body>
<p></p>
</body>
</html>