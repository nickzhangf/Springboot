package com.example.dao;

import com.example.bean.MyUser;
import com.example.mapper.MyUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * <p>Title:MyUserDao<p>
 * <p>Description:</p>
 * <p>Company:www.scbdlbs.com</p>
 *
 * @author zf
 * @version 1.0
 * @date 2016/9/18
 */
@Component
public class MyUserDao {
    @Autowired
    private MyUserMapper userMapper;

    @Cacheable(value = "myuserCache", key = "#id")
    public MyUser findUserById(Integer id)
    {
        return userMapper.findUserById(id);
    }

    public void insertUser(MyUser user)
    {
        userMapper.insertUser(user);
    }

//    @CachePut(value = "myuserCache", key = "#user.getId()")
    @CacheEvict(value = "myuserCache", key = "#user.getId()")
    public void updateUser(MyUser user)
    {
        userMapper.updateUser(user);
    }

    @CacheEvict(value = "myuserCache", key = "#id")
    public void deleteUser(int id)
    {
        userMapper.deleteUser(id);
    }
}
