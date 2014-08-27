<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="shortcut icon" type="image/ico" href="http://www.datatables.net/favicon.ico">
	<link rel="stylesheet" type="text/css" href="../jquery/css/smoothness/jquery-ui-1.10.3.custom.min.css">
	<link rel="stylesheet" type="text/css" href="../jquery.datatable/css/jquery.dataTables.css">
	<style type="text/css" >
		tbody tr td{
			text-align: center;
		}
	</style>
	<script type="text/javascript" language="javascript" src="../jquery.datatable/js/jquery.js"></script>
	<script type="text/javascript" language="javascript" src="../jquery.datatable/js/jquery.dataTables.js"></script>
	<script type="text/javascript" language="javascript" src="../jquery/js/jquery-ui-1.10.3.custom.min.js"></script>
	<script type="text/javascript" language="javascript" class="init">
		$(function(){
			//controls
			//表格
			$("#mainTable").dataTable({
				"bAutoWidth": false, //自适应宽度
				"oLanguage": {
					"sLengthMenu": "每页显示 _MENU_ 条记录",
					"sZeroRecords": "抱歉， 没有找到",
					"sInfo": "从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
					"sInfoEmpty": "没有数据",
					"sInfoFiltered": "(从 _MAX_ 条数据中检索)",
					"oPaginate": {
						"sFirst": "首页",
						"sPrevious": "前一页",
						"sNext": "后一页",
						"sLast": "尾页"
					},
					"sProcessing":"加载中...",
					"sSearch":"搜索",
					"sZeroRecords": "没有检索到数据"
				}
			});
			//弹出窗口
			$("#details").dialog({
			    bgiframe: true,
			    resizable: true,
			    autoOpen:false,
			    minHeight:500,
			    minWidth:500,
			    modal: true,
			    overlay: {
			        backgroundColor: '#000',
			        opacity: 0.5
			    }
			});
		});
		//------------
		function showdetail(photo)
		{
			//alert(photo);
			$("#xjphoto").attr('src',photo);
			$("#details").dialog('open');
		}
	</script>
</head>
<body>
	<div>
		<table id="mainTable" class="display" cellspacing="0" width="100%">
	 		<thead>
		        <tr>
		            <th>巡检号</th>
		            <th>设备号</th>
		            <th>设备状态</th>
		            <th>巡检时间</th>
		            <th>经度</th>
		            <th>纬度</th>
		            <th>巡检描述</th>
		            <th>详情</th>
		        </tr>
		    </thead>
		    <tbody>
				<c:forEach var="list"  items="${ResultList}">
			    	<tr class="mid">
			    		<td>${list.rouid}</td>
			    		<td>${list.equid}</td>
			    		<td>${list.equstate}</td>
			    		<td>${list.signintime}</td>
			    		<td>${list.singinlongitude}</td>
			    		<td>${list.singinlatitude}</td>
			    		<td>${list.roudescription}</td>
			    		<td><img alt="" src="../images/detail.png"><a  href="javascript:showdetail('${list.rouphoto}');">详情</a></td>
			    	</tr>
				</c:forEach> 
			<tbody>
		</table>
	</div>
	<div id="details" title="巡检详情"  align="center"   >
		<img id="xjphoto"  style="margin:5px 10px 5px 20px;"/>
		<table id="detailtable"></table>
		<button>审核</button>
	</div>
</body>
</html>