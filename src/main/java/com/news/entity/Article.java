package com.news.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "article")
public class Article {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    @NotBlank
    private String title;

    @NotBlank
    private String author;

    private String image;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonIgnoreProperties("articles")
    private Category category;

    @NotBlank
    @Lob
    private String content;

    private LocalDate publishAt;

    @PrePersist
    private void publishAt() {
        if (publishAt == null)
            publishAt = LocalDate.now();
    }
}
