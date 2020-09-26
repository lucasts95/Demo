package com.example.demo;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description:
 * @author: Lucas
 * @time: 2020/9/24 21:44
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestController {
    @Autowired
    DataSource dataSource;
    @Test
    public void test(){
        System.out.println(dataSource.getClass());
    }
}
