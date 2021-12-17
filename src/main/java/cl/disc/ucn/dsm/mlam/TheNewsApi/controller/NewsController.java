package cl.disc.ucn.dsm.mlam.TheNewsApi.controller;

import cl.disc.ucn.dsm.mlam.TheNewsApi.model.Article;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * The news controller.
 */
@RestController
public class NewsController {

    /**
     * Return a list of articles.
     * @return
     */
    @GetMapping("/v1/news")
    public List<Article>getAll(){

        return new ArrayList<Article>();
    }
}
