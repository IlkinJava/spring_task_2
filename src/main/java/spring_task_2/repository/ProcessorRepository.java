package spring_task_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_task_2.model.Processor;

import java.util.List;

public interface ProcessorRepository extends JpaRepository<Processor, Integer> {
    List<Processor> findByName(String name);

    List<Processor> findByVersion(String version);

    List<Processor> findByCoreCount(int coreCount);

    List<Processor> findByFrequency(int frequency);
}
