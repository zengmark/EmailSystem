package com.email.service.impl;

import com.email.dto.BoxDto;
import com.email.entity.Box;
import com.email.mapper.BoxMapper;
import com.email.service.BoxService;
import com.email.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoxServiceImpl implements BoxService {
    @Autowired
    private BoxMapper boxMapper;

    @Override
    public BoxDto getById(Integer id) {
        return boxMapper.getById(id);
    }

    @Override
    public Result getByUid(Integer uid) {
        List<BoxDto> boxes = boxMapper.getByUid(uid);
        if(boxes == null)
            return Result.ok();
        else
            return Result.ok(boxes);
    }

    @Override
    public Result addBox(Integer uid, String address, String password) {
        BoxDto boxDto = boxMapper.getByUidAndAddress(uid, address);
        if(boxDto != null)
            return Result.fail("用户已添加过该邮箱");
        //TODO 验证邮箱的账户和密码是否能连接到服务器。若成功，则设置该邮箱的信息，添加到数据库，然后返回该对象，
        // 若不成功，则返回错误信息
        String result="";
        if(result.equals("验证成功")){
            Box box =new Box();
            box.setUid(uid);
            box.setAddress(address);
            box.setPassword(password);
            box.setImapHost("444");
            box.setImapPort("44");
            box.setSmtpHost("444");
            box.setSmtpPort("44");
            //TODO 还要设置该邮箱的其他信息

            boxMapper.insert(box);
            return Result.ok();
        }
        else
            return Result.fail("所提供的用户名和密码错误，无法链接到对应的邮箱服务器");

    }
}
