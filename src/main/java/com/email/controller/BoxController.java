package com.email.controller;

import com.email.dto.BoxDto;
import com.email.entity.Box;
import com.email.service.BoxService;
import com.email.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/box")
public class BoxController {
    @Autowired
    private BoxService boxService;

    /*@GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        log.info("根据邮箱id: {} 查询邮箱信息",id);

        Box box = boxService.getById(id);
        return Result.ok(box);
    }*/

    @GetMapping("/{uid}")
    public Result getByUid(@PathVariable Integer uid){
        log.info("根据用户id：{}获取对应的邮箱信息：", uid);

        return boxService.getByUid(uid);
    }

    @PostMapping("/add")
    public Result addBox(Integer uid,String address, String password){
/*        BoxDto box = boxService.addBox(uid,address,password);*/
        return boxService.addBox(uid,address,password);
    }
}
