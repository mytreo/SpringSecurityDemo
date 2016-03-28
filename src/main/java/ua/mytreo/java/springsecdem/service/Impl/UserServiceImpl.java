package ua.mytreo.java.springsecdem.service.impl;


import org.springframework.stereotype.Service;
import ua.mytreo.java.springsecdem.entity.User;
import ua.mytreo.java.springsecdem.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(String login) {
        /*Как видите реализация довольно простая, тут мы просто заполняем объект
        User используя setters, но мы также можем в этом севис методе вызвать
        метод из DAO, который бы достал нам этого юзера с БД например либо получил
        бы его с Web Service.*/
        User user = new User();
        user.setLogin(login);
        /*«1234» зашифрован в SHA1 формат*/
        user.setPassword("7110eda4d09e062aa5e4a390b0a572ac0d2c0220");

        return user;
    }

}