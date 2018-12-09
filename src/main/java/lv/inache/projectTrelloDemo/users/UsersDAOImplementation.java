package lv.inache.projectTrelloDemo.users;

import lv.inache.projectTrelloDemo.BaseDAOImplementation;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UsersDAOImplementation extends BaseDAOImplementation<User> {
    @Autowired
    protected UsersDAOImplementation(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
    public List<User> getAll() {
        return super.getAll(User.class);
    }
    public Optional<User> getById(Long id) {
        return super.getById(id, User.class);
    }
    public void delete(Long id) {
        super.delete(id, User.class);
    }
}
