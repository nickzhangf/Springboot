package com.example.service;

import com.example.bean.User;
import com.example.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/9/7.
 */
@Service
public class UserService {
    @Resource
    private UserRepository userRepository;

    @Transactional
    public void save(User user)
    {
        userRepository.save(user);
    }
}
