package com.sekin.spring.spring_mvc_boot.model;


import jakarta.persistence.*;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_mail")
    private String userMail;

    public User() {

    }

    public User(String userName, String userMail) {
        this.userName = userName;
        this.userMail = userMail;
    }

    public Long getUserId() {
        return this.id;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getUserMail() {
        return this.userMail;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

}
