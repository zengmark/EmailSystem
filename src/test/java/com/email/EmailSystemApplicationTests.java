package com.email;

import com.email.entity.Box;
import com.email.mapper.BoxMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class EmailSystemApplicationTests {

    @Autowired
    private BoxMapper boxMapper;

    @Test
    public void testDelete(){
        List<Integer> ids = Arrays.asList(13,14,15);
        boxMapper.delete(ids);
    }

    @Test
    public void testInsert(){
        Box box = new Box();
        box.setUid(1);
        box.setSmtpHost("333");
        box.setSmtpPort("33");
        box.setImapHost("333");
        box.setImapPort("33");
        box.setAddress("333");
        box.setPassword("33");

        boxMapper.insert(box);
        System.out.println(box.getId());
    }
}
