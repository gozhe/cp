<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>设备完好率统计</title>
	<style type="text/css">
	    body{background-color: olive;}
	    #totalDiv{heigth:100%;width:100%;background-color: infobackground;}
	    #headDiv{height:130px;padding:10px 10px 10px 25px;}
	    .tabList {width:90%;heigth:100%;padding:0 0 10px 25px}
        .tabList .tab{  width:100%;heigth:100%;display:none;margin-left: auto;margin-right: auto;text-align:center;}
        .tabList .block{ display:block;}
    </style>
    <link rel="stylesheet" type="text/css" href="../jquery.jqchart/css/jquery.jqChart.css" />
    <link rel="stylesheet" type="text/css" href="../jquery.jqchart/css/jquery.jqRangeSlider.css" />
    <link rel="stylesheet" type="text/css" href="../jquery.jqchart/themes/smoothness/jquery-ui-1.10.4.css" />
    <link rel="stylesheet" type="text/css" href="../jquery.easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../jquery.easyui/themes/icon.css">
    <script src="../jquery.jqchart/js/jquery-1.11.1.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="../jquery.easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="../jquery.easyui/easyui-lang-zh_CN.js"></script>
    <script src="../jquery.jqchart/js/jquery.mousewheel.js" type="text/javascript"></script>
    <script src="../jquery.jqchart/js/jquery.jqChart.min.js" type="text/javascript"></script>
    <script src="../jquery.jqchart/js/jquery.jqRangeSlider.min.js" type="text/javascript"></script>
    <script type="text/javascript" src="../js/utils.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $(".tab  input").click(function(){
                $(".tabList div").removeClass("block");
                $("."+ $(".tab input[name='displayTab']:checked").attr("id")).addClass("block").fadeIn();
            });
            
            //初始化日期
            $('#begindate').datebox('setValue',getFirstDayOfMonth());  
			$("#enddate").datebox('setValue',getLastDayOfMonth()); 
        });
        function queryData()
        {
        	//统计方式
        	var tjfs=$("#tjfs option:selected").val();
        	var begin=$("#begindate").datebox('getValue');
        	var end=$("#enddate").datebox('getValue');
        	$('#mainTable').datagrid('load',{
        		tjfs:tjfs,
				begindate: begin,
				enddate:end
			});
        }
        function createChart()
        {
        	 var data=$('#mainTable').datagrid('getRows');
        	 //alert("  "+JSON.stringify(data));
        	 $('#jqLineChart').jqChart({
                 title: { text: '设备完好率统计' },
                 animation: { duration: 1 },
                 dataSource:data,
                 series: [
                     {
                         type: 'line',
                         title: '完好率',
                         strokeStyle: '#418CF0',
                         lineWidth : 2,
                         labels: {
                             stringFormat: '%d %',
                             font: '12px sans-serif'
                         },
                         xValuesField: {
                             name: 'name2',
                             type: 'string' // string, numeric, dateTime
                         },
                         yValuesField: 'whl'
                     },
                     {
                         type: 'line',
                         title: '修好率',
                         strokeStyle: '#FCB441',
                         lineWidth: 2,
                         labels: {
                             stringFormat: '%d %',
                             font: '12px sans-serif'
                         },
                         xValuesField: {
                             name: 'name2',
                             type: 'string' // string, numeric, dateTime
                         },
                         yValuesField: 'xhl'
                     }
                 ]
             });
             $('#jqColumnChart').jqChart({
                 title: { text: '设备完好率统计' },
                 animation: { duration: 1 },
                 shadows: {
                     enabled: true
                 },
                 series: [
                     { 
                         type: 'column',
                         title: '完好率',
                         fillStyle: '#418CF0',
                         data: [['昌平派出所1', 94.73], ['昌平派出所2', 100], ['昌平派出所3', 93.33],
                                ['昌平派出所4', 93.33], ['昌平派出所5', 93.33], ['昌平派出所6', 94.73]]
                     },
                     {
                         type: 'column',
                         title: '修好率',
                         fillStyle: '#FCB441',
                         data: [['昌平派出所1', 100], ['昌平派出所2', 100], ['昌平派出所3', 50],
                                ['昌平派出所4', 50], ['昌平派出所5', 50], ['昌平派出所6', 100]]
                     }
                 ]
             });
        }
    </script>
</head>
<body>
	<div id="totalDiv">
		<div id="headDiv">
			<div><img alt="" src="../images/exit.png" style="vertical-align: middle;">
			<span></span>查询选项</div>
			<div>
			   <form>
					<table>
						<tr>
							<td>组织结构:</td>
							<td>
								<select style="width: 150px;">
									<option>昌平分局</option>
								</select>
							</td>
							<td>统计方式:</td>
							<td>
								<select id="tjfs" style="width: 150px;">
									<option value="0">按组织</option>
									<option value="1">按维修单位</option>
									<option value="2">维保厂商</option>
									<option value="3">设备大类</option>
								</select>
							</td>
							<td>起始日期:</td>
							<td><input id="begindate" class="easyui-datebox"/></td>
							<td><input type="button" onclick="queryData();" value="查询" style="width: 70px"></td>
						</tr>
						<tr>
							<td>统计累加:</td>
							<td>
								<select style="width: 150px;">
									<option>仅本组织</option>
									<option>含下级组织</option>
								</select>
							</td>
							<td>统计级别:</td>
							<td>
								<select style="width: 150px;">
									<option>当前级</option>
									<option>下一级</option>
									<option>下二级</option>
									<option>下三级</option>
									<option>下四级</option>
								</select>
							</td>
							
							<td>结束日期:</td>
							<td><input id="enddate" class="easyui-datebox"/></td>
							<td><input type="reset" style="width: 70px"></input></td>
						</tr>
					</table>
			   </form>
			   
			</div>
			
		   <div><img alt="" src="../images/exit.png" style="vertical-align: middle;">
		   <span></span>指标统计</div>
		   <div class="tab">
		        <input id="tab1" type="radio" name="displayTab" checked="checked"/>列表
		        <input id="tab2" type="radio" name="displayTab"/>柱状图
		        <input id="tab3" type="radio" name="displayTab"/>折线图
		    </div>
			<img alt="" src="../images/line.png" style="height: 1px;margin-top: 12px;">
	   	</div>

		 <div class="tabList">
		    <!-- 表格 -->
	        <div class="tab tab1 block" id="tabTable">
	        	<table id="mainTable" class="easyui-datagrid" title="统计列表" style="width:100%;height:350px;"
	        	 	data-options="rownumbers:true,singleSelect:true,collapsible:true,pagination:true,
	        	 		url:'../base/queryWhl.do',
	        	 		onLoadSuccess:function(data){createChart();}">
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
			<!-- 柱状图 -->
	        <div class="tab tab2" id="jqColumnChart" style="width:85%;height:350px;">
	        	
	        </div>
	        <!-- 线状图 -->
	        <div class="tab tab3" id="jqLineChart" style="width:85%;height:350px;">
	        	
	        </div>
	     </div>
	</div>
</body>
</html>