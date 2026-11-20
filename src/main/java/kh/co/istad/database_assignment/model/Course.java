package kh.co.istad.database_assignment.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false , unique = true)
    private Integer countRating;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false , length = 150)
    private String description;

    @Column(nullable = false)
    private Float discountPercent;

    @Column(nullable = false)
    private Boolean isDeleted;

    @Column(nullable = false)
    private Boolean isPublished;

    @Column(nullable = false , unique = true)
    private String keyword;

    @Column(nullable = false)
    private String level;

    @Column(precision = 38, scale = 2 , nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private String slug;


    @Column(nullable = false)
    private Float starRating;

    @Column(nullable = false)
    private String thumbnail;

    @Column(nullable = false , unique = false)
    private String title;

    @Column(nullable = false)
    private Float totalHours;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_id")
    private InstructorProfile instructor;

    @OneToMany(mappedBy = "course")
    private List<Video> videos = new ArrayList<>();

    @OneToMany(mappedBy = "course")
    private List<Enrollment> enrollments = new ArrayList<>();
}
