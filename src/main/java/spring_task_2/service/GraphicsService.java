package spring_task_2.service;

import spring_task_2.model.Graphics;

import java.util.List;
import java.util.Optional;

public interface GraphicsService {
    List<Graphics> getAll();

    Optional<Graphics> findById(int id);

    List<Graphics> findByName(String name);

    List<Graphics> findByVersion(String version);

    List<Graphics> findByStorage(int storage);

}
