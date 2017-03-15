package com.example.controller;

import com.example.bean.MyBlogInfo;
import com.example.bean.MyUser;
import com.example.bean.Party;
import com.example.bean.User;
import com.example.dao.MyBlogInfoDao;
import com.example.dao.MyUserDao;
import com.example.dao.PartyDao;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/6.
 */
@Controller
@RequestMapping("/demo")
public class SimpleController {
    @Resource
    private UserService userService;
    @Autowired
    private MyUserDao myUserDao;

    @Autowired
    private MyBlogInfoDao myBlogInfoDao;

    @Autowired
    private PartyDao partyDao;

    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    public String hello(Map<String, Object> map)
    {
        map.put("hello", "hello world!");
        return "user";
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser()
    {
        User user = new User();
        user.setId(1);
        user.setName("zf");
        return user;
    }

    @RequestMapping("/saveUser")
    public String saveUser()
    {
        User user = new User();
        user.setName("zhangsan2");
        userService.save(user);
        return "user";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login()
    {
        return "login";
    }

    @RequestMapping("/findUserById")
    @ResponseBody
    public MyUser findUserById(@RequestParam(value = "id") Integer id, HttpSession session)
    {
        MyUser user = myUserDao.findUserById(id);
        String name = (String) session.getAttribute("user-" + id);
        System.out.println("session: user-" + id + "=" + name);
        return user;
    }


    @RequestMapping(value = "/insertUser")
    @ResponseBody
    public String insertUser(@RequestParam(value = "name") String name)
    {
        MyUser user = new MyUser();
        user.setName(name);
        myUserDao.insertUser(user);
        return "success!";
    }

    @RequestMapping(value = "/updateUser")
    @ResponseBody
    public String updateUser(@RequestParam(value = "id") int id, @RequestParam(value = "name") String name, HttpSession session)
    {
        MyUser user = new MyUser();
        user.setId(id);
        user.setName(name);
        session.setAttribute("user-" + id, name);
        myUserDao.updateUser(user);
        return "success!";
    }

    @RequestMapping(value = "/deleteUser")
    @ResponseBody
    public String deleteUser(@RequestParam(value = "id") int id)
    {
        myUserDao.deleteUser(id);
        return "success!";
    }

    @RequestMapping(value = "/queryAllBlogInfo")
    @ResponseBody
    public String queryAllBlogInfo(@RequestParam(value = "id") int id)
    {
        MyBlogInfo myBlogInfo = myBlogInfoDao.queryAllBlogInfo(id);
        return "success!";
    }

    @RequestMapping(value = "/getChildrenPartys")
    @ResponseBody
    public String getChildrenPartys(@RequestParam(value = "id") int id)
    {
        Party party = partyDao.getChildrenPartys(id);
        return "success!";
    }
}
