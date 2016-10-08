package com.example.bean;

import java.util.List;

/**
 * <p>Title:MyBlogInfo<p>
 * <p>Description:</p>
 * <p>Company:www.scbdlbs.com</p>
 *
 * @author zf
 * @version 1.0
 * @date 2016/9/20
 */
public class MyBlogInfo {
    private int blogId;
    private String title;
    private MyUser myUser;
    private List<MyPost> myPostList;

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MyUser getMyUser() {
        return myUser;
    }

    public void setMyUser(MyUser myUser) {
        this.myUser = myUser;
    }

    public List<MyPost> getMyPostList() {
        return myPostList;
    }

    public void setMyPostList(List<MyPost> myPostList) {
        this.myPostList = myPostList;
    }
}
