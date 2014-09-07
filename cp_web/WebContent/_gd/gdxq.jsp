<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %>  
<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>工单详细</title>
<link rel="stylesheet" type="text/css"
	href="../jquery.easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../jquery.easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="../jquery.easyui/demo.css">
<script type="text/javascript" src="../jquery.easyui/jquery.min.js"></script>
<script type="text/javascript" src="../jquery.easyui/jquery.easyui.min.js"></script>
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
<div class="easyui-panel" style="width:680px;height:460px;padding:5px;">
	<div class="easyui-panel" title="基本信息" style="width:100%;height: 180px;padding: 5px;margin-bottom: 5px;">
		<table>
             	<tr>
             		<td class="cs1">设备标识</td>
					<td class="cs2">${ResultList.equid}</td>
					<td class="cs1">工单状态</td>
					<td class="cs2">${ResultList.orderstate}</td>
					<td class="cs1">故障编号</td>
					<td class="cs2">${ResultList.faultid}</td>
             	</tr>
             	<tr><td colspan="6" height="0.1" bgcolor="#F4F4F4"></td></tr>
				<tr>
					<td class="cs1">故障标题<</td>
					<td class="cs2">${ResultList.faulttitle}</td>
					<td class="cs1">故障类型</td>
					<td class="cs2">${ResultList.faultclass}</td>
					<td class="cs1">故障级别</td>
					<td class="cs2">${ResultList.faultgrade}</td>
				</tr>
				<tr><td colspan="6" height="0.1" bgcolor="#F4F4F4"></td></tr>
				<tr>
					<td class="cs1">创建人</td>
					<td class="cs2">${ResultList.creater}</td>
					<td class="cs1">创建时间</td>
					<td class="cs2"><fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss" value="${ResultList.createtime}" type="both"/></td>
					<td class="cs1">预计完成时间</td>
					<td class="cs2"><fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss" value="${ResultList.estcomptime}" type="both"/></td>
				</tr>
				<tr><td colspan="6" height="0.1" bgcolor="#F4F4F4"></td></tr>
				<tr>
					<td class="cs1">故障描述</td>
					<td colspan="5" class="cs2">${ResultList.faultdescription}</td>
				</tr>
				<tr><td colspan="6" height="0.1" bgcolor="#F4F4F4"></td></tr>
		</table>
	</div>
	<div class="easyui-panel" title="维修信息" style="width:100%;height: 150px;padding: 5px;margin-bottom: 5px;">
		<div style="float: left">
		<table>
             	<tr>
             		<td class="cs1">使用耗材</td>
					<td class="cs2">${ResultList.material}</td>
					<td class="cs1">耗材数量</td>
					<td class="cs2">${ResultList.count}</td>
             	</tr>
				<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
				<tr>
					<td class="cs1">维修人</td>
					<td class="cs2">${ResultList.repairer}</td>
					<td class="cs1">维修时间</td>
					<td class="cs2">${ResultList.repairtime}</td>
				</tr>
				<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
				<tr>
					<td class="cs1">维修内容</td>
					<td colspan="3" class="cs2">${ResultList.repaircontent}</td>
				</tr>
				<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		</table>
		</div>
		<div style="float: left;">
			<img alt="" src="../images/nopic.jpg" width="110" height="110">
		</div>
	</div>
	<div class="easyui-panel" title="工单审核" style="width:100%;height:80px;padding: 5px;">
		<table>
			<tr>
				<td class="cs1">维修结果</td>
				<td class="cs2"><select id="repairresult" name="repairresult" class="easyui-combobox" style="width: 133px;">
						<option value="0">处理中</option>
						<option value="1">按时完成</option>
						<option value="2">超时完成</option>
						<option value="3">超时未完成</option>
						</select></td>
				<td class="cs1">审核意见</td>
				<td class="cs2"><select id="aoopinion" name="aoopinion" class="easyui-combobox" style="width: 133px;" >
						<option value="0">完成</option>
						<option value="1">未完成</option>
						<option value="2">待上级复核</option>
						</select></td>
				<td colspan="4" height="32px" bgcolor="#F4F4F4" align="right">
					<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'" style="width:100px" onclick="">表单提交</a>
				</td>
			</tr>
		</table>
	</div>
</div>
</body>
</html>