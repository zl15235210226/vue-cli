package com.baizhi.controller;

import com.baizhi.entity.Login;
import com.baizhi.service.LoginService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
@CrossOrigin
public class LoginController {

    @Resource
    private LoginService loginService;


    @GetMapping("queryLogin")
    public int query(Login login) {
        loginService.login(login);
       return loginService.login(login);
    }
    @PostMapping("insertLogin")
    public void insertLogin(Login login){
        loginService.login(login);

        System.out.println("添加成功");

    }
}
