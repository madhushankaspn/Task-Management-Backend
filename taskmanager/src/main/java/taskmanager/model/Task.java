package taskmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // මේකෙන් කියන්නේ මේක Database Table එකක් කියලා
public class Task {

    @Id // මේක තමයි Primary Key එක
    @GeneratedValue(strategy = GenerationType.IDENTITY) // මේකෙන් ID එක ඔටෝමැටික් වැඩි වෙනවා
    private int id;

    private String taskName;
    private boolean isCompleted;

    // --- Getters and Setters ---

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}