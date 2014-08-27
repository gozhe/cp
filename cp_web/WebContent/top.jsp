<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>banner</title>
<link rel="stylesheet" type="text/css" href="css/default.css">
<style type="text/css">
	#banner{
		width: 100%;
		height: 80px;
		padding: 0px;
		background: url("images/top_bg.png");
		background-repeat: repeat-x;
	}
	#logo{
		widows: 100%;
		height: 80px;
		float: left;
	}
	#title{
		width:500px;
		height: 80px;
		margin-left: 0px;
		margin-top: 0px;
		float: left;
	}
	hr{
	    width:280px;
		height:1px;
		border:none;
		border-top:1px dashed #0066CC;
	}
	#system{
		width: 400px; 
		height: 100%; 
		float: right; 
		margin-top: 1px; 
		margin-right: 5px;
	}
	
</style>
</head>
<body>
	<div id="banner" align="left">
		<div id="logo">
			<img alt="" src="images/logo.png" width="108px" height="80px">
		</div>
		<div id="title">
		</div>
		<div id="system">
			<div style="float: right;">
				<img alt="" src="images/help.png" style="vertical-align: middle;">
				<a href="" style="font-size: 13px; color: white;">帮助</a> <img alt=""
					src="images/exit.png"
					style="vertical-align: middle; margin-left: 8px;"> <a href=""
					style="font-size: 13px; color: white;">退出</a>
			</div>
			<div style="float: right; margin-top: 4px;">
				<hr>
			</div>
			<div style="float: right; margin-top: 10px;">
				<table style="font-family: 宋体; font-size: 13px; color: white"
					align="center">
					<tr>
						<td>2014-07-29</td>
						<td></td>
						<td>星期三</td>
						<td></td>
						<td>用户:</td>
						<td>尹新东</td>
						<td></td>
						<td>部门:</td>
						<td>信息部</td>
					</tr>
				</table>
			</div>
		</div>
	</div>
</body>
</html>