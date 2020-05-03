package com.azj.dao;

import com.azj.entity.User;

import java.util.List;

public interface UserDao {
    /*查询所有的用户*/
    List<User> selectAll();
    /*添加用户*/
    void insertUser(User user);
}
