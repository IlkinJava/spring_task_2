package spring_task_2.service;

import spring_task_2.model.Notebook;

import java.util.List;
import java.util.Optional;

public interface NotebookService {
    void createNotebook(Notebook notebook);

    List<Notebook> getAll();

    Optional<Notebook> findById(int id);

    void delete(int id);

    List<Notebook> findByName(String name);

    List<Notebook> findByRam(int ram);

    List<Notebook> findByProcessorName(String name);

    List<Notebook> findByYearOfIssueAfter(String date);

    List<Notebook> findByStorageGreaterThan(int storage);

    List<Notebook> findByScreenDiagonalGreaterThan(double diagonal);

    List<Notebook> findByPriceLessThan(Double price);

    List<Notebook> findByNameAndPriceLessThanEqual(String name,Double price);

    List<Notebook> findByNameAndProcessorCoreCount(String name, int coreCount);

    List<Notebook> findByProcessorNameAndScreenDiagonalGreaterThan(String name,double diagonal);

    List<Notebook> findByNameAndStorageGreaterThan(String name,int storage);

    List<Notebook> findByYearOfIssueGreaterThanEqualAndProcessorFrequencyGreaterThan(String date,int frequency);

    List<Notebook> findByGraphicsNameAndProcessorVersion(String name,String version);

    List<Notebook> findByNameAndTypeName(String notebookName, String typeName);

    List<Notebook> findByProcessorVersionAndPriceLessThanEqual(String version,double price);

    List<Notebook> findByNameAndProcessorFrequencyGreaterThan(String name, int frequency);

    List<Notebook> findByProcessorCoreCountAndScreenDiagonalGreaterThan(int coreCount,double diagonal);

    List<Notebook> findByProcessorVersionAndGraphicsStorageGreaterThan(String version,int storage);

}
