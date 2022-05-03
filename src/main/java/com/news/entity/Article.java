package com.news.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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

    @ManyToOne
    @JoinColumn(name = "category_id")
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
