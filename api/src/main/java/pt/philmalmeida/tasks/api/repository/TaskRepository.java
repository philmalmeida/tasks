package pt.philmalmeida.tasks.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pt.philmalmeida.tasks.api.entity.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {
}
