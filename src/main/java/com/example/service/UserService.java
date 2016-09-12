package com.example.service;

import com.example.bean.User;

/**
 * Created by Administrator on 2016/9/7.
 */
public interface UserService {

    public void save(User user);
    public User findById(long id);

}

