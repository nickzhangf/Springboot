package com.example.bean;

import java.util.List;

/**
 * <p>Title:Party<p>
 * <p>Description:</p>
 * <p>Company:www.scbdlbs.com</p>
 *
 * @author zf
 * @version 1.0
 * @date 2016/9/21
 */
public class Party{
    private int id;
    private String name;
    private List<Party> childrenPartyList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Party> getChildrenPartyList() {
        return childrenPartyList;
    }

    public void setChildrenPartyList(List<Party> childrenPartyList) {
        this.childrenPartyList = childrenPartyList;
    }
}
