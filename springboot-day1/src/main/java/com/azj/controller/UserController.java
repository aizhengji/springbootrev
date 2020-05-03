package com.azj.controller;

import com.azj.entity.User;
import com.azj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.Action;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping("/findAll")
    public List<User> testUser(){
             return userService.findAll();
    }
    @ResponseBody
    @RequestMapping("add")
    public  void addUser(){
        User user = new User("lisda", "1234122", "jjjjjjj");
        userService.insertOneUser(user);

    }}
