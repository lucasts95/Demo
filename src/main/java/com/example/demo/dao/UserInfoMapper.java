package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.model.UserInfo;

public interface UserInfoMapper {
    UserInfo selectById(@Param("id") Integer id);

    List<UserInfo> selectAll();
}
