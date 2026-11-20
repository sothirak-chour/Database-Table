package kh.co.istad.database_assignment.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student_profiles")
@Getter
@Setter
@NoArgsConstructor
public class StudentProfile {

    @Id
    @Column(name = "user_id", length = 255, nullable = false)
    private String userId;

    @Column(nullable = false)
    private String biography;

    @Column(nullable = false)
    private String facebookLink;

    @Column(nullable = false)
    private String githubLink;

    private String major;

    @Column(nullable = false , length = 15)
    private String phoneNumber;

    @Column(nullable = false , length = 90)
    private String university;

    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollments = new ArrayList<>();
}