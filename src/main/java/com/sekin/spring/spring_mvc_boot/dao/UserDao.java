package com.sekin.spring.spring_mvc_boot.dao;

import com.sekin.spring.spring_mvc_boot.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void del(Long id);
    void update(Long id, String newName, String newMail);
    User getUser(Long id);
    List<User> listUsers();
}
