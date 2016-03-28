package ua.mytreo.java.springsecdem.entity;


import ua.mytreo.java.springsecdem.entity.enums.UserRoleEnum;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Id
    private long id;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private UserRoleEnum role;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRoleEnum getRole() {
        return role;
    }

    public void setRole(UserRoleEnum role) {
        this.role = role;
    }


}