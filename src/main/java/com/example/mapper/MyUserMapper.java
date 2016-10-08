package com.example.mapper;

import com.example.bean.MyUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>Title:MyUserMapper<p>
 * <p>Description:</p>
 * <p>Company:www.scbdlbs.com</p>
 *
 * @author zf
 * @version 1.0
 * @date 2016/9/18
 */
@Mapper
public interface MyUserMapper {
    MyUser findUserById(Integer id);

    void insertUser(MyUser user);

    void updateUser(MyUser user);

    void deleteUser(int id);
}
