package com.example.repository;

import com.example.bean.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2016/9/7.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
