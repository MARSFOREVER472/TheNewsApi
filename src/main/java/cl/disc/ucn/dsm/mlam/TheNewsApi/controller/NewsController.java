package cl.disc.ucn.dsm.mlam.TheNewsApi.controller;

import cl.disc.ucn.dsm.mlam.TheNewsApi.NewsRepository;
import cl.disc.ucn.dsm.mlam.TheNewsApi.model.Article;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * The news controller.
 */
@RestController
public class NewsController {
    private NewsRepository repository;

    /**
     * Constructor.
     *
     * @param repository
     */
    public NewsController(NewsRepository repository) {
        this.repository = repository;
    }

    /**
     * Return a list of articles.
     *
     * @return
     */
    @GetMapping("/v1/news")
    public List<Article> getAll() {

        return this.repository.findAll();
    }

    /**
     * Return the article by id.
     *
     * @param id
     * @return
     */
    @GetMapping("/v1/news/{id}")
    public Article getArticle(@PathVariable Long id) {
        return this.repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found 404"));
    }
}
