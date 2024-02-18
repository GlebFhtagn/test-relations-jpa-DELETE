package com.example.testrelationsjpadelete.repositories;

import com.example.testrelationsjpadelete.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
