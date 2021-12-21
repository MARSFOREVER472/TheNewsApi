package cl.disc.ucn.dsm.mlam.TheNewsApi;

import cl.disc.ucn.dsm.mlam.TheNewsApi.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The repository interface.
 */
@Repository
public interface NewsRepository extends JpaRepository<Article, Long> {


}
