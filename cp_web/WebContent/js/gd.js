
var url_orderlist = getRootPath() + "/base/getOrderList.do?";
var url_orderdetail = getRootPath() + "/base/getOrderDetail.do?";

function getRootPath() {
	// 获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp
	var curWwwPath = window.document.location.href;
	// 获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
	var pathName = window.document.location.pathname;
	var pos = curWwwPath.indexOf(pathName);
	// 获取主机地址，如： http://localhost:8083
	var localhostPaht = curWwwPath.substring(0, pos);
	// 获取带"/"的项目名，如：/uimcardprj
	var projectName = pathName
			.substring(0, pathName.substr(1).indexOf('/') + 1);
	return (localhostPaht + projectName);
}

$(function() {
	$('#dgrid').datagrid({
		title : '工单列表',
		iconCls : '',// 图标
		width : 'auto',
		height : 370,
		nowrap : false,
		striped : true,
		border : true,
		collapsible : false,// 是否可折叠的
		remoteSort : false,
		idField : 'id',
		singleSelect : true,// 是否单选
		pagination : true,// 分页控件
		rownumbers : true,// 行号
		frozenColumns : [ [ {
			field : 'ck',
			checkbox : true
		} ] ],
		toolbar : [ {
			text : '工单详情',
			iconCls : 'icon-search',
			handler : function() {
				var row = $('#dgrid').datagrid('getSelected');
				if (row) {
					alert(row.faultid);
					showDetails(row.faultid);
				} else {
					$.messager.alert('消息', '请选择一条记录', '消息');
				}

			}
		}, '-', {
			text : '工单审核',
			iconCls : 'icon-add',
			handler : function() {
				var row = $('#dgrid').datagrid('getSelected');
				if (row) {
					auditOrder(row.faultid);
				} else {
					$.messager.alert('消息', '请选择一条记录', '消息');
				}
			}
		} ]
	});
	// 设置分页控件
	var p = $('#dgrid').datagrid('getPager');
	$(p).pagination({
		pageSize : 10,// 每页显示的记录条数，默认为10
		pageList : [ 5, 10, 15 ],// 可以设置每页记录条数的列表
		beforePageText : '第',// 页数文本框前显示的汉字
		afterPageText : '页    共 {pages} 页',
		displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录',
		onSelectPage : function(pageNumber, pageSize) {
			loadData(pageNumber, pageSize);// 每次更换页面时触发更改
		}
	});
	loadData(1, 10);
});

var _pageNumber=0;

function loadData(pageNumber, pageSize) {
	_pageNumber = pageNumber;
	var _pageSize = pageSize;
	var url = url_orderlist + "&page=" + _pageNumber + "&rows="
			+ _pageSize;
	$.ajax({
		url : url,
		async : false,
		success : function(data) {
			var total = JSON.parse(data).rows[0].total;
			$('#dgrid').datagrid('loadData', JSON.parse(data));
			$('#dgrid').datagrid('getPager').pagination({
				total : total,
				pageSize : _pageSize,
				pageNumber : _pageNumbe,
			});
		}
	});
};

function doSelect() {
	$('#dlg').dialog({
		title : '设备分组',
		iconCls : "icon-search",
		collapsible : false,
		minimizable : false,
		maximizable : false,
		resizable : true,
		width : 380,
		height : 300,
		modal : true,
		cache : false,
		href : '../station.jsp',
		onClose : function() {
			getChecked();
		},
	});
};

function getChecked() {
	var nodes = $('#tt').tree('getChecked');
	var s = '';
	for (var i = 0; i < nodes.length; i++) {
		if (s != '')
			s += ',';
		s += nodes[i].text;
	}
	$('#station').searchbox("setValue", s);
}

function queryMe() {

}

function showDetails(faultid) {
	$('#dlg').dialog({
		title : '工单详情',
		iconCls : "icon-search",
		collapsible : false,
		minimizable : false,
		maximizable : false,
		resizable : true,
		width : 720,
		height : 420,
		modal : true,
		href : url_orderdetail+"faultid="+faultid,
		onClose : function() {
			// alert("close");
		},
	});
}

function auditOrder(faultid) {
	$('#dlg').dialog({
		title : '工单审核',
		iconCls : "icon-edit",
		collapsible : false,
		minimizable : false,
		maximizable : false,
		resizable : true,
		width : 500,
		height : 300,
		modal : true,
		href : url_orderaudit,
	});
}

function submitForm() {

	$.messager.progress(); // display the progress bar
	$('#ff').form('submit', {
		url : url_ordersubmit,
		onSubmit : function() {
			var isValid = $(this).form('validate');
			if (!isValid) {
				$.messager.progress('close'); // hide progress bar while the
			}
			return isValid; // return false will stop the form submission
		},
		success : function() {
			$.messager.progress('close'); // hide progress bar while submit
			// successfully
			$.messager.alert("提示", "操作成功！", "info");
		}
	});
}