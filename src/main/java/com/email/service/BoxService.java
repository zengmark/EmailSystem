package com.email.service;

import com.email.dto.BoxDto;
import com.email.entity.Box;

import java.util.List;

public interface BoxService {
    BoxDto getById(Integer id);

    List<BoxDto> getByUid(Integer uid);
}
