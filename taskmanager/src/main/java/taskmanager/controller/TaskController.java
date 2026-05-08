package taskmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import taskmanager.model.Task;
import taskmanager.repository.TaskRepository;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @PostMapping("/tasks")
    public Task createTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // මෙතන Long වෙනුවට Integer කියලා වෙනස් කළා
    @PutMapping("/tasks/{id}")
    public Task updateTask(@PathVariable Integer id, @RequestBody Task taskDetails) {
        Task task = taskRepository.findById(id).orElseThrow();
        task.setTaskName(taskDetails.getTaskName());
        task.setCompleted(taskDetails.isCompleted());
        return taskRepository.save(task);
    }

    // මෙතනත් Long වෙනුවට Integer කියලා වෙනස් කළා
    @DeleteMapping("/tasks/{id}")
    public String deleteTask(@PathVariable Integer id) {
        taskRepository.deleteById(id);
        return "Task deleted";
    }
}