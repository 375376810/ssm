package com.yxm.dao;

import com.yxm.domain.Account;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2019/10/9
 * Time: 15:41
 * Description: 账户dao接口
 */
@Repository
public interface AccountDao {
    /**
     * 查询所有账户
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * 保存账户信息
     *
     * @param account
     */
    @Insert("insert into account (name,money) values (#{name},#{money})")
    public void saveAcount(Account account);

}