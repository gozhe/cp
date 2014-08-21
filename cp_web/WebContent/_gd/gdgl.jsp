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
<title>工单管理</title>
<link rel="stylesheet" type="text/css" href="../css/default.css">
<link rel="stylesheet" type="text/css"
	href="../jquery.datatable/css/jquery.dataTables.css">
<script type="text/javascript" src="../jquery.datatable/js/jquery.js"></script>
<script type="text/javascript"
	src="../jquery.datatable/js/jquery.dataTables.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#example').dataTable({
			"oLanguage" : {
				"sLengthMenu" : "每页显示 _MENU_ 条记录",
				"sZeroRecords" : "抱歉， 没有找到",
				"sInfo" : "从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
				"sInfoEmpty" : "没有数据",
				"sInfoFiltered" : "(从 _MAX_ 条数据中检索)",
				"oPaginate" : {
					"sFirst" : "首页",
					"sPrevious" : "前一页",
					"sNext" : "后一页",
					"sLast" : "尾页"
				},
				"sSearch" : "搜索",
				"sZeroRecords" : "没有检索到数据"
			}
		});
	});
</script>
</head>
<body>
	<div><img alt="" src="../images/exit.png" style="vertical-align: middle;">
	<span></span>工单记录查询</div>
	<div>
		<table>
			<tr>
				<td>设备分组:</td>
				<td>
					<select style="width: 150px;">
						<option>分组1</option>
						<option>分组2</option>
					</select>
				</td>
				<td>创建日期:</td>
				<td><input /></td>
				<td><button id="query" style="width: 100px">查询</button></td>
			</tr>
		</table>
	</div>
	<img alt="" src="../images/line.png"
		style="height: 1px; margin-top: 12px;">
	<div>
		<table id="example" class="display" cellspacing="0" width="100%">
			<thead>
				<tr>
					<th>工单编号</th>
					<th>设备编号</th>
					<th>故障标题</th>
					<th>故障类别</th>
					<th>故障级别</th>
					<th>创建时间</th>
					<th>工单状态</th>
					<th>详情</th>
				</tr>
			</thead>
			 <tbody>
		       <c:forEach var="list"  items="${ResultList}">
			    	<tr class="mid">
			    		<td align="center">${list.orderid}</td>
			    		<td>${list.equid}</td>
			    		<td>${list.faulttitle}</td>
			    		<td>${list.faultclass}</td>
			    		<td>${list.faultgrade}</td>
			    		<td>${list.createtime}</td>
			    		<td>${list.orderstate}</td>
			    		<td><a href="">详情</a></td>
			    	</tr>
		    	</c:forEach> 
		    </tbody>
		</table>
	</div>
</body>
</html>