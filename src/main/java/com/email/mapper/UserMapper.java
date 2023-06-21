package com.email.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.email.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where user_id = #{user_id}")
    User select(String user_id);

    @Delete("delete from user where id = #{id}")
    void delete(Integer id);

    @Insert("insert into user(username,user_id,password) values(#{username},#{user_id},#{password})")
    void addUser(String username,String user_id,String password);
}
