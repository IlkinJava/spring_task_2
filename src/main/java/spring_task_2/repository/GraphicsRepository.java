package spring_task_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_task_2.model.Graphics;

import java.util.List;

public interface GraphicsRepository extends JpaRepository<Graphics, Integer> {
    List<Graphics> findByName(String name);

    List<Graphics> findByVersion(String version);

    List<Graphics> findByStorage(int storage);
}
