package com.hc.daedalus.dao;

import com.hc.daedalus.model.User;
import com.hc.daedalus.util.MybaitsDao;
@MybaitsDao
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}