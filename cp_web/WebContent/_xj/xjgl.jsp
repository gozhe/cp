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
	<style type="text/css" >
		
	</style>
	<!-- 
	 -->
	<script type="text/javascript" language="javascript" src="../jquery/js/jquery-1.9.1.js"></script>
	<script type="text/javascript" language="javascript" src="../jquery/js/jquery-ui-1.10.3.custom.min.js"></script>
	<!-- 
	<script type="text/javascript" language="javascript" src="../jquery/plugin/datepicker_cn.js"></script>
	 -->
	<script type="text/javascript" language="javascript" src="../jquery/plugin/dropdownchecklist/jquery.js"></script>
	<script type="text/javascript" language="javascript" src="../jquery/plugin/dropdownchecklist/ui.core.js"></script>
	<script type="text/javascript" language="javascript" src="../jquery/plugin/dropdownchecklist/ui.dropdownchecklist.js"></script>
	
	<script type="text/javascript" language="javascript" src="../jquery/plugin/simplecanleder/SimpleCanleder.js"></script>
	
	<script type="text/javascript" language="javascript" charset="utf-8" >
		
		$(document).ready(function() {
			//----------------控件创建----------------
			//alert("ready");
			//--巡检分组--
			$("#xjfz").dropdownchecklist();
			//--data--
			var d=new Date();
			var year=d.getFullYear();
			var month=d.getMonth()+1;
			$("#xjrq_datepicker").simpleCanleder().val(year+"-"+(month<10?'0'+month:month)); 
			//--巡检日期--
			$("#query").click(function(){
				$("#mainDiv").empty().load("<%=request.getContextPath()%>/routecheck/getAll.do",
						{
							"group":$("#xjfz").val()[0],
							"data":$("#xjrq_datepicker").val()
						}		
					);
			});
			//--datatable--
			loadData();
		});
		function loadData(){
			alert($("#xjfz").val()+"  "+$("#xjrq_datepicker").val());
			$("#mainDiv").empty().load("<%=request.getContextPath()%>/routecheck/getAll.do",
					{
						"group":$("#xjfz").val()[0],
						"data":$("#xjrq_datepicker").val()
					}		
				);
			
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
				            <option selected="selected">(全部分组)</option>
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
	
</body>
</html>