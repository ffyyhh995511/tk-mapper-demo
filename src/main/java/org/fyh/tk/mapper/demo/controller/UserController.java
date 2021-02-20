package org.fyh.tk.mapper.demo.controller;

import org.fyh.tk.mapper.demo.enter.User;
import org.fyh.tk.mapper.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author fangyunhe
 * @version 1.0
 * @Description
 * @time 2019/12/12 0:23
 */
@RestController
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("add")
    public String add(User user){
        userService.add(user);
        return "ok";
    }

    @RequestMapping("get")
    public User get(int id){
        return userService.get(id);
    }

    @RequestMapping("del")
    public String delete(int id){
        userService.delete(id);
        return "ok";
    }

    @RequestMapping("update")
    public String update(int id, String phone ){
        userService.update(id, phone);
        return "ok";
    }

    @RequestMapping("page")
    public String page(int pageNum, int pageSize){
        userService.page(pageNum, pageSize);
        return "ok";
    }
}