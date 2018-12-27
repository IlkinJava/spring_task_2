package spring_task_2.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import spring_task_2.exception.WrongData;
import spring_task_2.model.Notebook;
import spring_task_2.repository.NotebookRepository;
import spring_task_2.service.NotebookService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class NotebookServiceImpl implements NotebookService {
    private final NotebookRepository repository;

    @Override
    public void createNotebook(Notebook notebook) {
        repository.save(notebook);
    }

    @Override
    public List<Notebook> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Notebook> findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }


    @Override
    public List<Notebook> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Notebook> findByRam(int ram) {
        if (ram <= 0) {
            throw new WrongData("ram can not be negative or 0");
        }
        return repository.findByRam(ram);
    }

    @Override
    public List<Notebook> findByProcessorName(String name) {
        return repository.findByProcessorName(name);
    }

    @Override
    public List<Notebook> findByYearOfIssueAfter(String date) {
        return repository.findByYearOfIssueAfter(date);
    }

    @Override
    public List<Notebook> findByStorageGreaterThan(int storage) {
        if (storage <= 0) {
            throw new WrongData("storage can not be negative or 0");
        }
        return repository.findByStorageGreaterThan(storage);
    }

    @Override
    public List<Notebook> findByScreenDiagonalGreaterThan(double diagonal) {
        if (diagonal <= 0) {
            throw new WrongData("diagonal can not be negative or 0");
        }
        return repository.findByScreenDiagonalGreaterThan(diagonal);
    }

    @Override
    public List<Notebook> findByPriceLessThan(Double price) {
        if (price<=0){
            throw new WrongData("price can not be negative or 0");
        }
        return repository.findByPriceLessThan(price);
    }

    @Override
    public List<Notebook> findByNameAndPriceLessThanEqual(String name, Double price) {
        if (price<=0){
            throw new WrongData("price can not be negative or 0");
        }
        return repository.findByNameAndPriceLessThanEqual(name, price);
    }

    @Override
    public List<Notebook> findByNameAndProcessorCoreCount(String name, int coreCount) {
        if (coreCount<=0){
            throw new WrongData("core count can not be negative or 0");
        }
        return repository.findByNameAndProcessorCoreCount(name, coreCount);
    }

    @Override
    public List<Notebook> findByProcessorNameAndScreenDiagonalGreaterThan(String name, double diagonal) {
        if (diagonal<=0){
            throw new WrongData("diagonal can not be negative or 0");
        }
        return repository.findByProcessorNameAndScreenDiagonalGreaterThan(name, diagonal);
    }

    @Override
    public List<Notebook> findByNameAndStorageGreaterThan(String name, int storage) {
        if (storage<=0){
            throw new WrongData("storage can not be negative or 0");
        }
        return repository.findByNameAndStorageGreaterThan(name, storage);
    }

    @Override
    public List<Notebook> findByYearOfIssueGreaterThanEqualAndProcessorFrequencyGreaterThan(String date, int frequency) {
        if (frequency<=0){
            throw new WrongData("frequency can not be negative or 0");
        }
        return repository.findByYearOfIssueGreaterThanEqualAndProcessorFrequencyGreaterThan(date, frequency);
    }

    @Override
    public List<Notebook> findByGraphicsNameAndProcessorVersion(String name, String version) {
        return repository.findByGraphicsNameAndProcessorVersion(name, version);
    }

    @Override
    public List<Notebook> findByNameAndTypeName(String notebookName, String typeName) {
        return repository.findByNameAndTypeName(notebookName, typeName);
    }

    @Override
    public List<Notebook> findByProcessorVersionAndPriceLessThanEqual(String version, double price) {
        if (price<=0){
            throw new WrongData("price can not be negative or 0");
        }
        return repository.findByProcessorVersionAndPriceLessThanEqual(version, price);
    }

    @Override
    public List<Notebook> findByNameAndProcessorFrequencyGreaterThan(String name, int frequency) {
        if (frequency<=0){
            throw new WrongData("frequency can not be negative or 0");
        }
        return repository.findByNameAndProcessorFrequencyGreaterThan(name, frequency);
    }

    @Override
    public List<Notebook> findByProcessorCoreCountAndScreenDiagonalGreaterThan(int coreCount, double diagonal) {
        if (coreCount<=0 || diagonal<=0){
            throw new WrongData("data can not be negative or 0");
        }
        return repository.findByProcessorCoreCountAndScreenDiagonalGreaterThan(coreCount, diagonal);
    }

    @Override
    public List<Notebook> findByProcessorVersionAndGraphicsStorageGreaterThan(String version, int storage) {
        if (storage<=0){
            throw new WrongData("storage can not be negative or 0");
        }
        return repository.findByProcessorVersionAndGraphicsStorageGreaterThan(version, storage);
    }
}
