<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<link rel="stylesheet" type="text/css" href="../css/center.css">
<title>设备明细</title>
<style type="text/css">
	.cs1{
		width:140px;
		height:32px;
		background-color: #F4F4F4;
		padding-left: 20px;
		text-align: left;
	}
	.cs2{
		width:240px;
		height:32px;
		padding-left: 20px;
		text-align: center;
	}

</style>
</head>
<body>
	<table>
		<tr><td colspan="4" height="30" align="right">${ResultList.equid}-设备的详细信息</td></tr>
		<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		<tr>
			<td class="cs1">设备编号</td>
			<td class="cs2">${ResultList.equid}</td>
			<td class="cs1">组别属性</td>
			<td class="cs2">${ResultList.equid}</td>
		</tr>
		<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		<tr>
			<td class="cs1">IP地址</td>
			<td class="cs2">${ResultList.equid}</td>
			<td class="cs1">设备名称</td>
			<td class="cs2">${ResultList.equid}</td>
		</tr>
		<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		<tr>
			<td class="cs1">子网掩码</td>
			<td class="cs2">${ResultList.equid}</td>
			<td class="cs1">网关</td>
			<td class="cs2">${ResultList.equid}</td>
		</tr>
		<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		<tr>
			<td class="cs1">操作系统</td>
			<td class="cs2">${ResultList.equid}</td>
			<td class="cs1">开机用户名</td>
			<td class="cs2">${ResultList.equid}</td>
		</tr>
		<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		<tr>
			<td class="cs1">开机密码</td>
			<td class="cs2">${ResultList.equid}</td>
			<td class="cs1">软件用户名</td>
			<td class="cs2">${ResultList.equid}</td>
		</tr>
		<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		<tr>
			<td class="cs1">软件密码</td>
			<td class="cs2">${ResultList.equid}</td>
			<td class="cs1">端口号</td>
			<td class="cs2">${ResultList.equid}</td>
		</tr>
		<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		<tr>
			<td class="cs1">ntp地址</td>
			<td class="cs2">${ResultList.equid}</td>
			<td class="cs1">软件名称和版本</td>
			<td class="cs2">${ResultList.equid}</td>
		</tr>
		<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		<tr>
			<td class="cs1">设备品牌</td>
			<td class="cs2">${ResultList.equid}</td>
			<td class="cs1">设备型号</td>
			<td class="cs2">${ResultList.equid}</td>
		</tr>
		<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		<tr>
			<td class="cs1">设备类别</td>
			<td class="cs2">${ResultList.equid}</td>
			<td class="cs1">入网日期</td>
			<td class="cs2">${ResultList.equid}</td>
		</tr>
		<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		<tr>
			<td class="cs1">建设单位</td>
			<td class="cs2">${ResultList.equid}</td>
			<td class="cs1">备注1</td>
			<td class="cs2">${ResultList.equid}</td>
		</tr>
		<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		
		<tr><td colspan="4" height="32px" bgcolor="#F4F4F4" align="right">
			<button style="width: 100px;height: 30px;font-family: 微软雅黑" onclick="javascript:window.location.href='../_gd/gdpf.jsp'">创建工单</button>
		</td></tr>
	</table>
</body>
</html>