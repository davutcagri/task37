package davutcagri.task37mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Task37mysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(Task37mysqlApplication.class, args);
	}

}
