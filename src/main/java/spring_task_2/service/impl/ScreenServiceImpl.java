package spring_task_2.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import spring_task_2.exception.WrongData;
import spring_task_2.model.Screen;
import spring_task_2.repository.ScreenRepository;
import spring_task_2.service.ScreenService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ScreenServiceImpl implements ScreenService {
    private final ScreenRepository repository;

    @Override
    public List<Screen> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Screen> findById(int id) {
        return repository.findById(id);
    }

    @Override
    public List<Screen> findByDiagonal(double diagonal) {
        if (diagonal <= 0) {
            throw new WrongData("diagonal can not be negative or 0");
        }
        return repository.findByDiagonal(diagonal);
    }

    @Override
    public List<Screen> findByResolution(String resolution) {
        return repository.findByResolution(resolution);
    }


}
