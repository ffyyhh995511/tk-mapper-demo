package org.fyh.tk.mapper.demo.server;
import org.fyh.tk.mapper.demo.enter.User;
import org.fyh.tk.mapper.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @author fangyunhe
 * @version 1.0
 * @Description
 * @time 2019/12/12 0:17
 */
@Service
public class UserService {

    @Resource
    UserMapper userMapper;

    public void add(User user){
        user.setPhone("15912312311");
        userMapper.insertSelective(user);
    }

    public User get(int id){
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    public void delete(int id){
        userMapper.deleteByPrimaryKey(id);
    }

    public void update(int id, String phone ){
        User user = userMapper.selectByPrimaryKey(id);
        user.setPhone(phone);
        userMapper.updateByPrimaryKey(user);
    }

    public void page(int id){
        //开始分页

    }
}