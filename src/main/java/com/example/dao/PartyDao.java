package com.example.dao;

import com.example.bean.Party;
import com.example.mapper.PartyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>Title:PartyDao<p>
 * <p>Description:</p>
 * <p>Company:www.scbdlbs.com</p>
 *
 * @author zf
 * @version 1.0
 * @date 2016/9/21
 */
@Component
public class PartyDao {
    @Autowired
    private PartyMapper partyMapper;

    public Party getChildrenPartys(int id)
    {
        return partyMapper.getChildrenPartys(id);
    }
}
