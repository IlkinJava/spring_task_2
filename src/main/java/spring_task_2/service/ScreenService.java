package spring_task_2.service;

import spring_task_2.model.Screen;

import java.util.List;
import java.util.Optional;

public interface ScreenService {
    List<Screen> getAll();

    Optional<Screen> findById(int id);

    List<Screen> findByDiagonal(double diagonal);

    List<Screen> findByResolution(String resolution);
}
