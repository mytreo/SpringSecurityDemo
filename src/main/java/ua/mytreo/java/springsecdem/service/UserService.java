package ua.mytreo.java.springsecdem.service;

import ua.mytreo.java.springsecdem.entity.User;

/**
 * Created by 1 on 25.03.2016.
 */
public interface UserService {
    User getUser(String login);
}
