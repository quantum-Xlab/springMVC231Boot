package com.sekin.spring.spring_mvc_boot.service;

import com.sekin.spring.spring_mvc_boot.dao.UserDao;
import com.sekin.spring.spring_mvc_boot.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Transactional
    @Override
    public void del(Long id) {
        userDao.del(id);
    }

    @Transactional
    @Override
    public void  update(Long id, String newName, String newMail) {
        userDao.update(id, newName, newMail);
    }

    @Transactional
    @Override
    public User getUser(Long id) {
        return userDao.getUser(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }

}
