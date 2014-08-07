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
<title>设备监控</title>
<link rel="stylesheet" type="text/css" href="../css/default.css">
<link rel="stylesheet" type="text/css" href="../jquery.datatable/css/jquery.dataTables.css">
<script type="text/javascript" src="../jquery.datatable/js/jquery.js"></script>
<script type="text/javascript" src="../jquery.datatable/js/jquery.dataTables.js"></script>
<script type="text/javascript" src="../js/sb.js"></script>
<script type="text/javascript"> 
$(document).ready(function() {
    $('#demo').html('<table cellpadding="0" cellspacing="0" border="0" class="display" id="example"></table>' );
    $('#example').dataTable( {
        "bPaginate": true, //开关，是否显示分页器
        //"bInfo": true, //开关，是否显示表格的一些信息
 	   "bAutoWidth": false, //自适应宽度
 	   "bJQueryUI": false, //开关，是否启用JQueryUI风格
 	   "bLengthChange": true, //开关，是否显示每页大小的下拉框
 	   "bFilter": false,/*不用搜索栏*/ 
 	   "oLanguage": {/*汉化*/ 
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
 	   },
        "data": getData(),
        "columns": [
            { "title": "序号" ,"class": "center" },
            { "title": "设备ID" ,"class": "center" },
            { "title": "设备类型","class": "center"  },
            { "title": "IP地址", "class": "center" },
            { "title": "设备状态", "class": "center" },
            { "title": "更新时间", "class": "center" },
            { "title": "操作", "class": "center" }
        ]
    });    
});
function getData(){
	var data=null;
	var arrayObj =null;
	$.ajax({
		url:"<%=request.getContextPath()%>/base/getAll.do",
		async:false,
		success:function(objs){
			//alert(objs);
			data=eval("("+objs+")");//转换为json对象 
			//alert(data.length);
			arrayObj = new Array();
			for(var i=0;i<data.length;i++){
				//alert(data[i].equid);
				var array = new Array();
				array.push(i+1);
				array.push(data[i].equid);
				array.push(data[i].equtype);
				array.push(data[i].equip);
				if(data[i].warningstate=="报警"){
					array.push('<img alt="" src="../images/denied.png" style="vertical-align: middle;">'+data[i].warningstate);
				}else{
					array.push('<img alt="" src="../images/ok.png" style="vertical-align: middle;">'+data[i].warningstate);
				}
				array.push(data[i].refreshtime.toString());
				array.push('<img alt="" src="../images/detail.png" style="vertical-align: middle;"><a href="getDetails.do">详细</a></img>');
				arrayObj.push(array);
			}
		}
	});
	return arrayObj;
}

</script>
</head>
<body>
<div id="query" style="padding: 10px;">
	<div>
	<div><img alt="" src="../images/exit.png" style="vertical-align: middle;">
	<span></span>设备查询</div>
	<div>
		<table>
			<tr>
				<td>设备编号:</td>
				<td><input></td>
				<td>设备状态:</td>
				<td><input></td>
				<td>设备类型:</td>
				<td><select style="width: 150px;">
					<option>类型1</option>
					<option>类型2</option>
				</select></td>
				<td><button id="query" style="width: 100px">查询</button></td>
			</tr>
		</table>
	</div>
	</div>
	<div>
	<div><img alt="" src="../images/exit.png" style="vertical-align: middle;">
	<span></span>设备状态</div>
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
	<img alt="" src="../images/line.png" style="height: 1px;margin-top: 12px;">
	<div id="demo" style="margin-top: 4px;"></div>

</div>
</body>
</html>