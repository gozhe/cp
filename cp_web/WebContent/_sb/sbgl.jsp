<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>设备监控</title>
<link rel="stylesheet" type="text/css"
	href="../jquery.easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="../jquery.easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="../jquery.easyui/demo.css">
<script type="text/javascript" src="../jquery.easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="../jquery.easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="../jquery.easyui/datagrid-detailview.js"></script>
<link rel="stylesheet" type="text/css" href="../css/sb.css">
<script type="text/javascript" src="../js/sb.js"></script>
</head>
<body>
	<div>
		<div class="easyui-panel" title="设备查询" data-options="iconCls:'icon-search'" style="padding: 5px;">
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
					<td>告警类型:</td>
					<td class="td"><select id="type" class="easyui-combobox"
						name="sbtype" style="width: 150px;">
							<option value="tp1">---请选择---</option>
							<option value="tp1">类型1</option>
							<option value="tp2">类型2</option>
							<option value="tp2">类型3</option>
							<option value="tp2">类型4</option>
							<option value="tp2">类型5</option>
					</select></td>
					<td>告警状态:</td>
					<td class="td"><select id="type" class="easyui-combobox"
						name="sbtype" style="width: 150px;">
							<option value="tp1">---请选择---</option>
							<option value="tp1">状态1</option>
							<option value="tp2">状态2</option>
							<option value="tp2">状态3</option>
							<option value="tp2">状态4</option>
							<option value="tp2">状态5</option>
					</select></td>
				</tr>
				<tr>
					<td>告警源名称:</td>
					<td><input id="id" class="easyui-textbox"></td>
					<td>维修状态:</td>
					<td class="td"><select id="type" class="easyui-combobox"
						name="sbtype" style="width: 150px;">
							<option value="tp1">---请选择---</option>
							<option value="tp1">状态1</option>
							<option value="tp2">状态2</option>
							<option value="tp2">状态3</option>
							<option value="tp2">状态4</option>
							<option value="tp2">状态5</option>
					</select></td>
					<td>设备分组:</td>
					<td colspan="3"><input id="station" class="easyui-searchbox"
						data-options="prompt:'-请选择-',searcher:doSelect"
						style="width: 150px;"></td>
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
						<th field="equid" width="100">设备编号(名称)</th>
						<th field="equtype" width="60">设备类型</th>
						<th field="warningclass" width="80">告警类型</th>
						<th field="warninggrade" width="80">告警等级</th>
						<th field="warningstate" width="80">告警状态</th>
						<th field="warningsourcename" width="100">告警源名称</th>
						<th field="warningsourceip" width="120">告警源地址</th>
						<th field="warningcount" width="80">累计次数</th>
						<th field="ifreparing" width="80">维修状态</th>
						<th field="refreshtime" width="150">监测时间</th>
					</tr>
				</thead>
			</table>
		</div>
	</div>
	<div id="dlg"></div>
</body>
</html>
