<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>设备完好率统计</title>
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
</style>
<script type="text/javascript">
	$(function() {
		$('#dgrid').datagrid({
			title : '设备完好率统计',
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
				text : '柱状图',
				iconCls : 'icon-add',
				handler : function() {
					var row = $('#dgrid').datagrid('getSelected');
					if (row) {
						showDetails(row.id);
					} else {
						$.messager.alert('消息', '请选择一条记录', '消息');
					}
				}
			}, '-', {
				text : '饼状图',
				iconCls : 'icon-edit',
				handler : function() {
					var row = $('#dgrid').datagrid('getSelected');
					if (row) {
						//auditOrder(row.faultid);
					} else {
						$.messager.alert('消息', '请选择一条记录', '消息');
					}
				}
			}, '-', {
				text : '折线图',
				iconCls : 'icon-edit',
				handler : function() {
					var row = $('#dgrid').datagrid('getSelected');
					if (row) {
						//auditOrder(row.faultid);
					} else {
						$.messager.alert('消息', '请选择一条记录', '消息');
					}
				}
			} ]
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
			height : 400,
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
		<div class="easyui-panel" title="统计查询"
			data-options="iconCls:'icon-search'" style="padding: 5px;">
			<table>
				<tr>
					<td>组织结构:</td>
					<td><select id="type" class="easyui-combobox" name="sbtype"
						style="width: 150px;">		
							<option value="tp1">昌平分局</option>
							<option value="tp2">类型2</option>
							<option value="tp2">类型3</option>
							<option value="tp2">类型4</option>
							<option value="tp2">类型5</option>
					</select></td>
					<td>统计方式:</td>
					<td><select id="type" class="easyui-combobox" name="sbtype"
						style="width: 150px;">		
							<option value="tp1">按组织结构</option>
							<option value="tp2">按维修单位</option>
							<option value="tp2">按维修厂家</option>
							<option value="tp2">按设备大类</option>
					</select></td>
					<td>起始日期:</td>
					<td><input id="begindate" class="easyui-datetimebox"><td>
					<td><a href="#" class="easyui-linkbutton" onclick="queryMe();"
					data-options="iconCls:'icon-search'" style="width: 80px">查询</a></td>
				</tr>
				<tr>
					<td>统计累加:</td>
					<td><select id="type" class="easyui-combobox" name="sbtype"
						style="width: 150px;">		
							<option value="tp1">仅本组织</option>
							<option value="tp2">含下级组织</option>
					</select></td>
					<td>统计级别:</td>
					<td><select id="type" class="easyui-combobox" name="sbtype"
						style="width: 150px;">		
							<option value="tp1">当前级</option>
							<option value="tp2">下一级</option>
							<option value="tp2">下二级</option>
							<option value="tp2">下三级</option>
							<option value="tp2">下四级</option>
					</select></td>
					<td>结束日期:</td>
					<td><input id="enddate" class="easyui-datetimebox"></td>
					<td><a href="#" class="easyui-linkbutton"
					data-options="iconCls:'icon-reload'" style="width: 80px">重置</a></td>
				</tr>
			</table>
		</div>
		<div class="dlist" style="margin-top: 20px;">
			<table id="dgrid" cellspacing="0" cellpadding="0">
				<thead>
					<tr>
						<th data-options="field:'id',align:'center',resizable:false" width="10%">组织编号</th>
				        <th data-options="field:'name2',align:'center',resizable:false" width="28%">组织名称</th>
				        <th data-options="field:'zczs',align:'center',resizable:false" width="10%">资产总数</th>
				        <th data-options="field:'gzs',align:'center',resizable:false" width="8%">故障数</th>
				        <th data-options="field:'bxcs',align:'center',resizable:false" width="8%">报修次数</th>
				        <th data-options="field:'bxgs',align:'center',resizable:false" width="8%">报修个数</th>
				        <th data-options="field:'xhcs',align:'center',resizable:false" width="8%">修好次数</th>
				        <th data-options="field:'xhl',align:'center',resizable:false" width="10%">修好率</th>
				        <th data-options="field:'whl',align:'center',resizable:false" width="10%">完好率</th>
					</tr>
				</thead>
			</table>
		</div>
	</div>
	<div id="dlg"></div>
</body>
</html>