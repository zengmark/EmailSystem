package com.email.service.impl;

import com.email.dto.BoxDto;
import com.email.entity.Box;
import com.email.mapper.BoxMapper;
import com.email.service.BoxService;
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
    public List<BoxDto> getByUid(Integer uid) {
        return boxMapper.getByUid(uid);
    }
}
