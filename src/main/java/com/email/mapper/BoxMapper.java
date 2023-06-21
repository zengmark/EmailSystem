package com.email.mapper;

import com.email.dto.BoxDto;
import com.email.entity.Box;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BoxMapper {

    @Select("select * from box where id =#{id}")
    BoxDto getById(Integer id);
    @Select("select * from box where uid = #{uid} and address = #{address}")
    BoxDto getByUidAndAddress(Integer uid,String address);

    @Select("select * from box where uid =#{uid}")
    List<BoxDto> getByUid(Integer uid);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into box(uid, smtp_host, smtp_port, imap_host, imap_port, address, password) " +
            "values(#{uid},#{smtpHost},#{smtpPort},#{imapHost},#{imapPort},#{address},#{password})")
    void insert(Box box);

    @Delete("delete from box where id=#{id}")
    void deleteById(Integer id);

    void deleteByIds(List<Integer> ids);
}
