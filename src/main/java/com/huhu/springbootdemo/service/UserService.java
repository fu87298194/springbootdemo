package com.huhu.springbootdemo.service;


import com.huhu.springbootdemo.model.User;
import com.huhu.springbootdemo.vo.UserVo;

import java.util.List;

public interface UserService {

    List<User> getAll(UserVo userVo);

}
