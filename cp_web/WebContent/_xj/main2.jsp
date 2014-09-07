<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Access-Control-Allow-Origin" content="*">
	<meta name="viewport" content="initial-scale=1.0, maximum-scale=2.0">
 	<link rel="stylesheet" type="text/css" href="../jquery.easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../jquery.easyui/themes/icon.css">
	<style type="text/css" >
		body{
			margin:0 auto;
			width:95%;	
			padding:10px 10px 10px 10px;
			min-width: 1000px;
		}
		.head{padding:0 10px 0 10px;}
		#mainDiv{width:90%;height:100%;text-align: center;padding:0 0 0 0;}
		#details{width:600px;height:300px}
		.detail-table{width:280px;height:300px;float: left;background-color: #CCFFCC;padding-right:20px;text-align: center;}
		.detail-table ul{text-align: right; list-style-type:none}
		.detail-table ul li{text-align: right;}
		.detail-table .left{display: block;}
		.detail-table .left input{width:150px;font-size:small;}
		.detail-table .left textarea{width:148px;height:50px;resize: none;font-size:small;}
		.detail-table .left span{width:80px;text-align: right;vertical-align: top;font-size:medium;}		
		.detail-img {background-color:#FFFF99;width:300px;height:300px; float:right;vertical-align: middle;padding: 10px auto;}
		.detail-img img{width:300px;height:300px;}
 	</style>
	<script type="text/javascript" src="../js/utils.js"></script>
	<script type="text/javascript" src="../jquery.easyui/jquery.min.js"></script>
	<script type="text/javascript" src="../jquery.easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="../jquery.easyui/easyui-lang-zh_CN.js"></script>
	<!-- 1.11-->
	<script type="text/javascript" language="javascript" charset="utf-8" >
	
		$(function(){
			//----控件创建--------
			$('#datatable').datagrid({
				title:"巡检详情",
				url:'../base/getRouteCheckData.do',
				rownumbers:true,
				pagination:true,
				singleSelect:true,
				columns:[[
				    {field:'id',title:'巡检号',align:'center',width:'10%'} ,    
				    {field:'equid',title:'设备号',align:'center',width:'8%'} ,    
				    {field:'equstate',title:'设备状态',align:'center',width:"10%"} ,    
				    {field:'signintime',title:'巡检时间',align:'center',width:"18%"} ,    
				    {field:'singinlongitude',title:'经度',align:'center',width:"10%"} ,    
				    {field:'singinlatitude',title:'纬度',align:'center',width:"10%"} ,    
				    {field:'roudescription',title:'巡检描述',align:'center',width:"22%"} ,    
					{field:'detail',title:'详情',align:'center', width:'10%',
						formatter: function(value,row,index){
							return "<a class='routedetail' href='javascript:loadDetail("+index+");'>查看详情</a>";
						}
					}
				]]
			});
			//---event handler---
			//查询按钮
			$("#query").click(function(){
				var n =  $('#xjfz').combotree('tree').tree('getChecked');	
				var groups=[] ;// get selected node
				for(var i=0;i<n.length;i++)
				{
					groups.push(n[i].id);
				}
				var begin=$('#begindate').datebox('getValue');
				var end=$('#enddate').datebox('getValue');
				$('#datatable').datagrid('load',{
					groups:groups,
					begindate: begin,
					enddate:end
				});
			});
			
			initDate();
		});
		function loadDetail(index)
	  	{
			var routeid = $('#datatable').datagrid('getRows')[index].id
			$.ajax({
        		"url":"../base/getRouteCheckDetail.do",
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
		function showdetail(data)
		{
			//alert("begin");
			$("#xjphoto").attr('src',data.rouphoto);
			$("#equid").val(data.equid);
			$("#signintime").val(data.signintime);
			$("#longitude").val(data.singinlongitude);
			$("#latitude").val(data.singinlatitude);
			$("#roudescription").val(data.roudescription);
			$("#details").window('open');
			
		}
		//----date func---
		
		/**
		*初始化日期
		*/
		function initDate()
		{
			$('#begindate').datebox('setValue',getFirstDayOfMonth());  
			$("#enddate").datebox('setValue',getLastDayOfMonth()); 
		}
		function myformatter(date)
		{
            var y = date.getFullYear();
            var m = date.getMonth()+1;
            var d = date.getDate();
            return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d);
        }
        function myparser(s)
        {
            if (!s) return new Date();
            var ss = (s.split('-'));
            var y = parseInt(ss[0],10);
            var m = parseInt(ss[1],10);
            var d = parseInt(ss[2],10);
            if (!isNaN(y) && !isNaN(m) && !isNaN(d)){
                return new Date(y,m-1,d);
            } else {
                return new Date();
            }
        }
        function formatPrice(val,row,index)
        {
           return "<a href='javascript:loadDetail(row);'>查看详情</a>";
        }
	</script>
</head>
<body>
	<div><img alt="" src="../images/exit.png" style="vertical-align: middle;">
	<span></span>巡检记录查询</div>
	<div class="head">
		<form >
			<table>
				<tr>
					<td>巡检分组:</td>
					<td class="input">
						<select id="xjfz"  class="easyui-combotree" data-options="url:'../base/routeCheckMain.do',method:'get',required:true" multiple  style="width:200px;"></select>
					</td>
					<td>开始日期:</td>
					<td  class="input">
					 <input id="begindate" class="easyui-datebox" data-options="formatter:myformatter,parser:myparser"></input>
					<td>
					<td>结束日期:</td>
					<td  class="input">
					 <input id="enddate" class="easyui-datebox" data-options="formatter:myformatter,parser:myparser"></input>
					 <!-- 
					 <input id="xjrq_datepicker" value="" style="padding-left:5px;"/>  
					  -->
					<td>
						<input  type="reset" style="width: 60px" value="清空"></input>
						<input id="query" type="button" style="width: 60px" value="查询"></input>
					</td>
				</tr>
			</table>
		</form>
	</div>
	<img alt=""  src="../images/line.png" style="height: 1px;margin-top: 12px;">
	<div id="mainDiv">
		<div style="margin:5px 0;"></div>
	    <table id="datatable" style="width:100%;height:400px;">
	        
	    </table>
	</div>
	<div id="details" class="easyui-dialog" title="巡检详情" style="width:650px;height:380px;padding:10px" data-options="
            iconCls:'icon-save',
            closed:true,
            onResize:function(){
                $(this).dialog('center');
            }">
		<div class="detail-table" >
			<ul>
				<li><div class="left"><span>设备号：</span><input id="equid" type="text"></div></li>
				<li><div class="left"><span>设备名称：</span><input id="equname" type="text"></div></li>
				<li><div class="left"><span>签到时间：</span><input id="signintime" type="text"></div></li>
				<li><div class="left"><span>经度：</span><input id="longitude" type="text"></div></li>
				<li><div class="left"><span>纬度：</span><input id="latitude" type="text"></div></li>
				<li><div class="left"><span>描述：</span><textarea id="roudescription" ></textarea></div></li>
				<li><div class="left"><span>工单状态：</span><input id="orderstate" type="text"></div></li>
			</ul>
			<div class="middle"><input id="orderstate" type="button" value="工单审核"></div>
		</div>
		<div class="detail-img">
			   <img id="xjphoto" />
		</div>
        
    </div>
	
</body>
</html>