package com.hc.daedalus.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.hc.daedalus.model.Tree;
import com.hc.daedalus.model.TreeModel;
import com.hc.daedalus.service.TreeService;

@Controller
@RequestMapping("/tree")
public class TreeController {
	@Autowired
	private TreeService treeService;
	
	
	@ResponseBody
	@RequestMapping("/getList")
	public List<TreeModel> getList(String id){
		List<Tree> list = treeService.getList(id);
		List<TreeModel> treeModels = new ArrayList<TreeModel>();
		Map<String, String> map = new HashMap<String, String>();
		for (Tree tree : list) {
			String count;
			TreeModel treeModel = new TreeModel();
			treeModel.setId(tree.getId());
			treeModel.setText(tree.getText());
			map.put("url", tree.getUrl());
			treeModel.setAttributes(map);
			count = treeService.countSecondTree(tree.getId());
			if(Integer.parseInt(count)>0){
				treeModel.setState("closed");
			}
			
			treeModels.add(treeModel);
		}
		return treeModels;
	}
}
