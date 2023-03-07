package com.testeUsuario.springbooth2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan({"com.testeUsuario.Controller","com.testeUsuario.service"})
@EntityScan("com.testeUsuario.entity")
@EnableJpaRepositories("com.testeUsuario.repository")
@SpringBootApplication

public class SprintBootH2Application {
	public static void main(String[] args) {
		SpringApplication.run(SprintBootH2Application.class, args);
	}
}
