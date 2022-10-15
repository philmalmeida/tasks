package pt.philmalmeida.tasks.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.philmalmeida.tasks.api.entity.Task;
import pt.philmalmeida.tasks.api.service.TaskService;

@RestController
public class TaskController {

    final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) { this.taskService = taskService; }

    @PostMapping("/tasks")
    public ResponseEntity<Task> saveTask(@RequestBody Task task){
        return ResponseEntity.ok(
            this.taskService.saveTask(task)
        );
    }

    @DeleteMapping("/tasks/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Integer id){
        this.taskService.deleteTask(id);
        return ResponseEntity.noContent().build();
    }
}
