package spring_task_2.service;

import spring_task_2.model.Type;

import java.util.List;
import java.util.Optional;

public interface TypeService {
    List<Type> getAll();

    Optional<Type> findById(int id);

    List<Type> findByName(String name);

    List<Type> findByDescription(String description);
}
