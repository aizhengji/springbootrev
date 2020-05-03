package com.azj.service;

import com.azj.dao.UserDao;
import com.azj.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAll() {
        System.out.println("执行方法了");
       return userDao.selectAll();
    }

    @Override
    public void insertOneUser(User user) {
        userDao.insertUser(user);
    }
}
