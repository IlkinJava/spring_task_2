package spring_task_2.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "notebooks")
public class Notebook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type_id")
    @JsonManagedReference
    private Type type;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "processor_id")
    @JsonManagedReference
    private Processor processor;
    private String yearOfIssue;
    private int ram;
    private int storage;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "screen_id")
    @JsonManagedReference
    private Screen screen;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "graphics_id")
    @JsonManagedReference
    private Graphics graphics;
    private Double price;
}
