package com.wkl.controller;

import com.wkl.pojo.User;
import com.wkl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user1")
public class UserController1 {
    @Autowired
    private UserService userService;
    @RequestMapping("/get")
    public List<User> getUserList(String name){
        System.out.println(userService.getT());

//        System.out.println(userService);
//
//        System.out.println(name);
//        System.out.println(userService.m);
//
//        System.out.println("你好china");
        //return userService.getUserList();
        return null;
    }



}
