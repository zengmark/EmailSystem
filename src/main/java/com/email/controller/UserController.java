package com.email.controller;

import com.email.service.IUserService;
import com.email.utils.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService loginService;

    /**
     * 注册功能
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/login")
    public Result login(@RequestParam("username") String username, @RequestParam("password") String password){
        return loginService.login(username, password);
    }
}
