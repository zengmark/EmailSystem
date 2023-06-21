package com.email.controller;

import com.email.service.IUserService;
import com.email.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService loginService;

    /**
     * 注册功能
     * @param user_id
     * @param password
     * @return
     */
    @GetMapping("/login")
    public Result login( String user_id, String password){
        log.info("验证登录");
        return loginService.login(user_id, password);
    }

    @PostMapping("/register")
    public Result register(String username,String user_id,String password){
        log.info("注册账号");
        return loginService.register(username,user_id,password);
    }
}
