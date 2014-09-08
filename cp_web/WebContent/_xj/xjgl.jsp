<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>巡检管理</title>
<link rel="stylesheet" type="text/css"
	href="../jquery.easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="../jquery.easyui/themes/icon.css">
<script type="text/javascript" src="../jquery.easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="../jquery.easyui/jquery.easyui.min.js"></script>
<style type="text/css">
body {
	font-family: 微软雅黑;
}
.cs1 {
	width: 80px;
	height: 24px;
	background-color: #F4F4F4;
	padding-left: 4px;
	text-align: left;
}

.cs2 {
	width: 120px;
	height: 24px;
	padding-left: 2px;
	text-align: center;
}

hr {
	height: 0.1px;
	border: none;
	border-top: 1px dashed #0066CC;
}

</style>
<script type="text/javascript">
	$(function() {
		$('#dgrid').datagrid({
			title : '巡检管理',
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
				text : '查看详情',
				iconCls : 'icon-add',
				handler : function() {
					var row = $('#dgrid').datagrid('getSelected');
					if (row) {
						showDetails(row.id);
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
	var url_getRoutInsp = "<%=path%>/base/getRoutingInspectionList.do?";

	function loadData(pageNumber, pageSize) {
		_pageNumber = pageNumber;
		var _pageSize = pageSize;
		var url = url_getRoutInsp + "page=" + _pageNumber + "&rows="
				+ _pageSize;
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
	
	
	function doSelect() {
		$('#dlg').dialog({
			title : '设备分组',
			iconCls : "icon-search",
			collapsible : false,
			minimizable : false,
			maximizable : false,
			resizable : true,
			width : 380,
			height : 300,
			modal : true,
			cache : false,
			href : '../station.jsp',
			onClose : function() {
				getChecked();
			},
		});
	};

	function getChecked() {
		var nodes = $('#tt').tree('getChecked');
		var s = '';
		for (var i = 0; i < nodes.length; i++) {
			if (s != '')
				s += ',';
			s += nodes[i].text;
		}
		$('#station').searchbox("setValue", s);
	}
	var url_equdetail = "<%=path%>/base/getRoutingInspectionDetail.do?";

	function showDetails(id) {
		$('#dlg').dialog({
			title : '设备明细',
			iconCls : "icon-search",
			collapsible : false,
			minimizable : false,
			maximizable : false,
			resizable : true,
			width : 600,
			height : 370,
			modal : true,
			href : url_equdetail + "id=" + id,
			onClose : function() {
				// alert("close");
			},
		});
	}
</script>
</head>
<body>
	<div>
		<div class="easyui-panel" title="巡检记录查询"
			data-options="iconCls:'icon-search'" style="padding: 5px;">
			<table>
				<tr>
					<td>设备编号:</td>
					<td><input id="id" class="easyui-textbox"></td>
					<td>设备分组:</td>
					<td><input id="station" class="easyui-searchbox"
						data-options="prompt:'-请选择-',searcher:doSelect"
						style="width: 150px;"></td>
					<td>开始日期:</td>
					<td><input id="begindate" class="easyui-datetimebox">
					<td>
					<td>结束日期:</td>
					<td><input id="enddate" class="easyui-datetimebox"></td>
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
						<th field="equid" width="80" align="center">设备编号</th>
						<th field="equstate" width="100" align="center">设备状态</th>
						<th field="personid" width="100" align="center">签到人</th>
						<th field="signintime" width="180" align="center">签到时间</th>
						<th field="singinlongitude" width="150" align="center">签到经度</th>
						<th field="singinlatitude" width="150" align="center">签到纬度</th>
						<th field="roudescription" width="200" align="center">巡检描述</th>
					</tr>
				</thead>
			</table>
		</div>
	</div>
	<div id="dlg"></div>
</body>
</html>