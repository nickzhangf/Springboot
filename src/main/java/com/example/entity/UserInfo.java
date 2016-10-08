package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * <p>Title:UserInfo<p>
 * <p>Description:</p>
 * <p>Company:www.scbdlbs.com</p>
 *
 * @author zf
 * @version 1.0
 * @date 2016/9/14
 */
@Entity
public class UserInfo implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uid;
    private String username;
    private String password;
    private String salt;    // 加密密码的盐
    private byte state;     // 用户状态 0：创建未认证，1：正常状态，2：用户被锁定

    // 用户-角色关系
//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "SysUserRole", joinColumns = {@JoinColumn(name = "uid")}, inverseJoinColumns = {@JoinColumn(name = "roleId")})
//    private List<SysRole> roleList;
}
