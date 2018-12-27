package spring_task_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_task_2.model.Screen;

import java.util.List;

public interface ScreenRepository extends JpaRepository<Screen, Integer> {
    List<Screen> findByDiagonal(double diagonal);

    List<Screen> findByResolution(String resolution);
}
