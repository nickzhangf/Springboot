package com.example.controller;

import com.example.bean.User;
import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/6.
 */
@Controller
@RequestMapping("/demo")
public class SimpleController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    public String hello(Map<String, Object> map)
    {
        map.put("hello", "hello world!");
        return "user";
    }

    @RequestMapping("/getUser")
    public User getUser()
    {
        User user = new User();
        user.setId(1);
        user.setName("zf");
        return user;
    }

    @RequestMapping("/saveUser")
    public String saveUser()
    {
        User user = new User();
        user.setName("kk");
        userService.save(user);
        return "Save user success!";
    }
}