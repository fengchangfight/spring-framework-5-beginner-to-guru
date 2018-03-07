package guru.springframework.norris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class JokesAppChuckNorrisApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokesAppChuckNorrisApplication.class, args);
	}
}
