package com.example.jdbcxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

//    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void dealUser() {
        userDao.insertUser();
        userDao.updateUser();

    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
