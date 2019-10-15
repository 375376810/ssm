package com.yxm.test;

import com.yxm.service.AccountService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2019/10/10
 * Time: 10:42
 * Description: spring测试类
 */
public class TestSpring {

    @Test
    public void run1() {
        //1.加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //2.获取service对象
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        //3.调用方法
        accountService.findAll();
    }

}
