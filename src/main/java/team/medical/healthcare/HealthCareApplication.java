package team.medical.healthcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
public class HealthCareApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCareApplication.class, args);
	}
}
