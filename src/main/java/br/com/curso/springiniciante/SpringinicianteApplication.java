package br.com.curso.springiniciante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile("dev")
public class SpringinicianteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringinicianteApplication.class, args);
	}

}
