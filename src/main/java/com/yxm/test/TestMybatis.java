package com.yxm.test;

import com.yxm.dao.AccountDao;
import com.yxm.domain.Account;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2019/10/15
 * Time: 11:10
 * Description: 测试mybatis环境是否搭建OK
 */
public class TestMybatis {

    /**
     * 测试数据库查询功能
     * @throws Exception
     */
    @Test
    public void test1() throws Exception {
        //1.加载mybatis配置文件
        //"sqlMapConfig.xml"文件编译后就在classes根目录下,可以直接加载
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //2.build一个sqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3.创建sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.获取到accountDao的代理对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        //5.查询
        List<Account> accountList = accountDao.findAll();
        for (Account account : accountList) {
            System.out.println(account);
        }
        //6.使用后关闭资源
        sqlSession.close();
        resourceAsStream.close();
    }

    /**
     * 测试数据库插入数据功能
     * @throws Exception
     */
    @Test
    public void test2() throws Exception {
        //0.new一个account对象
        Account account = new Account();
        account.setName("小红");
        account.setMoney(200d);
        //1.加载mybatis配置文件
        //"sqlMapConfig.xml"文件编译后就在classes根目录下,可以直接加载
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //2.build一个sqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3.创建sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.获取到accountDao的代理对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        //5.插入
        accountDao.saveAcount(account);
        //6.提交事务
        sqlSession.commit();
        //7.使用后关闭资源
        sqlSession.close();
        resourceAsStream.close();
    }

}
