<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="initial-scale=1.0, maximum-scale=2.0">
	<link rel="stylesheet" type="text/css" href="../jquery/plugin/dropdownchecklist/ui.dropdownchecklist.css"/>
	<link rel="stylesheet" type="text/css" href="../jquery/plugin/simplecanleder/SimpleCanleder.css"/>
	<link rel="stylesheet" type="text/css" href="../jquery/css/smoothness/jquery-ui-1.10.3.custom.min.css"/>
	<link rel="shortcut icon" type="image/ico" href="http://www.datatables.net/favicon.ico">
	<link rel="stylesheet" type="text/css" href="../jquery.datatable/css/jquery.dataTables.css">
	<style type="text/css" >
		tbody tr td{
			text-align: center;
		}
		#details{
	   		margin: auto;
		}
		/*html元素定义class属性使用点.开头。float设置该块的漂浮属性，在container内向左移,
		另一个快siderbar在container内向右移*/
		.detailTable{
			
		}
		.detailTable table{
			margin:auto;
			font-family: verdana,arial,sans-serif;
			font-size:11px;
			color:#333333;
			border-width: 1px;
			border-color: #666666;
			border-collapse: collapse;
		}
		.detailTable table td.th{
			border-width: 1px;
			width:80px;
			padding: 8px;
			border-style: solid;
			border-color: #666666;
			background-color: #dedede;
		}
		.detailTable table td{
		    min-width:100px;
			border-width: 1px;
			padding: 8px;
			border-style: solid;
			border-color: #666666;
			background-color: #ffffff;
		}
		/*因为main和siderbar在container内，所以两个块的宽度之和不应该超过container的宽度*/
		.detailImg{
			
		}
	</style>
	<!-- 
	 -->
	<script type="text/javascript" language="javascript" src="../jquery/js/jquery-1.9.1.js"></script>
	<script type="text/javascript"  language="javascript">var j_1_9_1 = $.noConflict();  </script>
	<script type="text/javascript" language="javascript" src="../jquery/js/jquery-ui-1.10.3.custom.min.js"></script>
	<!-- 
	<script type="text/javascript" language="javascript" src="../jquery/plugin/datepicker_cn.js"></script>
	 -->
	 <!-- 1.2.6 -->
	 <!-- 
	  -->
	<script type="text/javascript" language="javascript" src="../jquery/plugin/dropdownchecklist/jquery.js"></script>
	<script type="text/javascript" language="javascript" src="../jquery/plugin/dropdownchecklist/ui.core.js"></script>
	<script type="text/javascript" language="javascript" src="../jquery/plugin/dropdownchecklist/ui.dropdownchecklist.js"></script>
	<script type="text/javascript" language="javascript" src="../jquery/plugin/simplecanleder/SimpleCanleder.js"></script>
	<!-- 
	 -->
	<!-- 1.11-->
	<script type="text/javascript" language="javascript" src="../jquery.datatable/js/jquery.js"></script>
	<script type="text/javascript" language="javascript" src="../jquery.datatable/js/jquery.dataTables.js"></script>
	<script type="text/javascript" language="javascript" charset="utf-8" >
	  	// datatables jquery冲突
		var j_1_11 = $.noConflict();  
		$(function(){
			//----------------控件创建----------------
			//--巡检分组--
			$("#xjfz").dropdownchecklist({ "firstItemChecksAll": true, "maxDropHeight": 100 });
			//--data--
			var d=new Date();
			var year=d.getFullYear();
			var month=d.getMonth()+1;
			$("#xjrq_datepicker").simpleCanleder().val(year+"-"+(month<10?'0'+month:month)); 
			//弹出窗口
			j_1_9_1("#details").dialog({
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
			//---event handler---
			//--巡检日期--
			$("#query").click(function(){
				loadData();
			});
			loadData();
		});
		function loadData(){
			$("#mainDiv").empty().html('<table id="mainTable" class="display" cellspacing="0" width="100%"></table>"');
			$.ajax({
				"url":"../routecheck/getAll_json.do",
				"dataType":"json",
				"contentType": "application/x-www-form-urlencoded; charset=UTF-8",
				"type":"post",
				"success":function(data){
					//alert(data);
					createTable(data);
				},
				"error":function(da,b,v){
					alert("error:"+da.status);
				}
			});
		}
		function createTable(data){
			//--datatable--
			var i=1;
			var t=j_1_11("#mainTable").empty().dataTable({
				   "data":data,
				   "order": [[ 2, "asc" ]],
	        	   "bAutoWidth": false, //自适应宽度
	        	   "columns": [
	                           { "title": "巡检号" ,"data": "rouid" },
	                           { "title": "设备号" ,"data": "equid" },
	                           { "title": "设备状态","data": "equstate"  },
	                           { "title": "巡检时间", "data": "signintime" },
	                           { "title": "经度", "data": "singinlongitude" },
	                           { "title": "纬度", "data": "singinlatitude" },
	                           { "title": "巡检描述", "data": "roudescription" },
	                           { "title": "详情" ,"data": "detail"}
	                       ],
	               "columnDefs": [ {	
	            	   				  "targets": [7],
	            	   				  "data":"detail",
	                            	  "defaultContent":"<a href='javascript:'>详情</a>"
	                              }],
                    "oLanguage": {
 	        		   "sProcessing": "正在加载中......",
 	        		   "sLengthMenu": "每页显示 _MENU_ 行", 
 	        		   "sZeroRecords": "没有记录", 
 	        		   "sEmptyTable": "表中无数据存在！",
 	        		   "sInfo": "当前显示 _START_ ～ _END_ 条，共 _TOTAL_ 条记录", 
 	        		   "sInfoFiltered": "数据表中共为 _MAX_ 条记录",
 	        		   "sInfoEmpty": "当前显示 0 ～ 0 条，共 0 条记录", 
 	        		   "sSearch": "搜索",
 	        		   "oPaginate": {
 	                       "sFirst": "首页",
 	                       "sPrevious": "上一页",
 	                       "sNext": "下一页",
 	                       "sLast": "末页"
 	                   }
 	        	   }
           });
			/*
			j_1_11('#mainTable tbody tr td a').on('click', function () {
			       // var name = $('td', this).eq(1).text();
			        var name = $(this).index();
			        alert( 'You clicked on '+name+'\'s row');
			    });
			j_1_11('#mainTable tbody').on('click', 'tr', function () {
		        var name = $('td', this).eq(1).text();
		       // var name = $(this).index();
		        alert( 'You clicked on '+name+'\'s row');
		    });
			*/
			j_1_11('#mainTable tbody').on('click','tr', function () {
		        var name = $('td a',this).eq(0).text();
		        if(name=="详情"){
		        	var routeid = $('td',this).eq(0).text();
		        	alert("routeid"+routeid);
		        	$.ajax({
		        		"url":"../routecheck/getDetail.do",
		        		"dataType":"json",
		        		"type":"post",
		        		"data":	{
		        				"id":routeid
		        			},
		        		"success":function(data){
		        				//alert("success"+data);
		        				showdetail(data);
		        			},
	        			"error":function(a,b,c){
	        				alert("error:"+a.status);
	        			}
		        	});
		        }
		       // var name = $(this).index();
		    });
			
		}
		
		function showdetail(data)
		{
			alert("begin");
			$("#xjphoto").attr('src',data.rouphoto);
			$("#rouid").html(data.rouid);
			$("#equid").html(data.equid);
			$("#equstate").html(data.equstate);
			$("#signintime").html(data.signintime);
			$("#roudescription").html(data.roudescription);
			j_1_9_1("#details").dialog('open');
			alert("end");
			
		}
	</script>
</head>
<body>
	<div><img alt="" src="../images/exit.png" style="vertical-align: middle;">
	<span></span>巡检记录查询</div>
	<div>
		<form >
			<table>
				<tr>
					<td>巡检分组:</td>
					<td class="input">
						<select id="xjfz"  multiple="multiple">
				            <option>(全部分组)</option>
				            <option>分组一</option>
				            <option>分组二分组二</option>
				            <option>分组一</option>
				            <option>分组一</option>
				            <option>分组一</option>
				            <option>分组一</option>
				        </select>
					</td>
					<td>巡检日期:</td>
					<td  class="input">
						<input id="xjrq_datepicker" value="" style="padding-left:5px;"/>  
					<td>
						<input  type="reset" style="width: 60px" value="清空"></input>
						<input id="query" type="submit" style="width: 60px" value="查询"></input>
					</td>
				</tr>
			</table>
		</form>
	</div>
	<img alt="" src="../images/line.png" style="height: 1px;margin-top: 12px;">
	<div id="mainDiv">
		
	</div>
	<div id="details" title="巡检详情"  align="center" >
	
		<div class="detailImg">
			<img id="xjphoto"/>
		</div>
		<div class="detailTable">
			<table id="detailtable">
				<tr>	
					<td class="th">巡检号</td><td id="rouid"></td><td class="th">设备号</td><td id="equid"></td>
				</tr>
				<tr>	
					<td class="th">设备状态</td><td id="equstate"></td><td class="th">巡检描述</td><td id="roudescription">
				</tr>
				<tr>	
					<td class="th" >巡检时间</td><td id="signintime" colspan="3"></td>
				</tr>
				<tr>
					<td class="th" >审核时间</td><td id="audittime" colspan="3"></td>
				</tr>
				<tr>	
					<td class="th">审核意见</td><td id="auditopinion"></td>
					<td colspan="2"><button>审核</button></td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>