<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>工单管理</title>
<link rel="stylesheet" type="text/css" href="../jquery.easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../jquery.easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="../jquery.easyui/demo.css">
<script type="text/javascript" src="../jquery.easyui/jquery.min.js"></script>
<script type="text/javascript" src="../jquery.easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../jquery.easyui/datagrid-detailview.js"></script>

<link rel="stylesheet" type="text/css" href="../css/gd.css">	
<script type="text/javascript" src="../js/gd.js"></script>
</head>
<body>
	<div class="easyui-panel" title="工单查询" data-options="iconCls:'icon-search'" style="padding: 5px;">
			<table>
				<tr>
					<td>设备编号:</td>
					<td><input id="id" class="easyui-textbox"></td>
					<td>设备类型:</td>
					<td><select id="type" class="easyui-combobox" name="sbtype"
						style="width: 150px;">
							<option value="tp1">---请选择---</option>
							<option value="tp1">类型1</option>
							<option value="tp2">类型2</option>
							<option value="tp2">类型3</option>
							<option value="tp2">类型4</option>
							<option value="tp2">类型5</option>
					</select></td>
					<td>设备分组:</td>
					<td colspan="3"><input id="station" class="easyui-searchbox"
						data-options="prompt:'-请选择-',searcher:doSelect"
						style="width: 150px;"></td>
				<tr>
					<td>起始时间:</td>
					<td><input id="id" class="easyui-datetimebox"></td>
					<td>结束时间:</td>
					<td><input id="id" class="easyui-datetimebox"></td>
				</tr>
			</table>
			<div style="margin-top: 5px; float: right;">
				<a href="#" class="easyui-linkbutton" onclick="queryMe();"
					data-options="iconCls:'icon-search'" style="width: 80px">查询</a> <a
					href="#" class="easyui-linkbutton"
					data-options="iconCls:'icon-reload'" style="width: 80px">重置</a>
			</div>
		</div>
		<div class="dlist" style="margin-top: 20px;">
			<table id="dgrid" cellspacing="0" cellpadding="0">
				<thead>
					<tr>
						<th field="equid" width="80">设备标识</th>
						<th field="faultid" width="140">故障编号</th>
						<th field="faulttitle" width="100">故障标题</th>
						<th field="faultgrade" width="60">故障级别</th>
						<th field="faultclass" width="60">故障类别</th>
						<th field="createtime" width="160">创建时间</th>
						<th field="estcomptime" width="160">预计完成时间</th>
						<th field="orderstate" width="80">工单状态</th>
						<th field="ordersource" width="80">工单来源</th>
					</tr>
				</thead>
			</table>
		</div>
		<div id="dlg"></div>
</body>
</html>