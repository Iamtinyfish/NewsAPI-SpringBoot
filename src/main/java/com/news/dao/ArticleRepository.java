package com.news.dao;

import com.news.entity.Article;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "article", path = "article")
public interface ArticleRepository extends PagingAndSortingRepository<Article, Long> {
    List<Article> searchByAuthor(String author);
    List<Article> searchByTitle(String title);
}
