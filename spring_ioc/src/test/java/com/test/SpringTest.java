package com.test;

import com.test.dao.impl.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

/**
 * @Author: Jface
 * @Date: 2021/9/25 21:17
 * @Desc: 测试 scope 属性
 */
public class SpringTest {
    @Test
    public void test1(){
        //1.获取容器
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.根据 id 获取对象
        UserDaoImpl userDao1 = app.getBean(UserDaoImpl.class);
        UserDaoImpl userDao2 = app.getBean(UserDaoImpl.class);
        System.out.println(userDao1);
        System.out.println(userDao2);

    }


}
