<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<title>easyUi选项卡测试页</title>
	<script type="text/javascript" src="<%=basePath %>/library/jquery_easyui/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath %>/library/jquery_easyui/jquery.easyui.min.js"></script>
  	<script type="text/javascript" src="<%=basePath %>/library/jquery_easyui/locale/easyui-lang-zh_CN.js"></script>
  	<script type="text/javascript" src="<%=basePath %>/library/sea.js"></script>
  	<link rel="stylesheet" type="text/css" href="<%=basePath %>/library/jquery_easyui/themes/default/easyui.css">
 	<link rel="stylesheet" type="text/css" href="<%=basePath %>/library/jquery_easyui/themes/icon.css">
	
</head>
<body class="easyui-layout">
	<div data-options="region:'north',plain:true" style="height:40px;background-color: #438eb9;">
		<img alt="图片无法显示" src="../images/logo2.png" style="padding-top: 10px">
	</div>
    <div data-options="region:'west',title:'侧边栏',split:true,plain:true" style="width:200px;" >
	    <div id="p" class="easyui-panel" data-options="border:fales">   
			<a id="treeBtn1" href="#">启用排序</a>
			<a id="treeBtn2" href="#">保存排序</a>        
		</div>  
    	<ul id="tt"></ul>  
    </div>
	<div data-options="region:'center',title:'主页面 '"">
		<div id="tabs"></div>
	</div>
</body>
<script type="text/javascript">
	seajs.use(["./tabs.js"]);
</script>
</html>