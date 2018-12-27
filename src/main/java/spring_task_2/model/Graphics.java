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
@Table(name = "graphics")
public class Graphics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String version;
    private int storage;
    @OneToOne(mappedBy = "graphics")
    @JsonBackReference
    private Notebook notebook;

}
