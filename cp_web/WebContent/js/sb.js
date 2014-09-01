
function doSelect() {
	$('#dlg').dialog({
		title : '设备分组',
		iconCls : "icon-search",
		collapsible : true,
		minimizable : true,
		maximizable : true,
		resizable : true,
		width : 420,
		height : 300,
		modal : true,
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
	alert(s);
	$("#station").val(s);
}