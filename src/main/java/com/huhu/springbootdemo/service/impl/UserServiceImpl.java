package com.huhu.springbootdemo.service.impl;

import com.github.pagehelper.PageHelper;
import com.huhu.springbootdemo.mapper.UserMapper;
import com.huhu.springbootdemo.model.User;
import com.huhu.springbootdemo.service.UserService;
import com.huhu.springbootdemo.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getAll(UserVo userVo) {

        PageHelper.startPage(userVo.getPage(),userVo.getRows());
        return userMapper.getAll();
    }
}
