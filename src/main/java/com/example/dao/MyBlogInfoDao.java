package com.example.dao;

import com.example.bean.MyBlogInfo;
import com.example.mapper.MyBlogInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>Title:MyBlogInfoDao<p>
 * <p>Description:</p>
 * <p>Company:www.scbdlbs.com</p>
 *
 * @author zf
 * @version 1.0
 * @date 2016/9/21
 */
@Component
public class MyBlogInfoDao {

    @Autowired
    private MyBlogInfoMapper myBlogInfoMapper;

    public MyBlogInfo queryAllBlogInfo(int id)
    {
        return myBlogInfoMapper.queryAllBlogInfo(id);
    }
}
