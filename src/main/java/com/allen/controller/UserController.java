package com.allen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allen.dao.entity.UserInfo;
import com.allen.model.ResultBean;
import com.allen.service.UserService;

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping(value="/user/get/{userId}")
    public ResultBean<UserInfo> get(@PathVariable Integer userId){
        return new ResultBean<>(userService.findByUserId(userId));
    }
    
    @RequestMapping(value="/user/cache/{userId}")
    public ResultBean<UserInfo> cache(@PathVariable Integer userId){
        return new ResultBean<>(userService.findByUserIdFromCache(userId));
    }
    
//    @PostMapping(value="/user/update")
//    public ResultBean<Integer> update(@RequestBody UserInfo user){
//        return new ResultBean<Integer>(userService.updateUser(user));
//    }
    
//    @RequestMapping(value="/user/delete/{userId}")
//    public ResultBean<Integer> delete(@PathVariable Integer userId){
//        return new ResultBean<Integer>(userService.deleteUser(userId));
//    }

}
