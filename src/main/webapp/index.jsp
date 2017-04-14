<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();   
	String root = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="<%=root %>/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="<%=root %>/resources/css/bootstrap-table.min.css" rel="stylesheet" />
<link href="<%=root %>/resources/css/animate.min.css" rel="stylesheet">
<link href="<%=root %>/resources/css/style.min.css" rel="stylesheet">

<script src="<%=root %>/resources/js/jquery-2.1.1.min.js"></script>
<script src="<%=root %>/resources/js/bootstrap.min.js"></script>
<script src="<%=root %>/resources/js/bootstrap-table.js"></script>
<script src="<%=root %>/resources/js/bootstrap-table-zh-CN.js"></script>
<script src="<%=root %>/resources/js/jquery.extends.js"></script>
<title>bootstrap-table</title>
</head>
<body class="gray-bg">
    <div class="wrapper wrapper-content animated fadeInRight">
    	<div class="row">
            <div class="col-sm-12">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>demo</h5>
                    </div>
                    <div class="ibox-content">
                    	<div class="row">
                    		<div class="col-sm-12">
		                        <table class="table table-striped table-bordered table-hover" id="demoTable">
		                        </table>
                    		</div>
                    	</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
<script type="text/javascript">
	var _demoTable;
	$(document).ready(function() {
		_demoTable = $('#demoTable').bootstrapTable({
            sidePagination:'server',//设置为服务器端分页
            url: '<%=root%>/staff/list.do',
            method: 'post',
            contentType: 'application/x-www-form-urlencoded;charset=utf-8',
            striped: true,
            pagination: true,
            pageList: [10,30,50],
            showToggle: true,
            showRefresh: true,
            showColumns: true,
            sortable: true,   
            idField: 'id',
            columns: [
				{field: 'loginName',width: '10%', title: '登录名', align: 'center'},
				{field: 'password',width: '10%', title: '密码', align: 'center'},	
				{field: 'realName', width: '15%', title: '真实姓名', align: 'center'},
				{field: 'positionId',width: '10%', title: '职位', align: 'center'},
				{field: 'remark',width: '10%', title: '备注', align: 'center'},
				{field: 'flag',width: '10%', title: 'flag', align: 'center'},
				{field: 'createTime',width: '10%', title: '创建时间', align: 'center'}
			],
			toolbar: '#toolbar'
        });
	});
</script>
</html>