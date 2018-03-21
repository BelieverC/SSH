package com.hc.daedalus.dao;

import java.util.List;

import com.hc.daedalus.model.Tree;
import com.hc.daedalus.util.MybaitsDao;
@MybaitsDao
public interface TreeMapper {
	String countSecondTree(int pid);
	
    int deleteByPrimaryKey(Integer id);

    int insert(Tree record);

    int insertSelective(Tree record);

    Tree selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tree record);

    int updateByPrimaryKey(Tree record);

	List<Tree> getListByNull();

	List<Tree> getListByPid(Integer pid);
}