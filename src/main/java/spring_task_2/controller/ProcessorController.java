package spring_task_2.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import spring_task_2.model.Processor;
import spring_task_2.service.ProcessorService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/processor")
public class ProcessorController {
    private final ProcessorService service;

    @GetMapping()
    List<Processor> findAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    Optional<Processor> findById(@PathVariable int id) {
        return service.findById(id);
    }

    @GetMapping("/find_name")
    List<Processor> findByName(@RequestParam String name) {
        return service.findByName(name);
    }

    @GetMapping("/find_version")
    List<Processor> findByVersion(@RequestParam String version) {
        return service.findByName(version);
    }

    @GetMapping("/find_core_count")
    List<Processor> findByName(@RequestParam int coreCount) {
        return service.findByCoreCount(coreCount);
    }

    @GetMapping("/find_frequency")
    List<Processor> findByFrequency(@RequestParam int frequency) {
        return service.findByFrequency(frequency);
    }
}
