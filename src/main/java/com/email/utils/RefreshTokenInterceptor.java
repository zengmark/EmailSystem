package com.email.utils;

import cn.hutool.core.bean.BeanUtil;
import com.email.dto.UserDto;
import com.email.entity.User;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class RefreshTokenInterceptor implements HandlerInterceptor {

    //这里不能直接注入，因为拦截器本质上无需加入bean，可以用传参的方式完成初始化
    /*private StringRedisTemplate stringRedisTemplate;

    public RefreshTokenInterceptor(StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }*/

    /**
     * 判断是否存在用户，不存在直接放行，因为我们只对存在的用户进行状态刷新，如果不存在直接让下一层拦截器拦截即可，存在就刷新状态
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // redis版本
        /*// TODO 1、获取key 但是还是暂定获取key的方式
        String key = "";
        Map<Object, Object> userMap = stringRedisTemplate.opsForHash().entries(key);
        // 2、为空直接放行
        if(userMap == null){
            return true;
        }
        // 3、转换对象
        UserDto userDto = BeanUtil.fillBeanWithMap(userMap, new UserDto(), false);
        UserHolder.saveUser(userDto);
        // 存入Redis缓存中
        // TODO 还没定下来time的大小
        Long time = 0L;
        // 刷新用户存在的有效期
        stringRedisTemplate.expire(key, time, TimeUnit.MINUTES);
        return true;*/

        return true;

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // 移除用户
        //UserHolder.removeUser();
    }
}
