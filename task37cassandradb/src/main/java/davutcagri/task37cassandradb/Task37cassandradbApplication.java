package davutcagri.task37cassandradb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Task37cassandradbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Task37cassandradbApplication.class, args);
	}

}
