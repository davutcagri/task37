package davutcagri.task37mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Task37mongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Task37mongodbApplication.class, args);
	}

}
