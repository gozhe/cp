<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统功能列表</title>

<link rel="stylesheet" type="text/css" href="css/left.css">

<script type="text/javascript" src="jquery.min/jquery.min.js"></script>
<script type="text/javascript" src="jquery.min/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="js/left.js"></script>


</head>
<body style="margin-top: 0px;">
	<div id="left" style="width: 100%; height: 100%;">
		<p class="title">系统功能</p>
		<div>
			<ul class="container">
				<li class="menu">
					<ul>
						<li class="button">
						<a href="#" class="green"><img alt="" src="img/sbjk.png" class="img">设备监控 <span></span></a></li>
						<li class="dropdown">
							<ul>
								<li><a class="submenu" href="_sb/sbjk.jsp" target="right">设备列表</a></li>
								<li><a class="submenu" href="#">设备监控</a></li>

							</ul>
						</li>
					</ul>
				</li>
				<li class="menu">
					<ul>
						<li class="button"><a href="#" class="orange"><img alt="" src="img/sbjk.png" class="img">工单管理 <span></span></a></li>
						<li class="dropdown">
							<ul>
								<li><a class="submenu"  href="_gd/gdpf.jsp" target="right">工单派发</a></li>
								<li><a class="submenu" href="base/getOrderList.do" target="right">工单管理</a></li>

							</ul>
						</li>
					</ul>
				</li>
				<li class="menu">
					<ul>
						<li class="button"><a href="#" class="blue"><img alt="" src="img/sbjk.png" class="img">巡检管理 <span></span></a></li>
						<li class="dropdown">
							<ul>
								<li><a class="submenu"  href="base/getRoutingInspectionList.do"  target="right">巡检列表</a></li>
								<li><a class="submenu"  href="#" >巡检管理</a></li>

							</ul>
						</li>
					</ul>
				</li>
				<li class="menu">
					<ul>
						<li class="button"><a href="#" class="red"><img alt="" src="img/sbjk.png" class="img">统计分析 <span></span></a></li>
						<li class="dropdown">
							<ul>
								<li><a class="submenu"  href="#"
									onclick="$('.button a').eq(2).click();return false;">设备完好率统计</a></li>
								<li><a class="submenu"  href="#"
									onclick="$('.button a').eq(2).click();return false;">设备故障率统计</a></li>
								<li><a class="submenu"  href="#"
									onclick="$('.button a').eq(2).click();return false;">故障处理情况统计</a></li>

							</ul>
						</li>
					</ul>
				</li>
				<li class="menu">
					<ul>
						<li class="button"><a href="#" class="green"><img alt="" src="img/sbjk.png" class="img">计费管理 <span></span></a></li>
						<li class="dropdown">
							<ul>
								<li><a class="submenu"  href="#"
									onclick="$('.button a').eq(2).click();return false;">计费方式一</a></li>
								<li><a class="submenu"  href="#"
									onclick="$('.button a').eq(2).click();return false;">计费方式二</a></li>

							</ul>
						</li>
					</ul>
				</li>
				<li class="menu">
					<ul>
						<li class="button"><a href="#" class="blue"><img alt="" src="img/sbjk.png" class="img">系统管理 <span></span></a></li>
						<li class="dropdown">
							<ul>
								<li><a class="submenu" href="#"
									onclick="$('.button a').eq(2).click();return false;">计费方式一</a></li>
								<li><a class="submenu" href="#"
									onclick="$('.button a').eq(2).click();return false;">计费方式二</a></li>

							</ul>
						</li>
					</ul>
				</li>
				<li class="menu">
					<ul>
						<li class="button"><a href="#" class="red"><img alt="" src="img/sbjk.png" class="img">GIS地图 <span></span></a></li>
						<li class="dropdown">
							<ul>
								<li><a class="submenu" href="#"
									onclick="$('.button a').eq(2).click();return false;">计费方式一</a></li>
								<li><a class="submenu" href="#"
									onclick="$('.button a').eq(2).click();return false;">计费方式二</a></li>

							</ul>
						</li>
					</ul>
				</li>
			</ul>
			<div class="clear"></div>
		</div>
	</div>
</body>
</html>