package com.azj.service;

import com.azj.entity.User;

import java.util.List;

public interface UserService {
    /*查询所有的用户表*/
    List<User> findAll();
    /*添加一个用户*/
    void insertOneUser(User user);
}
