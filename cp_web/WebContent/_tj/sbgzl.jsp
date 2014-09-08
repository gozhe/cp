<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
    
<%
String path = request.getContextPath();

String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>设备故障率统计</title>
	<style type="text/css">
	    html body #totalDiv{heigth:100%;width:100%; margin:0;padding:0;}
	    #headDiv{height:150px;padding:10px 10px 10px 10px;}
	    .tabList {margin:10px 10px 10px 5px;heigth:100%;}
        .tabList .tab{  display:none;margin-left: auto;margin-right: auto;}
        .tabList #tabTable.tab{  display:block;}
        
        tbody tr td{
			text-align: center;
		}
    </style>
    <link rel="stylesheet" type="text/css" href="../jquery.jqchart/css/jquery.jqChart.css" />
    <link rel="stylesheet" type="text/css" href="../jquery.jqchart/css/jquery.jqRangeSlider.css" />
	<!--  
	-->
    <link rel="stylesheet" type="text/css" href="../jquery.jqchart/themes/smoothness/jquery-ui-1.10.4.css" />
    <link rel="stylesheet" type="text/css" href="../jquery.easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../jquery.easyui/themes/icon.css">
    <script src="../jquery.jqchart/js/jquery-1.11.1.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="../jquery.easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="../jquery.easyui/easyui-lang-zh_CN.js"></script>
    <script src="../jquery.jqchart/js/jquery.mousewheel.js" type="text/javascript"></script>
    <script src="../jquery.jqchart/js/jquery.jqChart.min.js" type="text/javascript"></script>
    <script src="../jquery.jqchart/js/jquery.jqRangeSlider.min.js" type="text/javascript"></script>
    
    <script  type="text/javascript">
        $(document).ready(function () {
            $('#jqLineChart').jqChart({
                title: { text: '设备故障率统计' },
                animation: { duration: 1 },
                axes: [
                    {
                        type: 'category',
                        location: 'bottom',
                        categories: ['昌平派出所1', '昌平派出所2','昌平派出所3','昌平派出所4', '昌平派出所5', '昌平派出所6']
                    }
                ],
                series: [
                    {
                        type: 'line',
                        title: '完好率',
                        strokeStyle: '#418CF0',
                        lineWidth : 2,
                        data: [94.73, 100, 93.33, 93.33, 93.33, 94.73],
                        labels: {
                            stringFormat: '%d %',
                            font: '12px sans-serif'
                        }
                    },
                    {
                        type: 'line',
                        title: '修好率',
                        strokeStyle: '#FCB441',
                        lineWidth: 2,
                        data: [ 100, 100, 50, 50, 50, 100],
                        labels: {
                            stringFormat: '%d %',
                            font: '12px sans-serif'
                        }
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
            
            
            $(".tabNavi  input").click(function(){
            	$(".tabList div").hide();
                var tab = $(".tabNavi input[name='displayTab']:checked").val();
              
	            $("#"+tab).fadeIn();
            });
            
            // event handler
            $("#query").click(function(){
            	var station=$("#stations option:selected").val();
            	var begindate= $("#begindate").val();
            	var enddate= $("#enddate").val();
            	alert("station:"+station+ "begin:"+begindate+"end:"+enddate);
            	$.ajax({
					"url":"../statistics/queryGzl.do",
					"data":{
						"station":station,
						"begindate":begindate,
						"enddate":enddate
					},
					"success":function(data){
						alert("result:"+data);
					},
					"error":function(a,b,c){
						alert("error "+a.status+"!");
					}
            	});
            });
        });
    </script>
</head>
<body>
	<div id="totalDiv">
		<div id="headDiv">
			<div><img alt="" src="../images/exit.png" style="vertical-align: middle;">
			<span></span>查询选项</div>
			<div>
			   <form id="mainform">
					<table>
						<tr>
							<td>组织结构:</td>
							<td>
								<select id="stations" style="width: 150px;">
									<option>（全部）</option>
									<option>组织1</option>
									<option>组织2</option>
								</select>
							</td>
							<td>设备大类:</td>
							<td>
								<select style="width: 150px;">
									<option selected="selected">全部</option>
									<option>类别1</option>
									<option>类别2</option>
									<option>类别3</option>
								</select>
							</td>
							<td>生产厂商:</td>
							<td>
								<select style="width: 150px;">
									<option selected="selected">全部</option>
									<option>厂商1</option>
									<option>厂商2</option>
									<option>厂商3</option>
								</select>
							</td>
						</tr>
						<tr>
							<td>承建工程商:</td>
							<td>
								<select style="width: 150px;">
									<option selected="selected">全部</option>
									<option>承建1</option>
									<option>承建2</option>
								</select>
							</td>
							<td>统计方式:</td>
							<td>
								<select style="width: 150px;">
									<option selected="selected">按组织</option>
									<option>设备类型</option>
									<option>按生产厂商</option>
								</select>
							</td>
							<td>统计累加:</td>
							<td>
								<select style="width: 150px;">
									<option selected="selected">仅本组织</option>
									<option>含下级组织</option>
								</select>
							</td>
						</tr>
						<tr>
							<td>统计级别:</td>
							<td>
								<select style="width: 150px;">
									<option selected="selected">当前级</option>
									<option>下一级</option>
									<option>下二级</option>
									<option>下三级</option>
									<option>下四级</option>
								</select>
							</td>
							<td>安装日期:</td>
							<td><input id="begindate" class="easyui-datebox"/></td>
							<td>至:</td>
							<td><input id="enddate" class="easyui-datebox"/></td>
							
							<td><input id="query"  type="button" style="width: 70px" value="查询"></td>
							<td><input type="reset" style="width: 70px"></input></td>
							<td><input type="button" value="导出Excel" style="float: right;"/></td>
						</tr>
					</table>
			   </form>
			</div>
			
		   <div><img alt="" src="../images/exit.png" style="vertical-align: middle;">
		   <span></span>指标统计</div>
		   <div class="tabNavi">
		        <input value="tabTable" type="radio" name="displayTab" checked="checked"/>列表
		        <input value="jqColumnChart" type="radio" name="displayTab"/>柱状图
		        <input value="jqLineChart" type="radio" name="displayTab"/>折线图
		        
		        
		    </div>
			<img alt="" src="../images/line.png" style="height: 1px;margin-top: 12px;">
			
	   	</div>
		 <div class="tabList">
			<div class="tab tab1 block" id="tabTable">
	        	<table id="gzlTable" class="easyui-datagrid" title="统计列表" style="width:100%;height:350px;"
	        	 	data-options="singleSelect:true,collapsible:true,pagination:true">
				    <thead>
				        <tr>
				            <th data-options="field:'id1',align:'center',resizable:false" width="10%">组织编号</th>
				            <th data-options="field:'id2',align:'center',resizable:false" width="30%">组织名称</th>
				            <th data-options="field:'id3',align:'center',resizable:false" width="10%">资产总数</th>
				            <th data-options="field:'id4',align:'center',resizable:false" width="10%">故障数</th>
				            <th data-options="field:'id5',align:'center',resizable:false" width="10%">保修次数</th>
				            <th data-options="field:'id6',align:'center',resizable:false" width="10%">修好次数</th>
				            <th data-options="field:'id7',align:'center',resizable:false" width="10%">修好率</th>
				            <th data-options="field:'id8',align:'center',resizable:false" width="10%">完好率</th>
				        </tr>
				    </thead>
				 
				    <tbody>
				        <tr>
				            <td>1</td>
				            <td>昌平派出所1</td>
				            <td>19</td>
				            <td>2</td>
				            <td>2</td>
				            <td>2</td>
				            <td>100%</td>
				            <td>94.73%</td>
				        </tr>
				        <tr>
				            <td>2</td>
				            <td>昌平派出所2</td>
				            <td>19</td>
				            <td>0</td>
				            <td>0</td>
				            <td>0</td>
				            <td>100%</td>
				            <td>100%</td>
				        </tr>
				        <tr>
				            <td>3</td>
				            <td>昌平派出所3</td>
				            <td>30</td>
				            <td>2</td>
				            <td>1</td>
				            <td>1</td>
				            <td>50%</td>
				            <td>93.33%</td>
				        </tr>
				        <tr>
				            <td>4</td>
				            <td>昌平派出所4</td>
				            <td>30</td>
				            <td>2</td>
				            <td>1</td>
				            <td>1</td>
				            <td>50%</td>
				            <td>93.33%</td>
				        </tr>
				        <tr>
				            <td>5</td>
				            <td>昌平派出所5</td>
				            <td>30</td>
				            <td>2</td>
				            <td>1</td>
				            <td>1</td>
				            <td>50%</td>
				            <td>93.33%</td>
				        </tr>
				        <tr>
				            <td>6</td>
				            <td>昌平派出所6</td>
				            <td>19</td>
				            <td>2</td>
				            <td>2</td>
				            <td>2</td>
				            <td>100%</td>
				            <td>94.73%</td>
				        </tr>
				    </tbody>
				 </table>
			</div>
	        <div class="tab" id="jqColumnChart" style="width: 80%; height: 60%;">
	        	
	        </div>
	        <div class="tab" id="jqLineChart" style="width: 80%; height: 60%;">
	        	
	        </div>
	     </div>
	</div>
</body>
</html>