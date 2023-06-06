package com.email.service;

import com.email.utils.Result;

public interface IUserService {
    Result login(String username, String password);
}
