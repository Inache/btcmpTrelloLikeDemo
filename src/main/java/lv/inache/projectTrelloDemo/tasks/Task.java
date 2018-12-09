package lv.inache.projectTrelloDemo.tasks;

import lv.inache.projectTrelloDemo.users.User;

import javax.persistence.*;
import java.util.Objects;
import java.util.Date;

@Entity
@Table(name = "NCH_TASKS")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "assigned_user_id")
    private User user;

    @Column(name = "created_date")
    private Date createdDate;

    public Task() {
    }


    public Task(String title, String description, User user, Date createdDate) {
        this.title = title;
        this.description = description;
        this.user = user;
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) &&
                Objects.equals(title, task.title) &&
                Objects.equals(description, task.description) &&
                Objects.equals(user.getId(), task.user.getId()) &&
                Objects.equals(createdDate, task.createdDate);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", user=" + (user != null ? user.getId() : "") +
                ", createdDate=" + createdDate +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, title, description, user.getId(), createdDate);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
