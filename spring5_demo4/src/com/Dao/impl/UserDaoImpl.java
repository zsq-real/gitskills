package com.Dao.impl;

import com.Dao.UserDao;

public class UserDaoImpl  implements UserDao {
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
