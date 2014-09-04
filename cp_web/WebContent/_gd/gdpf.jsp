<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String equid = request.getParameter("equid");
%>
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
<title>工单创建</title>
</head>
<body>
<div class="easyui-panel" style="width:470px;height:260px;padding:5px;">
 <form id="ff" method="post">
	<table>
		<tr>
			<td class="cs1">故障编号</td>
			<td class="cs2"><input id="faultid" name="faultid" class="easyui-textbox" editable="false" 
				value="${ResultList.faultid}"></td>
			<td class="cs1">故障标题</td>
			<td class="cs2"><input id="faulttitle" name="faulttitle" class="easyui-textbox"></td>
		</tr>
		<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		<tr>
			<td class="cs1">设备编号</td>
			<td class="cs2"><input id="equid" name="equid" class="easyui-textbox" value="${ResultList.equid}"></td>
			<td class="cs1">设备名称</td>
			<td class="cs2"><input id="equname" class="easyui-textbox" value="${ResultList.equid}"></td>
		</tr>
		<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		<tr>
			<td class="cs1">故障类别</td>
			<td class="cs2"><select id="faultclass" name="faultclass" class="easyui-combobox" style="width: 133px;" data-options="onSelect:onSelect">
						<option value="c1">类别001</option>
						<option value="c2">类别002</option>
						<option value="c3">类别003</option>
						<option value="c4">类别004</option>
						<option value="other">其他</option>
						</select></td>
			<td class="cs1">故障级别</td>
			<td class="cs2"><select id="faultgrade" name="faultgrade" class="easyui-combobox" style="width: 133px;">
						<option value="g1">级别001</option>
						<option value="g2">级别002</option>
						<option value="g3">级别003</option>
						<option value="g4">级别004</option>
						</select></td>
		</tr>
		<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		<tr id="o_tr" style="display: none;">
			<td class="cs1">其他类别</td>
			<td class="cs2"><input id="faultclass1" name="faultclass1" class="easyui-textbox" style="width:133px;" data-options="prompt:'-请填写新类别-'"></td>
		</tr>
		<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		<tr>
			<td class="cs1">故障描述</td>
			<td class="cs3" colspan="3">
			<input id="faultdescription" name="faultdescription" class="easyui-textbox" data-options="multiline:true" style="width: 364px;height: 60px;"></td>
		</tr>
		<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
		<tr>
			<td class="cs1">创建时间</td>
			<td class="cs2"><input id="createtime" name="createtime" class="easyui-textbox" value="${ResultList.createtime}"></td>
			<td class="cs1">预计完成时间</td>
			<td class="cs2"><input id="estcomptime" name="estcomptime" class="easyui-datetimebox" required style="width:133px"></td>
		</tr>
		<tr><td colspan="4" height="32px" bgcolor="#F4F4F4" align="right">
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'" style="width:100px" onclick="submitForm();">表单提交</a>
		</td></tr>
	</table>
 </form>
</div>
</body>
</html>