<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统功能列表</title>

<link href="jquery/css/smoothness/jquery-ui-1.10.3.custom.css"
	rel="stylesheet">
<script src="jquery/js/jquery-1.9.1.js"></script>
<script src="jquery/js/jquery-ui-1.10.3.custom.js"></script>
<script type="text/javascript">
	$(function() {
		$("#accordion").accordion();
	});
</script>
</head>
<body style="margin-top: 0px;">
	<div id="left" style="width: 100%; height: 100%;">
		<div id="title"
			style="width: 100%; height: 30px; background-color: white;"
			align="center">
			<h2>系统功能</h2>
		</div>
		<div id="accordion" style="width: 100%;">
			<h3>设备监控</h3>
			<div>
			<button id="button">A button element</button>
			</div>
			<h3>工单管理</h3>
			<div>Phasellus mattis tincidunt nibh.</div>
			
			<h3>巡检管理</h3>
			<div>Nam dui erat, auctor a, dignissim quis.</div>
			
			<h3>巡检管理</h3>
			<div>Nam dui erat, auctor a, dignissim quis.</div>
			
			<h3>统计分析</h3>
			<div>Nam dui erat, auctor a, dignissim quis.</div>
			
			<h3>计费管理</h3>
			<div>Nam dui erat, auctor a, dignissim quis.</div>
			
			<h3>GIS地图</h3>
			<div>Nam dui erat, auctor a, dignissim quis.</div>
			
			<h3>系统管理</h3>
			<div>Nam dui erat, auctor a, dignissim quis.</div>
		</div>
	</div>
</body>
</html>