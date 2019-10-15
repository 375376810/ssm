package com.yxm.domain;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2019/10/9
 * Time: 15:38
 * Description: 账户类
 */
public class Account implements Serializable {
    private Integer id;
    private String name;
    private double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name='" + name + '\'' + ", money=" + money + '}';
    }
}
