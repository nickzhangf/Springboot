package com.example.service.impl;

import com.example.bean.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Created by Administrator on 2016/9/12.
 */
@Service
public class UserSeviceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Cacheable(value = "userInfo")
    @Override
    public User findById(long id) {
        System.err.println("从数据库进行获取的id=" + id);
        return userRepository.findOne(id);
    }


}
