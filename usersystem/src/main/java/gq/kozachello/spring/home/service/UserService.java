package gq.kozachello.spring.home.service;

import gq.kozachello.spring.home.dao.UserDao;
import gq.kozachello.spring.home.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Козак on 29.05.2017.
 */

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getAllUsers() {
        return userDao.getUsers();
    }

}
