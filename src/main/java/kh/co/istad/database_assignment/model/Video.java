package kh.co.istad.database_assignment.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "videos")
@Getter
@Setter
@NoArgsConstructor
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String duration;

    @Column(nullable = false)
    private Boolean isDeleted;

    @Column(nullable = false)
    private Boolean isPublished;

    @Column(nullable = false)
    private String slug;

    @Column(nullable = false)
    private String thumbnail;

    @Column(nullable = false , unique = true)
    private String title;

    @Column(nullable = false)
    private String youtube;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "video")
    private List<Comment> comments = new ArrayList<>();
}

