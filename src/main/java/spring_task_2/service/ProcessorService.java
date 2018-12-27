package spring_task_2.service;

import spring_task_2.model.Processor;

import java.util.List;
import java.util.Optional;

public interface ProcessorService {
    List<Processor> getAll();

    Optional<Processor> findById(int id);

    List<Processor> findByName(String name);

    List<Processor> findByVersion(String version);

    List<Processor> findByCoreCount(int coreCount);

    List<Processor> findByFrequency(int frequency);
}
