define(function(require,exports,module){
	$("#userListGrid").datagrid({
		columns:[[    
      		{field:'username',title:'用户名',width:100},    
      		{field:'userpwd',title:'密码',width:100}    
			]]    
	});
});