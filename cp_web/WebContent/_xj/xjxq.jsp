<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="../jquery.easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../jquery.easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="../jquery.easyui/demo.css">
<script type="text/javascript" src="../jquery.easyui/jquery.min.js"></script>
<script type="text/javascript" src="../jquery.easyui/jquery.easyui.min.js"></script>
<title>巡检明细</title>
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

</head>
<body>
<div style="width:580px;height:340px;padding: 2px;">
	 <div class="easyui-layout" data-options="fit:true">
	 	<div data-options="region:'west'" style="width:220px;padding:5px">
             <table>
             	<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
             	<tr>
             		<td class="cs1">巡检编号</td>
					<td class="cs2">${ResultList.id}</td>			
             	</tr>
             	<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
             	<tr>
					<td class="cs1">设备编号</td>
					<td class="cs2">${ResultList.equid}</td>			
             	</tr>
				<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
				<tr>
					<td class="cs1">签到人</td>
					<td class="cs2">${ResultList.personid}</td>
				</tr>
				<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
				<tr>
					<td class="cs1">签到时间</td>
					<td class="cs2"><fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss" value="${ResultList.signintime}" type="both"/></td>
				</tr>
				<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
				<tr>
					<td class="cs1">经度</td>
					<td class="cs2">${ResultList.singinlongitude}</td>
				</tr>
					<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
				<tr>
					<td class="cs1">纬度</td>
					<td class="cs2">${ResultList.singinlatitude}</td>
				</tr>
				<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
				<tr>
					<td class="cs1">设备状态</td>
					<td class="cs2">${ResultList.equstate}</td>
				</tr>
				<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
				<tr>
					<td class="cs1">巡检描述</td>
					<td class="cs2">${ResultList.roudescription}</td>
				</tr>
				<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
				<tr>
					<td class="cs1">审核结果</td>
					<td class="cs2"><select id="faultclass" name="faultclass" class="easyui-combobox" style="width: 133px;">
						<option value="1">已巡检</option>
						<option value="2">巡检不合格</option>
						</select></td>
				</tr>
             </table>	
             <div style="float: right;margin-top: 2px;">
             	<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'" style="width: 80px">提交审核</a>
             </div>
        </div>
        <div data-options="region:'center'" style="padding:5px">
             <img alt="" src="../images/nopic.jpg" width="300px">                  
         </div>
	 </div>
</div>
</body>
</html>