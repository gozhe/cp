<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();

String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../css/center.css">
<title>创建工单</title>
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
	.cs3{
		width:500px;
		height:80px;
		padding-left: 20px;
		text-align: center;
	}

	textarea{
		width: 86%;
		height: 90%;
	}
	
	select{
		width:62%;
	}
	
</style>
</head>
<body>
	<table>
		<tr><td colspan="4" height="30" align="right">工单派发给手机端</td></tr>
		<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		<tr>
			<td class="cs1">工单编号</td>
			<td class="cs2"><input></td>
			<td class="cs1">设备编号</td>
			<td class="cs2"><input></td>
		</tr>
		<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		<tr>
			<td class="cs1">故障编号</td>
			<td class="cs2"><select>
						<option>备001</option>
						<option>备002</option>
						<option>备003</option>
						<option>备004</option>
						</select></td>
			<td class="cs1">故障标题</td>
			<td class="cs2"><input></td>
		</tr>
		<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		<tr>
			<td class="cs1">故障类别</td>
			<td class="cs2"><select>
						<option>类别001</option>
						<option>类别002</option>
						<option>类别003</option>
						<option>类别004</option>
						</select></td>
			<td class="cs1">故障级别</td>
			<td class="cs2"><select>
						<option>级别001</option>
						<option>级别002</option>
						<option>级别003</option>
						<option>级别004</option>
						</select></td>
		</tr>
		<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		<tr>
			<td class="cs1">故障描述</td>
			<td class="cs3" colspan="3"><textarea rows="3" cols="3"></textarea></td>
		</tr>
		<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		<tr>
			<td class="cs1">创建时间</td>
			<td class="cs2"><input></td>
			<td class="cs1">预计完成时间</td>
			<td class="cs2"><input></td>
		</tr>
		<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		<tr>
			<td class="cs1">备注信息</td>
			<td class="cs3" colspan="3"><textarea rows="3" cols="3"></textarea></td>
		</tr>
		
		
		<tr><td colspan="4" height="32px" bgcolor="#F4F4F4" align="right">
			<button style="width: 100px;height: 30px;font-family: 微软雅黑" onclick="#">表单重置</button>
			<button style="width: 100px;height: 30px;font-family: 微软雅黑" onclick="#">派发工单</button>
		</td></tr>
	</table>
</body>
</html>