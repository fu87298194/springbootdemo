package com.huhu.springbootdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
