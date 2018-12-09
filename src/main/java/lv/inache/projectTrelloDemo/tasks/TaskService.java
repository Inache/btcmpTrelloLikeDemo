package lv.inache.projectTrelloDemo.tasks;

import lv.inache.projectTrelloDemo.users.User;
import lv.inache.projectTrelloDemo.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TaskService {
    private final TasksDAOImplementation tasksDAO;

    @Autowired
    public TaskService(TasksDAOImplementation tasksDAO) {
        this.tasksDAO = tasksDAO;
    }

    public Long addTask(Task t) {
        t.setCreatedDate(new Date());
        return tasksDAO.insert(t);
    }

    public boolean deleteTask(Long id) {
        if (tasksDAO.getById(id, Task.class).isPresent()) {
            tasksDAO.delete(id, Task.class);
            return true;
        }

        return false;
    }

    public List<Task> get() {
        return tasksDAO.getAll();
    }

    public Optional<Task> get(Long id) {
        return tasksDAO.getById(id);
    }

    public boolean update(Task newTask) {
        tasksDAO.update(newTask);
        return true;
    }

    public boolean assign(Long taskId, Long userId) {
        return false;
    }
}
