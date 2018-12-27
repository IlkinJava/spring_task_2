package spring_task_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_task_2.model.Notebook;

import java.util.List;

public interface NotebookRepository extends JpaRepository<Notebook, Integer> {

    List<Notebook> findByName(String name);

    List<Notebook> findByRam(int ram);

    List<Notebook> findByProcessorName(String name);

    List<Notebook> findByYearOfIssueAfter(String date);

    List<Notebook> findByStorageGreaterThan(int storage);

    List<Notebook> findByScreenDiagonalGreaterThan(double diagonal);

    List<Notebook> findByPriceLessThan(Double price);

    List<Notebook> findByNameAndPriceLessThanEqual(String name, Double price);

    List<Notebook> findByNameAndProcessorCoreCount(String name, int coreCount);

    List<Notebook> findByProcessorNameAndScreenDiagonalGreaterThan(String name, double diagonal);

    List<Notebook> findByNameAndStorageGreaterThan(String name, int storage);

    List<Notebook> findByYearOfIssueGreaterThanEqualAndProcessorFrequencyGreaterThan(String date, int frequency);

    List<Notebook> findByGraphicsNameAndProcessorVersion(String name, String version);

    List<Notebook> findByNameAndTypeName(String notebookName, String typeName);

    List<Notebook> findByProcessorVersionAndPriceLessThanEqual(String version, double price);

    List<Notebook> findByNameAndProcessorFrequencyGreaterThan(String name, int frequency);

    List<Notebook> findByProcessorCoreCountAndScreenDiagonalGreaterThan(int coreCount,double diagonal);

    List<Notebook> findByProcessorVersionAndGraphicsStorageGreaterThan(String version,int storage);
}
