package com.huhu.springbootdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {

    @RequestMapping("/test")
    public String index(){
        System.out.println("here");
        return "index";
    }
}
