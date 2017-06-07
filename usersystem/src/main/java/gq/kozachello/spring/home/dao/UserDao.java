package gq.kozachello.spring.home.dao;

import gq.kozachello.spring.home.model.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Козак on 29.05.2017.
 */

@Repository
public class UserDao {

    private List<User> users = Arrays.asList(new User("alex", "1234"), new User("petja", "5678"));

    public List<User> getUsers() {
        return users;
    }

}
