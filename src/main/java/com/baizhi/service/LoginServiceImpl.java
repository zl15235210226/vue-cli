package com.baizhi.service;


import com.baizhi.dao.LoginDao;
import com.baizhi.entity.Login;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
/**
 * 这个不会
 */
@Transactional
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginDao loginDao;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int login(Login login) {
        Login login1=loginDao.findByName(login.getUsername());
        if (login1==null) return 3;
        if (login1.getPassword().equals(login.getPassword())==false) return  2;
       return   1;
    }

    @Override

    public void AddLogin(Login login) {
        loginDao.addUser(login);
    }
}
