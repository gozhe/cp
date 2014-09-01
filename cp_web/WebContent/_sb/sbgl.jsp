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
<script type="text/javascript">
$(function() {
	$('#dgrid').datagrid({  
        title:'状态列表',  
        iconCls:'icon-search',//图标  
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
        	text: '查看详细',  
            iconCls: 'icon-search',  
            handler: function() {  
                //openDialog("add_dialog","add"); 
            	var row = $('#dgrid').datagrid('getSelected');
            	if (row){
	            	alert(row.equid);
            	}
            }  	
        },'-',{
        	text:'新增工单',
        	iconCls:'icon-add',
        	handler:function(){
        		var row = $('#dgrid').datagrid('getSelected');
            	if (row){
	            	alert(row.equid);
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
    var filter ="dptid=id";
		var url = "<%=path%>/base/getEquipmentStateList.do?"+filter+"&page="+_pageNumber+"&rows="+_pageSize;
	$.ajax({
		url:url,
		async:false,
		success:function(data){
			var total = JSON.parse(data).rows[0].total;  
			$('#dgrid').datagrid('loadData', JSON.parse(data)); 
			pager.pagination({ 
	            total:total,
	            pageSize: _pageSize,
	            pageNumber: _pageNumbe, 
			});
		}
	});
};
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
						<td colspan="2"><input id="station" class="easyui-searchbox"
							data-options="prompt:'',searcher:doSelect" style="width: 133px">
						</td>
					</tr>
				</table>
			</div>
			<div style="margin-top: 5px;float: right;">
				<a href="#" class="easyui-linkbutton"
					data-options="iconCls:'icon-search'" style="width: 100px">查询</a>
				<a href="#" class="easyui-linkbutton"
					data-options="iconCls:'icon-reload'" style="width: 100px">重置</a>
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
