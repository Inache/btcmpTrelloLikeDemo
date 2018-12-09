package lv.inache.projectTrelloDemo.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class UserService {
    private final UsersDAOImplementation usersDAOImplementation;
    @Autowired
    public UserService(UsersDAOImplementation usersDAOImplementation) {
        this.usersDAOImplementation = usersDAOImplementation;
    }

    public Long add(User user) {
        return usersDAOImplementation.insert(user);
    }


    public List<User> users() {
        List<User> users = usersDAOImplementation.getAll();
        return users;
    }

    public Optional<User> get(Long id) {
        return usersDAOImplementation.getById(id);
    }

    public void delete (Long id) {
        usersDAOImplementation.delete(id);
    }

    public void update(Long id, User u) {
        u.setId(id);
        usersDAOImplementation.update(u);
    }
}
