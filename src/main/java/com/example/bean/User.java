package com.example.bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2016/9/7.
 */
@Entity
public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true)
    private String username;    //用户名
    private String name;    // 姓名
    private String password;
    private String salt;    // 加密密码的盐
    private byte state;     // 用户状态，0创建未认证，1正常状态，2用户锁定

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "SysUserRole", joinColumns = {@JoinColumn(name = "id")}, inverseJoinColumns = {@JoinColumn(name = "roleId")})
//    private List<SysRole> roleList; // 一个用户具有多个角色


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public byte getState() {
        return state;
    }

    public void setState(byte state) {
        this.state = state;
    }
}
