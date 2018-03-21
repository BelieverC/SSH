package com.hc.daedalus.dao;

import com.hc.daedalus.pojo.stuUser;

public interface stuUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(stuUser record);

    int insertSelective(stuUser record);

    stuUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(stuUser record);

    int updateByPrimaryKey(stuUser record);
}