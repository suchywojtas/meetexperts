package pl.innovestments.meetexperts.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "pl.innovestments")
@EntityScan(basePackages = "pl.innovestments")
public class MeetExpertsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeetExpertsApplication.class, args);
	}
}
