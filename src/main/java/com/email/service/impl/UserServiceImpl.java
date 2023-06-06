package com.email.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.email.entity.User;
import com.email.mapper.UserMapper;
import com.email.service.IUserService;
import com.email.utils.Result;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Override
    public Result login(String username, String password) {

        return Result.ok();
    }
}
