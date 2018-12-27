package spring_task_2.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import spring_task_2.model.Type;
import spring_task_2.repository.TypeRepository;
import spring_task_2.service.TypeService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TypeServiceImpl implements TypeService {
    private final TypeRepository repository;

    @Override
    public List<Type> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Type> findById(int id) {
        return repository.findById(id);
    }

    @Override
    public List<Type> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Type> findByDescription(String description) {
        return repository.findByDescription(description);
    }


}
