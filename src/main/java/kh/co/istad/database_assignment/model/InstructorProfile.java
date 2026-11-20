package kh.co.istad.database_assignment.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "instructor_profiles")
@Getter
@Setter
@NoArgsConstructor
public class InstructorProfile {

    @Id
    @Column(name = "user_id", length = 255, nullable = false)
    private String userId;

    @Column(nullable = false)
    private String biography;

    @Column(nullable = false)
    private String facebookLink;

    @Column(nullable = false , unique = true)
    private String githubLink;

    @Column(nullable = false)
    private String jobTitle;

    @Column(nullable = false , length = 15)
    private String phoneNumber;

    @OneToMany(mappedBy = "instructor")
    private List<Course> courses = new ArrayList<>();
}
