package com.sekin.spring.spring_mvc_boot.dao;

import com.sekin.spring.spring_mvc_boot.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(User user) {
       entityManager.persist(user);
    }

    @Override
    public void del(Long id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }

    @Override
    public void update(Long id, String newName, String newMail) {
        User updUser = entityManager.find(User.class, id);
        if (!newName.isBlank()) {updUser.setUserName(newName);};
        if (!newMail.isBlank()) {updUser.setUserMail(newMail);}
     }

    public User getUser(Long id) {
        return entityManager.find(User.class, id);

    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> listUsers() {
        TypedQuery<User> query=entityManager.createQuery("select usr FROM User usr", User.class);
        return query.getResultList();
    }

}
