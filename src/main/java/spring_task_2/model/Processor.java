package spring_task_2.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "processors")
public class Processor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String version;
    private int coreCount;
    private int frequency;
    @OneToOne(mappedBy = "processor")
    @JsonBackReference
    private Notebook notebook;

}
