package com.yxm.service.impl;

import com.yxm.dao.AccountDao;
import com.yxm.domain.Account;
import com.yxm.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2019/10/9
 * Time: 15:46
 * Description: AccountService业务层实现类
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有信账户");
        return accountDao.findAll();
    }

    @Override
    public void saveAcount(Account account) {
        System.out.println("业务层保存账户信息");
        accountDao.saveAcount(account);
    }

}
