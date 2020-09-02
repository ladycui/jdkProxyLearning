package com.cyn.learn.proxy.staticProxy;

public class UserDao implements IUserDao {

    @Override
    public void save() {
        System.out.println("---saved----");
    }
}
