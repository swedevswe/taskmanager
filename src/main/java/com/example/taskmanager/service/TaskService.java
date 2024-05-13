package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;
import java.util.List;

public interface TaskService {
    Task saveTask(Task task);
    List<Task> getAllTasks();
    Task getTaskById(Long id);
    Task updateTask(Long id, Task task);
    boolean deleteTask(Long id);
}

