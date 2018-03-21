<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
<script type="text/javascript" src="<%=basePath %>/library/jquery_easyui/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath %>/library/jquery_easyui/jquery.easyui.min.js"></script>
  	<script type="text/javascript" src="<%=basePath %>/library/jquery_easyui/locale/easyui-lang-zh_CN.js"></script>
  	<script type="text/javascript" src="<%=basePath %>/library/sea.js"></script>
  	<link rel="stylesheet" type="text/css" href="<%=basePath %>/library/jquery_easyui/themes/default/easyui.css">
 	<link rel="stylesheet" type="text/css" href="<%=basePath %>/library/jquery_easyui/themes/icon.css">
</head>
<body>
	<div class="easyui-panel" title="列表" >
		<table id="userListGrid"></table>
	</div>
</body>
<script type="text/javascript">
	seajs.use(["./userManage.js"]);
</script>

</html>