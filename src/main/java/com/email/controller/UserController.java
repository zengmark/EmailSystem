package com.email.controller;

import com.email.service.IUserService;
import com.email.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService loginService;

    /**
     * 注册功能
     * @param account
     * @param password
     * @return
     */
    @GetMapping("/login")
    public Result login( String account, String password){
        log.info("验证登录");
        return loginService.login(account, password);
    }
}
