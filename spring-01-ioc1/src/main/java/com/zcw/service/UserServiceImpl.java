package com.zcw.service;

import com.zcw.dao.UserDao;
import com.zcw.dao.UserDaoImpl;
import com.zcw.dao.UserDaoMysqlImpl;

/**
 * @Author: AndrewBar
 * @Date: Created in 9:53 2020/7/19
 */
public class UserServiceImpl implements UserService {

    //private UserDao userDao = new UserDaoImpl();
    private UserDao userDao;

    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
