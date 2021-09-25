package com.test;

import com.test.dao.impl.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Jface
 * @Date: 2021/9/25 21:00
 * @Desc: spring 入门： 测试 IOC，从容器中获取对象
 */
public class UserDaoTest {
    public static void main(String[] args) {
        //1.获取容器
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.根据 id 获取对象
        UserDaoImpl userDao = app.getBean(UserDaoImpl.class);
        userDao.save();
    }
}
