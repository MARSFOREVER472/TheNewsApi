package cl.disc.ucn.dsm.mlam.TheNewsApi.service;

/**
 * The News Api Article.
 */
public class NewsApiArticle {

    public Source source;
    public String author;
    public String title;
    public String description;
    public String url;
    public String urlToImage;
    public String publishedAt;
    public String content;

    /**
     * The source of the article.
     */
    public class Source {
        public String id;
        public String name;


    }
}
