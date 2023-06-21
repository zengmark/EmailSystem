package com.email.utils;

import com.email.dto.UserDto;
import com.email.entity.User;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // Redis版本下的
        /*// 1、判断是否存在对象
        if(UserHolder.getUser() == null){
            // TODO 或许需要设置响应码，还没完成
            return false;
        }
        // 2、有用户，直接放行
        return true;*/

        // session版本
        // 1、先获取key TODO 待定
        String key = "";
        HttpSession session = request.getSession();
        UserDto user = (UserDto) session.getAttribute(key);
        // 2、用户不存在
        if(user == null){
            // TODO 设置响应状态

            return false;
        }
        // 3、存在保存用户信息
        UserHolder.saveUser(user);
        // 4、拦截器放行
        return true;
    }
}
