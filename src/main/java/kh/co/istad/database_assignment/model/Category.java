package kh.co.istad.database_assignment.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categories")
@Getter
@Setter
@NoArgsConstructor
public class Category{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String icon;

    @Column( nullable = false)
    private Boolean isDeleted = false;

    @Column(unique = true, length = 50, nullable = false)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Course> courses = new ArrayList<>();
}
