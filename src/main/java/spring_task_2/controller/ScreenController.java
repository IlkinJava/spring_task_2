package spring_task_2.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import spring_task_2.model.Screen;
import spring_task_2.service.ScreenService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/screen")
public class ScreenController {
    private final ScreenService service;

    @GetMapping
    List<Screen> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    Optional<Screen> findById(@PathVariable int id) {
        return service.findById(id);
    }

    @GetMapping("/find_diagonal")
    List<Screen> findByDiagonal(@RequestParam double diagonal) {
        return service.findByDiagonal(diagonal);
    }

    @GetMapping("/find_resolution")
    List<Screen> findByResolution(@RequestParam String resolution) {
        return service.findByResolution(resolution);
    }
}
