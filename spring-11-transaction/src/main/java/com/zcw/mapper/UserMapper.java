package com.zcw.mapper;

import com.zcw.pojo.User;

import java.util.List;

/**
 * @Author: AndrewBar
 * @Date: Created in 8:59 2020/7/22
 */
public interface UserMapper {
    public List<User> selectUser();

    //添加一个用户
    public int addUser(User user);

    //删除一个用户
    public int deleteUser(int id);
}
