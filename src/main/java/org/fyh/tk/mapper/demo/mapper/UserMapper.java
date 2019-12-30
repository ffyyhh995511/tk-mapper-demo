package org.fyh.tk.mapper.demo.mapper;

import org.fyh.tk.mapper.demo.enter.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<User> {

    public List<User> page();
}