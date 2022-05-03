package com.news;

import com.news.dao.ArticleRepository;
import com.news.dao.CategoryRepository;
import com.news.entity.Article;
import com.news.entity.Category;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NewsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsApiApplication.class, args);
    }

//    @Bean
//    CommandLineRunner initDatabase(CategoryRepository categoryRepository, ArticleRepository articleRepository) {
//
//        return args -> {
//
//            Category category = categoryRepository.save(
//                    Category.builder()
//                            .name("Thế giới")
//                            .slug("the-gioi")
//                            .build()
//            );
//
//            articleRepository.save(
//                    Article.builder()
//                            .title("Mỹ và Châu Âu quyết chống Nga đến người U Cà cuối cùng")
//                            .author("tinyfish")
//                            .content("lorem sup")
//                            .category(category)
//                            .build()
//            );
//        };
//    }

}
