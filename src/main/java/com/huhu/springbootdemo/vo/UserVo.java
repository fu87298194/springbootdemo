package com.huhu.springbootdemo.vo;

import javax.validation.constraints.NotBlank;

public class UserVo extends PageInfoVo {
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
