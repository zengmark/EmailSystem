package com.email.config;

import com.email.utils.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    /*@Resource
    private StringRedisTemplate stringRedisTemplate;*/

    /**
     * 添加拦截器拦截路径，判断是否可以通过
     * @param registry
     * author 曾启霖
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // TODO 先拦截所有路径
        registry.addInterceptor(new LoginInterceptor()).excludePathPatterns(
                "/**"
        );
    }
}
