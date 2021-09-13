package com.baizhi.service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional

public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public void save(User user) {
            userDao.save(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void delete(String id) {
            userDao.delete(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User finById(String id) {
        return userDao.finById(id);
    }
}
