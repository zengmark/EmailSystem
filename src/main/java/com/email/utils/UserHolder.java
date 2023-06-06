package com.email.utils;

import com.email.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserHolder {
    /**
     * 记录当前用户进程
     * author 曾启霖
     */
    private static final ThreadLocal<UserDto> threadLocal = new ThreadLocal<>();

    public static void saveUser(UserDto userDto){
        threadLocal.set(userDto);
    }

    public static UserDto getUser(){
        return threadLocal.get();
    }

    public static void removeUser(){
        threadLocal.remove();
    }
}
