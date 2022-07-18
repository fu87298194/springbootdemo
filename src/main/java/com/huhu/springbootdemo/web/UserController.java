package com.huhu.springbootdemo.web;


import com.github.pagehelper.PageInfo;
import com.huhu.springbootdemo.model.UserModel;
import com.huhu.springbootdemo.mapper.UserMapper;
import com.huhu.springbootdemo.service.UserService;
import com.huhu.springbootdemo.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;

    @GetMapping(value="/getUser")
    public List<UserModel> getUser(){

        List<UserModel>  users = userMapper.getAll();

        return users;
    }

    @GetMapping(value="/getUserPage")
    public PageInfo<UserModel> getUserPage(@Validated UserVo userVo){
        List<UserModel>  users = userService.getAll(userVo);
        return  new PageInfo<UserModel>(users);
    }

    @GetMapping(value="/getUserPageBySelf")
    public PageInfo<UserModel> getUserPageBySelf(@Validated UserVo userVo){
        List<UserModel>  users = userService.getAll(userVo);
        PageInfo<UserModel> pgageInfo = new PageInfo<UserModel>(users);
        return null;
    }

    /***
     * 路径变量
     * Since:
     * 3.0
     * 测试:
     * http://localhost:8041/param/path-variable/你好
     *
     * @return {@link String }
     * @author lvsheng
     * @date 2022/03/08 14:02
     */
    @GetMapping("/path-variable/{info}")
    public String pathVariable(@PathVariable String info) {
        return info;
    }

}
