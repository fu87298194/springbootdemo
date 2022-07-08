package com.huhu.springbootdemo.service;


import com.huhu.springbootdemo.model.UserModel;
import com.huhu.springbootdemo.vo.UserVo;

import java.util.List;

public interface UserService {

    List<UserModel> getAll(UserVo userVo);

}
