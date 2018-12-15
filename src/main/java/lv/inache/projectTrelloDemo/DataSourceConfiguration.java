package lv.inache.projectTrelloDemo;

import lv.inache.projectTrelloDemo.groups.Group;
import lv.inache.projectTrelloDemo.tasks.Task;
import lv.inache.projectTrelloDemo.users.User;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfiguration {

    @Bean
    public SessionFactory sessionFactory() {
        return new org.hibernate.cfg.Configuration()
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Task.class)
                .addAnnotatedClass(Group.class)
                .configure()
                .buildSessionFactory();
    }
}
