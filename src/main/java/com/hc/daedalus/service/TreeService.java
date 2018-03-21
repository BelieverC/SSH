package com.hc.daedalus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hc.daedalus.dao.TreeMapper;
import com.hc.daedalus.model.Tree;

@Service
public class TreeService {
	@Autowired
	private TreeMapper treeMapper;
	
	public List<Tree> getList(String pid){
		if(pid == null){
			List<Tree> list = treeMapper.getListByNull();
			return list;
		}else{
			List<Tree> list = treeMapper.getListByPid(Integer.parseInt(pid));
			return list;
		}
	}
	
	public String countSecondTree(int pid){
		return treeMapper.countSecondTree(pid);
	}

	
}
