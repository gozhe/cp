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
<title>部门管理</title>
<link rel="stylesheet" type="text/css"
	href="../jquery.easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="../jquery.easyui/themes/icon.css">
<script type="text/javascript" src="../jquery.easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="../jquery.easyui/jquery.easyui.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#dgrid').datagrid({
			title : '设备管理',
			iconCls : '',// 图标
			width : 'auto',
			height : 370,
			nowrap : false,
			striped : true,
			border : true,
			collapsible : false,// 是否可折叠的
			remoteSort : false,
			idField : 'id',
			singleSelect : true,// 是否单选
			pagination : true,// 分页控件
			rownumbers : true,// 行号
			frozenColumns : [ [ {
				field : 'ck',
				checkbox : true
			} ] ],
			toolbar : [ {
				text : '新增',
				iconCls : 'icon-add',
				handler : function() {
					var row = $('#dgrid').datagrid('getSelected');
					if (row) {
						//showDetails(row.faultid);
					} else {
						$.messager.alert('消息', '请选择一条记录', '消息');
					}

				}
			}, '-', {
				text : '编辑',
				iconCls : 'icon-edit',
				handler : function() {
					var row = $('#dgrid').datagrid('getSelected');
					if (row) {
						//auditOrder(row.faultid);
					} else {
						$.messager.alert('消息', '请选择一条记录', '消息');
					}
				}
			} , '-', {
				text : '删除',
				iconCls : 'icon-remove',
				handler : function() {
					var row = $('#dgrid').datagrid('getSelected');
					if (row) {
						//auditOrder(row.faultid);
					} else {
						$.messager.alert('消息', '请选择一条记录', '消息');
					}
				}
			}]
		});
		// 设置分页控件
		var p = $('#dgrid').datagrid('getPager');
		$(p).pagination({
			pageSize : 10,// 每页显示的记录条数，默认为10
			pageList : [ 5, 10, 15 ],// 可以设置每页记录条数的列表
			beforePageText : '第',// 页数文本框前显示的汉字
			afterPageText : '页    共 {pages} 页',
			displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录',
			onSelectPage : function(pageNumber, pageSize) {
				loadData(pageNumber, pageSize);// 每次更换页面时触发更改
			}
		});
		loadData(1, 10);
	});

	var _pageNumber = 0;
	var url_getdptment = "<%=path%>/system/getEquipmentList.do?";

	function loadData(pageNumber, pageSize) {
		_pageNumber = pageNumber;
		var _pageSize = pageSize;
		var url = url_getdptment + "page=" + _pageNumber + "&rows=" + _pageSize;
		$.ajax({
			url : url,
			async : false,
			success : function(data) {
				var total = JSON.parse(data).rows[0].total;
				$('#dgrid').datagrid('loadData', JSON.parse(data));
				$('#dgrid').datagrid('getPager').pagination({
					total : total,
					pageSize : _pageSize,
					pageNumber : _pageNumbe,
				});
			}
		});
	};
</script>
</head>
<body>
	<div class="easyui-panel" title="设备查询"
		data-options="iconCls:'icon-search'" style="padding: 5px;">
		<table>
			<tr>
				<td>设备编号:</td>
				<td><input id="dptid" class="easyui-textbox"></td>
				<td>设备名称:</td>
				<td><input id="dptname" class="easyui-textbox"></td>
				<td>设备类型:</td>
				<td><select id="dpttype" class="easyui-combobox" name="sbtype"
					style="width: 150px;">
						<option value="tp1">---请选择---</option>
						<option value="tp1">类型1</option>
						<option value="tp2">类型2</option>
						<option value="tp2">类型3</option>
						<option value="tp2">类型4</option>
						<option value="tp2">类型5</option>
				</select></td>
				<td>设备型号:</td>
				<td><select id="dpttype" class="easyui-combobox" name="sbtype"
					style="width: 150px;">
						<option value="tp1">---请选择---</option>
						<option value="tp1">型号1</option>
						<option value="tp2">型号2</option>
						<option value="tp2">型号3</option>
						<option value="tp2">型号4</option>
						<option value="tp2">型号5</option>
				</select></td>
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
					<th field="equid" width="80">设备编号</th>
					<th field="stationid" width="80">分区编号</th>
					<th field="equtype" width="80">组别属性</th>
					<th field="equip" width="100">设备IP地址</th>
					<th field="equname" width="80">设备名称</th>
					<th field="equbrand" width="80">设备品牌</th>
					<th field="equmodel" width="80">设备型号</th>
					<th field="equclass" width="80">设备类型</th>
					<th field="equadminssiondate" width="80">入网如期</th>
					<th field="equdevorg" width="200">建设单位</th>
				</tr>
			</thead>
		</table>
	</div>
	<div id="dlg"></div>
</body>
</html>