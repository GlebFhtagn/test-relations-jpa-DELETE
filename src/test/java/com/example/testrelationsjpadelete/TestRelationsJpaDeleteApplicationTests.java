package com.example.testrelationsjpadelete;

import com.example.testrelationsjpadelete.entities.Article;
import com.example.testrelationsjpadelete.entities.Pot;
import com.example.testrelationsjpadelete.repositories.ArticleRepository;
import com.example.testrelationsjpadelete.repositories.PotRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestRelationsJpaDeleteApplicationTests {

    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    PotRepository potRepository;

    @Test
    void relationsTest() {

        Article article1 = new Article(){{
            setName("FFFFF");
        }};

        Pot pot1 = new Pot(){{
            setArticle(article1);
            setVolume(15);
        }};


        articleRepository.save(article1);
        potRepository.save(pot1);

        var resArticle = articleRepository.findById(article1.getId()).orElse(null);
        var resPot = potRepository.findById(pot1.getId()).orElse(null);

        Assertions.assertEquals(article1, resArticle);
        Assertions.assertEquals(pot1, resPot);
    }

}
