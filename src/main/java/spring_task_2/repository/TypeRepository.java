package spring_task_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_task_2.model.Type;

import java.util.List;

public interface TypeRepository extends JpaRepository<Type, Integer> {
    List<Type> findByName(String name);

    List<Type> findByDescription(String description);
}
