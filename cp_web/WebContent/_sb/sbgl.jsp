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
<title>设备监控</title>
<link rel="stylesheet" type="text/css"
	href="../jquery.easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="../jquery.easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="../jquery.easyui/demo.css">
<script type="text/javascript" src="../jquery.easyui/jquery.min.js"></script>
<script type="text/javascript" src="../jquery.easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../jquery.easyui/datagrid-detailview.js"></script>
<style type="text/css">
	body{
		margin: 0px;
		font-family: 微软雅黑;
	}
	img{
		vertical-align: middle;
	}
	table{
	}
</style>
<script type="text/javascript">
	$(function(){
		loadDataGrid();
	});
	
	function loadDataGrid(){
		 $('#dgrid').datagrid({
		    	title:'设备列表',
		    	iconCls:'icon-search',
		    	width:800,
		    	height:340,
		    	pageSize:10,//默认选择的分页是每页5行数据
		    	pageList:[ 5, 10, 15, 20 ],//可以选择的分页集合
		    	nowrap : true,//设置为true，当数据长度超出列宽时将会自动截取
		    	striped : true,//设置为true将交替显示行背景。
		    	collapsible : false,//显示可折叠按钮
		    	toolbar:"#tb",//在添加 增添、删除、修改操作的按钮要用到这个
		    	url:'<%=path%>/base/getEquipmentStateList.do?dptid=001',//url调用Action方法
		    	loadMsg : '数据装载中......',
		    	singleSelect:true,//为true时只能选择单行
		    	fitColumns:true,//允许表格自动缩放，以适应父容器
		    	//sortName : 'xh',//当数据表格初始化时以哪一列来排序
				//sortOrder : 'desc',//定义排序顺序，可以是'asc'或者'desc'（正序或者倒序）。
		    	remoteSort:false,//是否从服务器给数据排序
		    	pagination : true,//分页
		    	rownumbers : true,//行数
		    	columns:[[
					{field:'id',title:'ID',rowspan:1,width:40,sortable:true},   
					{field:'equid',title:'设备编号(名称)',rowspan:1,width:80}, 
					{field:'warningclass',title:'告警类型',rowspan:1,width:80}, 
					{field:'warninggrade',title:'告警等级',rowspan:1,width:80}, 
					{field:'warningstate',title:'告警状态',rowspan:1,width:80}, 
					{field:'warningcount',title:'累计次数',rowspan:1,width:80}, 
					{field:'refreshtime',title:'监测时间',rowspan:1,width:80}, 
					{field:'#',title:'操作',rowspan:1,width:80,
						formatter:function(val,rec){
							alert(rec.adviceid);
					}},
		    	 ]]
		    });
	};

	function doSelect(){
		 $('#dlg').dialog({
             title: '设备分组',
             iconCls: "icon-save",
             collapsible: true,
             minimizable: true,
             maximizable: true,
             resizable: true,
             width: 400,
             height: 200,
             modal: true,
           	 href:'../station.jsp',
             onClose: function () {
            	 getChecked();
             },
         });
	};
	function getChecked(){
		var nodes = $('#tt').tree('getChecked');
        var s = '';
        for(var i=0; i<nodes.length; i++){
        	if (s != '') s += ',';
            s += nodes[i].text;
        }
        //alert(s);
        $("#station").val(s);
	}
</script>
</head>
<body>
	<div class="easyui-panel" style="padding: 10px;">
		<div class="dquery">
			<div><img alt="" src="../images/exit.png"><span></span>设备查询</div>
			<div>
				<table>
					<tr>
						<td>设备编号:</td>
	 					<td><input id="id" class="easyui-textbox"></td>
						<td>设备名称:</td>
						<td><input id="name" class="easyui-textbox"></td>
						<td>设备类型:</td>
						<td><select id="type" class="easyui-combobox" name="sbtype" style="width: 150px;">
								<option value="tp1">类型1</option>
								<option value="tp2">类型2</option></select></td>
						<td>设备分组:</td>
						<td>
							<input id="station" class="easyui-searchbox" data-options="prompt:'',searcher:doSelect" style="width:150px">
						</td>
					</tr>
				</table>
			</div>
			<div style="margin-top: 10px;">
				<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'" style="width:80px">Search</a>
				<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-reload'" style="width:80px">Reload</a>
			</div>
		</div>
		<div class="dstate" style="margin-top: 15px;">
			<div><img alt="" src="../images/exit.png"><span></span>设备状态</div>
			<div>
				<table>
					<tr>
						<td>正常运转:</td>
						<td>132台</td>
						<td>故障:</td>
						<td>12台</td>
						<td>报修:</td>
						<td>21台</td>
					</tr>
				</table>
			</div>
		</div>
		
		<div class="dlist" style="margin-top: 10px;">
			<table id="dgrid">
            </table>
		</div>
	</div>
	<div id="dlg" >
    </div>
</body>
</html>
