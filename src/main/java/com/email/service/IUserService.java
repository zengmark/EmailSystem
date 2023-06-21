package com.email.service;

import com.email.utils.Result;

public interface IUserService {
    Result login(String user_id, String password);

    Result register(String username,String user_id, String password);
}
