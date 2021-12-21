package cl.disc.ucn.dsm.mlam.TheNewsApi.service;

import java.util.ArrayList;
import java.util.List;

/**
 * The News Api Result.
 */
public class NewsApiResult {

    public String status;
    public long totalResults;
    public List<NewsApiArticle> articles = new ArrayList<NewsApiArticle>();
}
