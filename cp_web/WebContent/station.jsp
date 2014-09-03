<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>设备分组Tree</title>
</head>
<body>
	<div>
		<ul id="tt" class="easyui-tree" 
			data-options="url:'<%=path%>/base/getStationTree.do?dptid=001',method:'get',animate:true,checkbox:true"></ul>
	</div>
</body>
</html>