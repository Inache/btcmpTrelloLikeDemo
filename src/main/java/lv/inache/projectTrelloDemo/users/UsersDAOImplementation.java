package lv.inache.projectTrelloDemo.users;

import lv.inache.projectTrelloDemo.BaseDAOImplementation;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsersDAOImplementation extends BaseDAOImplementation<User> {
    @Autowired
    protected UsersDAOImplementation(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
