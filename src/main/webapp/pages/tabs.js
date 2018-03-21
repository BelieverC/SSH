define(function(require,exports,module) {
		$("#treeBtn1").linkbutton({
			plain : true,
			iconCls : 'icon-ok',
			onClick : function(){	
				$("#tt").tree('enableDnd');
			}
		});
		$("#treeBtn2").linkbutton({
			plain : true,
			iconCls : 'icon-save',
			onClick : function(){	
				$("#tt").tree('disableDnd');
			}
		});
		var tabs = $("#tabs").tabs({
			border:false,  
			fit : true
		});
		$("#tt").tree({
			lines : true,
			url : '../tree/getList',
			checkbox : true,
			onClick: function(node){
				if(node.attributes.url!=null){
					var exits = tabs.tabs("exists",node.text);
					if(!exits){
						tabs.tabs('add',{
							title : node.text,
							tools:[{    
						        iconCls:'icon-clear',    
						        handler:function(){    
						        	tabs.tabs('close',node.text);
						        }    
						    }],
						    content:'<iframe name="indextab" scrolling="auto" src="'+node.attributes.url+'" frameborder="0" style="width:100%;height:100%;"></iframe>', 
						});
					}
				}
				
			}

		});
	
	});
