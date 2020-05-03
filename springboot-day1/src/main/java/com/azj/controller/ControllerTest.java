package com.azj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class ControllerTest {
    @RequestMapping("ddd")
    @ResponseBody
    public String test1(){
        return "hello baby";
    }



}
