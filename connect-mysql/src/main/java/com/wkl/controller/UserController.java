package com.wkl.controller;

import com.wkl.pojo.User;
import com.wkl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/get")
    public List<User> getUserList(String name){
        userService.setT(100);
        System.out.println(userService.getT());
//        userService.m=20;
//        System.out.println(userService.m);
//        System.out.println(name);
//
//        System.out.println("你好china");
        //return userService.getUserList();
        return null;
    }



}
