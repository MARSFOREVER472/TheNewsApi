package cl.disc.ucn.dsm.mlam.TheNewsApi;

import cl.disc.ucn.dsm.mlam.TheNewsApi.service.NewsApiService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TheNewsApiApplication {

	@Autowired
	private NewsRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(TheNewsApiApplication.class, args);
	}

	@Bean
	protected InitializingBean initializeDatabase(){
		return ()->{
			NewsApiService service = new NewsApiService();
			this.repository.saveAll(service.getNews(100));
		};
	}
}
