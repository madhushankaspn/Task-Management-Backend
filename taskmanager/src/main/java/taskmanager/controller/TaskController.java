package taskmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import taskmanager.model.Task;
import taskmanager.repository.TaskRepository;

import java.util.List;

@RestController // මේකෙන් කියන්නේ මේක API එකක් කියලා
@RequestMapping("/tasks") // අපේ API එකට එන පාර (URL එක) මේකයි
@CrossOrigin // පස්සේ කාලෙක React වලට මේකත් එක්ක කතා කරන්න මේක අනිවාර්යයි
public class TaskController {

    @Autowired
    private TaskRepository taskRepository; // අපි අර කලින් හදපු සහයකයාව මෙතනට ගෙන්න ගන්නවා

    // 1. අලුත් Task එකක් සේව් කරන්න (Create - POST)
    @PostMapping
    public Task addTask(@RequestBody Task task) {
        return taskRepository.save(task); // සහයකයා ලවා දත්තය සේව් කරවනවා
    }

    // 2. තියෙන Tasks ඔක්කොම බලන්න (Read - GET)
    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll(); // සහයකයා ලවා දත්ත ඔක්කොම අරන් එනවා
    }
}

