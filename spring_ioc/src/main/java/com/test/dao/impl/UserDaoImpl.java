package com.test.dao.impl;

import com.test.dao.UserDao;

/**
 * @Author: Jface
 * @Date: 2021/9/25 20:57
 * @Desc:
 */
public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("UserDaoImpl 对象创建...");
    }

    @Override
    public void save() {
        System.out.println("save running......");
    }
}
