package com.huhu.springbootdemo.web;


import com.github.pagehelper.PageInfo;
import com.huhu.springbootdemo.model.User;
import com.huhu.springbootdemo.mapper.UserMapper;
import com.huhu.springbootdemo.service.UserService;
import com.huhu.springbootdemo.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;

    @GetMapping(value="/getUser")
    public List<User> getUser(){

        List<User>  users = userMapper.getAll();

        return users;
    }

    @GetMapping(value="/getUserPage")
    public PageInfo<User> getUserPage(@Validated UserVo userVo){
        List<User>  users = userService.getAll(userVo);
        return  new PageInfo<User>(users);
    }

    @GetMapping(value="/getUserPageBySelf")
    public PageInfo<User> getUserPageBySelf(@Validated UserVo userVo){
        List<User>  users = userService.getAll(userVo);
        PageInfo<User> pgageInfo = new PageInfo<User>(users);
        return null;
    }

}
