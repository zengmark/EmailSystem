package com.email.controller;

import com.email.dto.BoxDto;
import com.email.entity.Box;
import com.email.service.BoxService;
import com.email.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

        List<BoxDto> boxes = boxService.getByUid(uid);
        return Result.ok(boxes);
    }
}
