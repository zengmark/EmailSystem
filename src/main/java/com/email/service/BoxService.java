package com.email.service;

import com.email.dto.BoxDto;
import com.email.entity.Box;
import com.email.utils.Result;

import java.util.List;

public interface BoxService {
    BoxDto getById(Integer id);

    Result getByUid(Integer uid);

    Result addBox(Integer uid, String address, String password);
}
