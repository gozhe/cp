<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
    
<%
String path = request.getContextPath();

String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>故障处理情况统计</title>
	<style type="text/css">
	    html body #totalDiv{heigth:100%;width:100%; margin:0;padding:0;}
	    #headDiv{height:150px;padding:10px 10px 10px 10px;}
	    #totalDiv.leftDiv{width: 200px;height: 100%;float: left;}
	    #mainDiv {margin:10px 10px 10px 5px;heigth:100%;float: right;}
	    #mainDiv .tabList {margin:10px 10px 10px 5px;heigth:100%;}
        #mainDiv .tabList .tab{  display:none;margin-left: auto;margin-right: auto;}
        #mainDiv .tabList #tabTable.tab{  display:block;}
        
        tbody tr td{
			text-align: center;
		}
    </style>
    <link rel="shortcut icon" type="image/ico" href="http://www.datatables.net/favicon.ico"/>
    <link rel="stylesheet" type="text/css" href="../jquery.jqchart/css/jquery.jqChart.css" />
    <link rel="stylesheet" type="text/css" href="../jquery.jqchart/css/jquery.jqRangeSlider.css" />
	<link rel="stylesheet" type="text/css" href="../jquery.datatable/css/jquery.dataTables_themeroller.css"/>
	<link rel="stylesheet" type="text/css" href="../jquery.datatable/css/jquery.dataTables.css"/>
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
    <script type="text/javascript" language="javascript" src="../jquery.datatable/js/jquery.js"></script>
	<script type="text/javascript" language="javascript" src="../jquery.datatable/js/jquery.dataTables.js"></script>
    
    <script  type="text/javascript">
    	var j_1_11 = $.noConflict();  
        $(document).ready(function () {
            $('#jqLineChart').jqChart({
                title: { text: '设备完好率统计' },
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
            
            (j_1_11)("#gzlTable").dataTable({
	        	   "bAutoWidth": false, //自适应宽度
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
   		<div id="leftDiv"  class="left">
   			
   		</div>
   		<div id="mainDiv">
			<div id="headDiv">
				<div><img alt="" src="../images/exit.png" style="vertical-align: middle;">
				<span></span>查询选项</div>
				<div>
				   <form id="mainform">
						<table>
							<tr>
								<td>资源类型:</td>
								<td>
									<select id="stations" style="width: 150px;">
										<option>（全部）</option>
										<option>组织1</option>
										<option>组织2</option>
									</select>
								</td>
								<td>统计时间:</td>
								<td>
									<select style="width: 150px;">
										<option selected="selected">自定义</option>
										<option>最近一天</option>
										<option>最近一周</option>
										<option>最近一个月</option>
									</select>
								</td>
							</tr>
							<tr>
								<td>自定义从:</td>
								<td><input id="begindate" class="easyui-datebox"/></td>
								<td>到:</td>
								<td><input id="begindate" class="easyui-datebox"/></td>
							</tr>
							<tr>
								<td>统计字段:</td>
								<td>
									<select style="width: 150px;">
										<option selected="selected">告警数量</option>
										<option>平均故障时长</option>
										<option>平均修复时长</option>
									</select>
								</td>
								<td>统计排名:</td>
								<td>
									<select style="width: 150px;">
										<option selected="selected">全部</option>
										<option>前10位</option>
										<option>前20位</option>
										<option>前30位</option>
									</select>
								</td>
								
								<td><input id="query"  type="button" style="width: 70px" value="查询"></td>
								<td><input type="reset" style="width: 70px"></input></td>
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
			        
			        <input type="button" value="导出Excel" style="float: right;"/>
			    </div>
				<img alt="" src="../images/line.png" style="height: 1px;margin-top: 12px;">
				
		   	</div>
			 <div class="tabList">
		        <div class="tab" id="tabTable">
		        	<table id="gzlTable"  cellspacing="0" width="100%">
					    <thead>
					        <tr>
					            <th>组织编号</th>
					            <th>组织名称</th>
					            <th>资产总数</th>
					            <th>故障数</th>
					            <th>保修次数</th>
					            <th>修好次数</th>
					            <th>修好率</th>
					            <th>完好率</th>
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
	</div>
</body>
</html>