<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎使用社会面图像信息管理系统</title>
<link rel="stylesheet" type="text/css"
	href="jquery.easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="jquery.easyui/themes/icon.css">
<script type="text/javascript" src="jquery.easyui/jquery.min.js"></script>
<script type="text/javascript" src="jquery.easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="jquery.easyui/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
	$(function() {
		$("input[type=button]").click(function() {
			var name = $("input[name=username]").val();
			var pwd = $("input[name=password]").val();
			$.ajax({
				type : "post",
				//contentType:"application/x-www-form-urlencoded:charset=UTF-8",
				url : "base/login.do",
				data : {
					username : name,
					password : pwd
				},
				dataType : "json",
				beforeSubmit : function() {
					//校验
				},
				success : function(result) {
					if (result.username) {
						$("#logincheck").empty();
						location.href = "index.jsp";
					} else {
						$("#logincheck").html("用户名或密码不正确！");
					}
					//跳转
				},
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					$("#logincheck").html("网络出现错误：" + XMLHttpRequest.status);
				}
			});
		});
		$("input[type=reset]").click(function() {

			$("#logincheck").empty();
		});

	});
</script>
</head>
<body>
	<div id="logindiv" title="欢迎使用" class="easyui-panel"
		style="width: 300px; padding: 10px;" align="center">
		<form id="loginform">
			<table id="maintable">
				<tr>
					<td></td>
					<td id="logincheck"></td>
				</tr>
				<tr>
					<td>用户名：</td>
					<td><input name="username" class="f1 easyui-textbox"
						data-options="required:true,iconCls:'icon-man'" type="text" /></td>
				</tr>
				<tr>
					<td>密 码：</td>
					<td><input name="password" class="f1 easyui-textbox"
						data-options="required:true,iconCls:'icon-lock'" type="password" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input class="f2" type="reset" style="margin-right: 10px"
						title="重置" /><input class="f2" type="button"
						style="margin-left: 10px" value="提交" /></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>