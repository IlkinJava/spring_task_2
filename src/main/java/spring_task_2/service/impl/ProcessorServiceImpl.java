package spring_task_2.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import spring_task_2.exception.WrongData;
import spring_task_2.model.Processor;
import spring_task_2.repository.ProcessorRepository;
import spring_task_2.service.ProcessorService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProcessorServiceImpl implements ProcessorService {
    private final ProcessorRepository repository;


    @Override
    public List<Processor> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Processor> findById(int id) {
        return repository.findById(id);
    }

    @Override
    public List<Processor> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Processor> findByVersion(String version) {
        return repository.findByVersion(version);
    }

    @Override
    public List<Processor> findByCoreCount(int coreCount) {
        if (coreCount <= 0) {
            throw new WrongData("core count can not be negative or 0");
        }
        return repository.findByCoreCount(coreCount);
    }

    @Override
    public List<Processor> findByFrequency(int frequency) {
        if (frequency <= 0) {
            throw new WrongData("frequency can not be negative or 0");
        }
        return repository.findByFrequency(frequency);
    }


}
