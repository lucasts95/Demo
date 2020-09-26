package com.example.demo.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.ret.RetResult;
import com.example.demo.model.UserInfo;
import com.example.demo.service.UserInfoService;

@RestController
@RequestMapping("userInfo")
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    @PostMapping("/hello")
    public String hello() {
        return "hello springboot";
    }

//    @PostMapping("/selectById")
//    public UserInfo selectById(Integer id) {
//        return userInfoService.selectById(id);
//    }

    @PostMapping("/selectById")
    public RetResult<UserInfo> selectById(Integer id){
        UserInfo userInfo = userInfoService.selectById(id);
        return RetResponse.makeOKRsp(userInfo);
    }
}
