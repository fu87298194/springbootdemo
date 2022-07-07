package com.huhu.springbootdemo.vo;

import com.huhu.springbootdemo.model.BaseEntity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserVo extends BaseEntity {
    @NotBlank(message = "userName不能为空")
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
