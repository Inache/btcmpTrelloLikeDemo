package lv.inache.projectTrelloDemo.tasks;

import lv.inache.projectTrelloDemo.BaseDAOImplementation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

@Repository
public class TasksDAOImplementation extends BaseDAOImplementation<Task> {

    @Autowired
    public TasksDAOImplementation(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public List<Task> getAll() {
        return super.getAll(Task.class);
    }

    public Optional<Task> getById(Long id) {

        return super.getById(id, Task.class);
    }

    public void delete(Long id) {
        super.delete(id, Task.class);
    }
}