<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
String path = request.getContextPath();

String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>部门管理</title>
	<link rel="stylesheet" type="text/css" href="../jquery.easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../jquery.easyui/themes/icon.css">
	<script type="text/javascript" src="../jquery.easyui/jquery.min.js"></script>
	<script type="text/javascript" src="../jquery.easyui/jquery.easyui.min.js"></script>
</head>
<body>
	<table id="dg" class="easyui-datagrid" title="部门列表" style="width:100%;height:500px"
            data-options="
            	rownumbers:true,
				pagination:true,
				singleSelect:true,
                iconCls: 'icon-edit',
                singleSelect: true,
                url:'../base/getDepartment.do',
                toolbar: '#tb',
                onClickRow: onClickRow">
        <thead>
            <tr>
            	<th data-options="field:'ck',checkbox:true"></th>
                <th data-options="field:'id',align:'center',width:80,editor:'text'">部门ID</th>
                <th data-options="field:'dptname',align:'center',width:120,editor:'text'">部门名称</th>
                <th data-options="field:'dptdescription',width:220,align:'center',editor:'text'">部门描述</th>
                <th data-options="field:'dpttype',width:80,align:'center',formatter:function(value,row){ return '运维公司';}">部门类型</th>
            </tr>
        </thead>
    </table>
 
    <div id="tb" style="height:auto">
        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onclick="append()">添加部门</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true" onclick="beginedit()">编辑部门</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onclick="append()">分组管理</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" onclick="removeit()">删除部门</a>
        <a  style="float:none;" class="datagrid-btn-separator"></a>
        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true" onclick="accept()">保存</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-undo',plain:true" onclick="reject()">取消</a>
   		<a  style="float:none;" class="datagrid-btn-separator"></a>
   		 <input id="search" class="easyui-searchbox" data-options="prompt:'请输入部门名称',searcher:doSearch" style="width:200px;"></input>
    </div>
    
    <script type="text/javascript">
        var editIndex = undefined;
        var selectIndex = undefined;
        var action=0;//0:insert,1:update
        function endEditing(){
            if (editIndex == undefined){return true;}
            if ($('#dg').datagrid('validateRow', editIndex)){
                $('#dg').datagrid('endEdit', editIndex);
                editIndex = undefined;
                return true;
            } else {
                return false;
            }
        }
        function onClickRow(index)
        {
        	selectIndex=index;
        }
        /**
        *编辑
        */
        function beginedit()
        {
        	var index=selectIndex;
            if (endEditing()){
                $('#dg').datagrid('selectRow', index)
                        .datagrid('beginEdit', index);
                editIndex = index;
            } else {
                $('#dg').datagrid('selectRow', editIndex);
            }
            action=1;
        }
        /**
        *添加
        */
        function append(){
            if (endEditing()){
                $('#dg').datagrid('appendRow',{id:'wXXX',dptsuperior:2});
                editIndex = $('#dg').datagrid('getRows').length-1;
                $('#dg').datagrid('selectRow', editIndex)
                        .datagrid('beginEdit', editIndex);
            }
            action=0;
        }
        /**
        *删除
        */
        function removeit(){
            if (selectIndex == undefined){return;}
            $('#dg').datagrid('cancelEdit', selectIndex)
                    .datagrid('deleteRow', selectIndex);
            //delete 
            
            //reload 
            
            selectIndex = undefined;
        }
        /**
        *保存
        */
        function accept()
        {
            if (endEditing())
            {
            	var rows = $('#dg').datagrid('getChanges');
            	var id=rows[0].id;
            	var name=rows[0].dptname;
            	var des=rows[0].dptdescription;
                //-----save---- 
                $.ajax({
	            	url:'../base/saveDepartment.do',
	            	type:'post',
	            	data:{
	            		dptid:id,
	            		dptname:name,
	            		description:des,
	            		action:action
	            	},
	            	success:function(data){
	            		if(data==1){
	            			$('#dg').datagrid('acceptChanges');
	            			bottomRightMessage("修改成功！");
	            		}else{
	            			bottomRightMessage("修改失败！");
	            			reject();
	            		}
	            	}
	            });
            }
        }
        /**
        *取消
        */
        function reject()
        {
            $('#dg').datagrid('rejectChanges');
            editIndex = undefined;
        }
        /**
        *查询
        */
        function doSearch()
        {
        	var name=$("#search").searchbox('getValue');
        	$("#dg").datagrid("load",{name:name});
        }
        function getChanges()
        {
            var rows = $('#dg').datagrid('getChanges');
            alert(rows.length+' rows are changed!'+JSON.stringify(rows));
        }
        
        /**
        *提示
        */
        function bottomRightMessage(msg)
        {
            $.messager.show({
                title:'提示',
                msg:msg,
                showType:'show'
            });
        }
        function centerMessage(msg){
            $.messager.alert('确认窗口',msg);
        }
    </script>
</body>
</html>