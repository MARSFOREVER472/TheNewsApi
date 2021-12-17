package cl.disc.ucn.dsm.mlam.TheNewsApi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Article {

    @Getter
    int id;

    @Getter
    String title;

    @Getter
    String description;

    @Getter
    String author;

    @Getter
    String publishedAt;

    @Getter
    String source;

    @Getter
    String url;

    @Getter
    String imageUrl;

    /**
     * Constructor.
     * @param title
     * @param description
     * @param author
     * @param publishedAt
     * @param source
     * @param url
     * @param imageUrl
     */
    public Article(String title, String description, String author, String publishedAt, String source, String url, String imageUrl) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.publishedAt = publishedAt;
        this.source = source;
        this.url = url;
        this.imageUrl = imageUrl;
    }
}
