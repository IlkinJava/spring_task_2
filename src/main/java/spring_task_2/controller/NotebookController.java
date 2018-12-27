package spring_task_2.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import spring_task_2.model.Notebook;
import spring_task_2.service.NotebookService;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/notebooks")
public class NotebookController {
    private final NotebookService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/save")
    void addNotebook(@RequestBody Notebook notebook) {
        service.createNotebook(notebook);
    }

    @GetMapping
    List<Notebook> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    Optional<Notebook> findById(@PathVariable int id) {
        return service.findById(id);
    }

    @DeleteMapping("/del/{id}")
    void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("/find_by_name")
    List<Notebook> findByName(@RequestParam String name) {
        return service.findByName(name);
    }

    @GetMapping("/find_by_ram")
    List<Notebook> findByRam(@RequestParam int ram) {
        return service.findByRam(ram);
    }

    @GetMapping("/find_by_processor_name")
    List<Notebook> findByProcessorName(@RequestParam String name) {
        return service.findByProcessorName(name);
    }

    @GetMapping("/find_by_year_of_issue")
    List<Notebook> findByYearOfIssueAfter(@RequestParam String date) {
        return service.findByYearOfIssueAfter(date);
    }

    @GetMapping("/find_by_storage")
    List<Notebook> findByStorageGreaterThan(@RequestParam int storage) {
        return service.findByStorageGreaterThan(storage);
    }

    @GetMapping("/find_by_diagonal")
    public List<Notebook> findByScreenDiagonalGreaterThan(@RequestParam double diagonal) {
        return service.findByScreenDiagonalGreaterThan(diagonal);
    }

    @GetMapping("/find_by_price_less")
    public List<Notebook> findByPriceLessThan(@RequestParam Double price) {
        return service.findByPriceLessThan(price);
    }

    @GetMapping("/find_by_name_core_count/{name}")
    public List<Notebook> findByNameAndProcessorCoreCount(@PathVariable String name, @RequestParam int coreCount) {
        return service.findByNameAndProcessorCoreCount(name, coreCount);
    }

    @GetMapping("/find_by_name_and_price/{name}")
    public List<Notebook> findByNameAndPriceLessThanEqual(@PathVariable String name, @RequestParam Double price) {
        return service.findByNameAndPriceLessThanEqual(name, price);
    }

    @GetMapping("/find_by_pr_name_and_diagonal/{name}")
    public List<Notebook> findByProcessorNameAndDiagonalGreaterThan(@PathVariable String name, @RequestParam double diagonal) {
        return service.findByProcessorNameAndScreenDiagonalGreaterThan(name, diagonal);
    }

    @GetMapping("/find_by_name_and_storage/{name}")
    public List<Notebook> findByNameAndStorageGreaterThan(@PathVariable String name, @RequestParam int storage) {
        return service.findByNameAndStorageGreaterThan(name, storage);
    }

    @GetMapping("/find_by_year_and_frequency/{date}")
    public List<Notebook> findByYearOfIssueGreaterThanEqualAndProcessorFrequencyGreaterThan(@PathVariable String date, @RequestParam Integer frequency) {
        return service.findByYearOfIssueGreaterThanEqualAndProcessorFrequencyGreaterThan(date, frequency);
    }

    @GetMapping("/find_by_gr_name_and_pr_version/{name}")
    public List<Notebook> findByGraphicsNameAndProcessorVersion(@PathVariable String name, @RequestParam String version) {
        return service.findByGraphicsNameAndProcessorVersion(name, version);
    }

    @GetMapping("/find_by_name_and_type_name/{name}")
    public List<Notebook> findByNameAndTypeName(@PathVariable String name, @RequestParam String typeName) {
        return service.findByNameAndTypeName(name, typeName);
    }
    @GetMapping("/find_by_version_and_price/{version}")
    public List<Notebook> findByProcessorVersionAndPriceLessThanEqual(@PathVariable String version, @RequestParam double price) {
        return service.findByProcessorVersionAndPriceLessThanEqual(version, price);
    }
    @GetMapping("/find_by_name_and_frequency/{name}")
    public List<Notebook> findByNameAndProcessorFrequencyGreaterThan(@PathVariable String name,@RequestParam int frequency) {
        return service.findByNameAndProcessorFrequencyGreaterThan(name, frequency);
    }
    @GetMapping("/find_by_coreCount_and_diagonal/{coreCount}")
    public List<Notebook> findByProcessorCoreCountAndScreenDiagonalGreaterThan(@PathVariable int coreCount,@RequestParam double diagonal) {
        return service.findByProcessorCoreCountAndScreenDiagonalGreaterThan(coreCount, diagonal);
    }
    @GetMapping("/find_by_version_and_storage/{version}")
    public List<Notebook> findByProcessorVersionAndGraphicsStorageGreaterThan(@PathVariable String version,@RequestParam int storage) {
        return service.findByProcessorVersionAndGraphicsStorageGreaterThan(version, storage);
    }
}