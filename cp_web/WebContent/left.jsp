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
<body>
	<div id="left" style="width: 250px;overflow: hidden;">
		<div>
			<ul class="container">
				<li class="menu">
					<ul>
						<li class="button">
						<a href="#" class="blue"><img alt="" src="img/jk.png" class="img">设备监控 <span></span></a></li>
						<li class="dropdown">
							<ul>
								<li><a class="submenu" href="_sb/sbgl.jsp" target="right">监控管理</a></li>
								<li><a class="submenu" href="#">告警历史</a></li>
							</ul>
						</li>
					</ul>
				</li>
				<li class="menu">
					<ul>
						<li class="button"><a href="#" class="blue"><img alt="" src="img/gd.png" class="img">工单管理 <span></span></a></li>
						<li class="dropdown">
							<ul>
								<li><a class="submenu"  href="_gd/gdgl.jsp" target="right">工单管理</a></li>
								<li><a class="submenu" href="base/getOrderList.do" target="right">审核管理</a></li>

							</ul>
						</li>
					</ul>
				</li>
				<li class="menu">
					<ul>
						<li class="button"><a href="#" class="blue"><img alt="" src="img/xj.png" class="img">巡检管理 <span></span></a></li>
						<li class="dropdown">
							<ul>
								<li><a class="submenu"  href="base/getRoutingInspectionList.do"  target="right">巡检管理</a></li>
								<li><a class="submenu"  href="#" >审核管理</a></li>

							</ul>
						</li>
					</ul>
				</li>
				<li class="menu">
					<ul>
						<li class="button"><a href="#" class="blue"><img alt="" src="img/tj.png" class="img">统计分析 <span></span></a></li>
						<li class="dropdown">
							<ul>
								<li><a class="submenu"  href="_tj/sbwhl.jsp" target="right">设备完好率统计</a></li>
								<li><a class="submenu"  href="_tj/sbgzl.jsp"  target="right">设备故障率统计</a></li>
								<li><a class="submenu"  href="_tj/sbclqk.jsp"  target="right">故障处理情况统计</a></li>

							</ul>
						</li>
					</ul>
				</li>
				<li class="menu">
					<ul>
						<li class="button"><a href="#" class="blue"><img alt="" src="img/jf.png" class="img">计费管理 <span></span></a></li>
						<li class="dropdown">
							<ul>
								<li><a class="submenu"  href="#"
									onclick="$('.button a').eq(2).click();return false;">合同管理</a></li>
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
						<li class="button"><a href="#" class="blue"><img alt="" src="img/xt.png" class="img">系统管理 <span></span></a></li>
						<li class="dropdown">
							<ul>
								<li><a class="submenu" href="#"
									onclick="$('.button a').eq(2).click();return false;">部门管理</a></li>
								<li><a class="submenu" href="#"
									onclick="$('.button a').eq(2).click();return false;">手机管理</a></li>
										<li><a class="submenu" href="#"
									onclick="$('.button a').eq(2).click();return false;">人员管理</a></li>
										<li><a class="submenu" href="#"
									onclick="$('.button a').eq(2).click();return false;">设备管理</a></li>
										<li><a class="submenu" href="#"
									onclick="$('.button a').eq(2).click();return false;">角色管理</a></li>
										<li><a class="submenu" href="#"
									onclick="$('.button a').eq(2).click();return false;">字典管理</a></li>

							</ul>
						</li>
					</ul>
				</li>
				<li class="menu">
					<ul>
						<li class="button"><a href="#" class="blue"><img alt="" src="img/ditu.png" class="img">GIS地图 <span></span></a></li>
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