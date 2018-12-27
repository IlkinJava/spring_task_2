package spring_task_2.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import spring_task_2.exception.WrongData;
import spring_task_2.model.Graphics;
import spring_task_2.repository.GraphicsRepository;
import spring_task_2.service.GraphicsService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class GraphicsServiceImpl implements GraphicsService {
    private final GraphicsRepository repository;


    @Override
    public List<Graphics> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Graphics> findById(int id) {
        return repository.findById(id);
    }

    @Override
    public List<Graphics> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Graphics> findByVersion(String version) {
        return repository.findByVersion(version);
    }

    @Override
    public List<Graphics> findByStorage(int storage) {
        if (storage <= 0) {
            throw new WrongData("storage can not be negative or 0");
        }
        return repository.findByStorage(storage);
    }

}
