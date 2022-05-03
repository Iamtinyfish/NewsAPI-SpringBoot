package com.news.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    @NotBlank
    private String name;

    @Column(nullable = false, unique = true)
    @NotBlank
    private String slug;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private Set<Article> articles = new HashSet<>();
}
