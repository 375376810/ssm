package com.yxm.service;

import com.yxm.domain.Account;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2019/10/9
 * Time: 15:43
 * Description: 账户service接口
 */
public interface AccountService {
    /**
     * 查询所有账户
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户信息
     * @param account
     */
    public void saveAcount(Account account);
}