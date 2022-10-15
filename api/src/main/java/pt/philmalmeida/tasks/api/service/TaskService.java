package pt.philmalmeida.tasks.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.philmalmeida.tasks.api.entity.Task;
import pt.philmalmeida.tasks.api.repository.TaskRepository;

@Service
public class TaskService {

    final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) { this.taskRepository = taskRepository; }

    public Task saveTask(Task task) {
        return this.taskRepository.save(task);
    }
}
