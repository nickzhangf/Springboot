package com.example.mapper;

import com.example.bean.Party;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>Title:PartyMapper<p>
 * <p>Description:</p>
 * <p>Company:www.scbdlbs.com</p>
 *
 * @author zf
 * @version 1.0
 * @date 2016/9/21
 */
@Mapper
public interface PartyMapper {
    Party getChildrenPartys(int id);
}
