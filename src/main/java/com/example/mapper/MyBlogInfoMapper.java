package com.example.mapper;

import com.example.bean.MyBlogInfo;
import com.example.bean.MyPost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>Title:MyBlogInfoMapper<p>
 * <p>Description:</p>
 * <p>Company:www.scbdlbs.com</p>
 *
 * @author zf
 * @version 1.0
 * @date 2016/9/21
 */
@Mapper
public interface MyBlogInfoMapper {
    MyBlogInfo queryAllBlogInfo(int id);

    List<MyPost> queryAllBlogInfo1(int id);
}
