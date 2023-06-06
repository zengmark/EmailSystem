package com.email.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.email.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
