package com.baizhi.dao;

import com.baizhi.entity.Login;

public interface LoginDao {
     Login findByName(String username);
    void addUser(Login login);
}
