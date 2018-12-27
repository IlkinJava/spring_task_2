package spring_task_2.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import spring_task_2.model.Graphics;
import spring_task_2.service.GraphicsService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/graphics")
public class GraphicsController {
    private final GraphicsService service;

    @GetMapping
    List<Graphics> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    Optional<Graphics> findById(@PathVariable int id) {
        return service.findById(id);
    }

    @GetMapping("/find_name")
    List<Graphics> findByName(@RequestParam String name) {
        return service.findByName(name);
    }

    @GetMapping("/find_version")
    List<Graphics> findByVersion(@RequestParam String version) {
        return service.findByVersion(version);
    }

    @GetMapping("/find_storage")
    List<Graphics> findByStorage(@RequestParam int storage) {
        return service.findByStorage(storage);
    }
}
