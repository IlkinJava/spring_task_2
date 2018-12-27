package spring_task_2.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import spring_task_2.model.Type;
import spring_task_2.service.TypeService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/type")
public class TypeController {
    private final TypeService service;

    @GetMapping
    List<Type> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    Optional<Type> getById(@PathVariable int id) {
        return service.findById(id);
    }

    @GetMapping("/find_name")
    List<Type> findByName(@RequestParam String name) {
        return service.findByName(name);
    }

    @GetMapping("/find_description")
    List<Type> findByDescription(@RequestParam String description) {
        return service.findByDescription(description);
    }
}
