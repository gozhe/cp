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
<script type="text/javascript"
	src="../jquery.easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="../jquery.easyui/datagrid-detailview.js"></script>
<script type="text/javascript" src="../js/sb.js"></script>
<style type="text/css">
	body{
		 margin: 0px;
		 font-family: 微软雅黑;
	}
	.cs1{
		width:80px;
		height:24px;
		background-color: #F4F4F4;
		padding-left: 4px;
		text-align: left;
	}
	.cs2{
		width:120px;
		height:24px;
		padding-left: 2px;
		text-align: center;
	}
	hr{
		height:0.1px;
		border:none;
		border-top:1px dashed #0066CC;
	}
</style>
<script type="text/javascript">
$(function() {
	$('#dgrid').datagrid({  
        title:'状态列表',  
        iconCls:'icon-save',//图标  
        width: 'auto',  
        height: 370,  
        nowrap: false,  
        striped: true,  
        border: true,  
        collapsible:false,//是否可折叠的  
        remoteSort:false,   
        idField:'id',  
        singleSelect:true,//是否单选  
        pagination:true,//分页控件  
        rownumbers:true,//行号  
        frozenColumns:[[  
            {field:'ck',checkbox:true}  
        ]],  
        toolbar:[{
        	text: '设备明细',  
            iconCls: 'icon-search',  
            handler: function() {  
                //openDialog("add_dialog","add"); 
            	var row = $('#dgrid').datagrid('getSelected');
            	if (row){
            		showDetails(row.equid,row.equtype);
            	}else{
            		$.messager.alert('消息', '请选择一条记录', '消息');  
            	}
            	
            }  	
        },'-',{
        	text:'创建工单',
        	iconCls:'icon-edit',
        	handler:function(){
        		var row = $('#dgrid').datagrid('getSelected');
        		//$.messager.alert('消息', '只有故障设备可以创建工单', '消息');
            	if (row){
	            	addOrder(row.equid);
            	}else{
            		$.messager.alert('消息', '请选择一条记录', '消息');  
            	}
        	}
        }]
	});
	//设置分页控件  
    var p = $('#dgrid').datagrid('getPager');  
    $(p).pagination({  
        pageSize: 10,//每页显示的记录条数，默认为10  
        pageList: [5,10,15],//可以设置每页记录条数的列表  
        beforePageText: '第',//页数文本框前显示的汉字  
        afterPageText: '页    共 {pages} 页',  
        displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录',
        onSelectPage: function(pageNumber, pageSize) {  
         	loadData(pageNumber,pageSize);//每次更换页面时触发更改   
         }
     });
     loadData(1,10);
});

function loadData(pageNumber,pageSize){
    var _pageNumber =pageNumber;  
    var _pageSize =pageSize;
    var filter ="dptid=001";
	var url = "<%=path%>/base/getEquipmentStateList.do?"+filter+"&page="+_pageNumber+"&rows="+_pageSize;
	$.ajax({
		url:url,
		async:false,
		success:function(data){
			var total = JSON.parse(data).rows[0].total;  
			$('#dgrid').datagrid('loadData', JSON.parse(data)); 
			$('#dgrid').datagrid('getPager').pagination({ 
	            total:total,
	            pageSize: _pageSize,
	            pageNumber: _pageNumbe, 
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
		cache: false,
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
	$('#station').searchbox("setValue",s);
}

function queryMe(){
	//alert("aa");
	//$('#name').textbox("setValue","asa");
}

function showDetails(equid,equtype){
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
		href : '<%=path%>/base/getEquipmentDetail.do?equid=equ001',
		onClose : function() {
			//alert("close");
		},
	});
}

function addOrder(equid){
	$('#dlg').dialog({
		title : '创建工单',
		iconCls : "icon-add",
		collapsible : false,
		minimizable : false,
		maximizable : false,
		resizable : true,
		width : 500,
		height : 300,
		modal : true,
		href : '<%=path%>/base/InitWhenCreatOrder.do?equid=equ001',
	});
}

function onSelect(){
	var value = $("#faultclass").combobox("getValue");
	if(value=="other"){
		$("#o_tr").show();
	}else{
		$("#o_tr").hide();
	}
}

function submitForm(){
	var url="<%=path%>/base/DoOrderDispatch.do";
	$.messager.progress();	// display the progress bar
	$('#ff').form('submit',{
		url:url,
		onSubmit:function(){
			var isValid = $(this).form('validate');
			if (!isValid){
				$.messager.progress('close');	// hide progress bar while the form is invalid
			}
			return isValid;	// return false will stop the form submission
		},
		success:function(){
			$.messager.progress('close');	// hide progress bar while submit successfully
			$.messager.alert("提示", "操作成功！","info");
		}
	});
}

</script>
<style type="text/css">
body {
	margin: 0px;
	font-family: 微软雅黑;
}
img{
	vertical-align: middle;
}
</style>
</head>
<body>
	<div class="easyui-panel" style="padding: 10px;">
		<div class="dquery">
			<div>
				<img alt="" src="../images/exit.png"><span></span>设备查询
			</div>
			<div>
				<table>
					<tr>
						<td>设备编号:</td>
						<td><input id="id" class="easyui-textbox" ></td>
						<td>设备名称:</td>
						<td><input id="name" class="easyui-textbox"></td>
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
						<td class="td"><select id="type" class="easyui-combobox" name="sbtype"
							style="width: 150px;">
								<option value="tp1">---请选择---</option>
								<option value="tp1">类型1</option>
								<option value="tp2">类型2</option>
								<option value="tp2">类型3</option>
								<option value="tp2">类型4</option>
								<option value="tp2">类型5</option>
						</select></td>
					</tr>
					<tr>
						<td>设备分组:</td>
						<td colspan="3"><input id="station" class="easyui-searchbox"
							data-options="prompt:'-请选择-',searcher:doSelect" style="width: 133px;">
						</td>
					</tr>
				</table>
			</div>
			<div style="margin-top: 5px;float: right;">
				<a href="#" class="easyui-linkbutton" onclick="queryMe();"
					data-options="iconCls:'icon-search'" style="width: 80px">查询</a>
				<a href="#" class="easyui-linkbutton"
					data-options="iconCls:'icon-reload'" style="width: 80px">重置</a>
			</div>
		</div>
		<div class="dstate" style="margin-top: 15px;">
			<div>
				<img alt="" src="../images/exit.png"><span></span>设备状态
			</div>
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
		<div class="dlist">
			<table id="dgrid" cellspacing="0" cellpadding="0">
				<thead>
					<tr>
						<th field="equid" width="100">设备编号(名称)</th>
						<th field="equtype" width="100">设备类型</th>
						<th field="warningclass" width="80">告警类型</th>
						<th field="warninggrade" width="80">告警等级</th>
						<th field="warningstate" width="80">告警状态</th>
						<th field="warningsourcename" width="100">告警源名称</th>
						<th field="warningsourceip" width="100">告警源地址</th>
						<th field="warningcount" width="80">累计次数</th>
						<th field="ifreparing" width="80">维修状态</th>
						<th field="refreshtime" width="110">监测时间</th>
					</tr>
				</thead>
			</table>
		</div>
	</div>
	<div id="dlg"></div>
</body>
</html>
