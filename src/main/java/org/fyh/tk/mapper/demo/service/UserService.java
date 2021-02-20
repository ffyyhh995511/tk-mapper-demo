package org.fyh.tk.mapper.demo.service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.fyh.tk.mapper.demo.annotation.FyhService;
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
@FyhService
@Slf4j
public class UserService {

    @Resource
    UserMapper userMapper;

    public void add(User user){
        user.setPhone("15912312323");
        userMapper.insertSelective(user);
        log.info("自增id:{}", user.getId().toString());
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

    public void page(int pageNum, int pageSize){
        //开始分页
        // TODO 分页 + 排序 this.userMapper.selectAll() 这一句就是我们需要写的查询，有了这两款插件无缝切换各种数据库
        final PageInfo<User> pageInfo = PageHelper.startPage(pageNum, pageSize).setOrderBy("id desc")
                .doSelectPageInfo(() -> this.userMapper.selectAll());
        log.info("[lambda写法] - [分页信息] - [{}]", pageInfo.toString());

        PageHelper.startPage(pageNum, pageSize).setOrderBy("id desc");
        final PageInfo<User> userPageInfo = new PageInfo<>(this.userMapper.selectAll());
        log.info("[普通写法] - [{}]", userPageInfo);

    }
}