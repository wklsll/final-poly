package com.wkl.service;

import com.wkl.dao.UserDao;
import com.wkl.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public int m=10;

    ThreadLocal<Integer> t = new ThreadLocal<>();


   public List<User> getUserList(){
       return userDao.getUserList();
   }

   public void setT(int a){
       t.set(a);

   }

   public Integer getT(){
       Integer integer = t.get();
       t.remove();
       return integer;
   }

}
