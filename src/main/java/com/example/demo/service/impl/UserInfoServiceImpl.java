package com.example.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.dao.UserInfoMapper;
import com.example.demo.model.UserInfo;
import com.example.demo.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo selectById(Integer id) {
        return userInfoMapper.selectById(id);
    }
}