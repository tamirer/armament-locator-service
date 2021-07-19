package iaf.blueflame.armamentlocatorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("iaf.blueflame.entities")
@EnableJpaRepositories("iaf.blueflame.repositories")
public class ArmamentLocatorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArmamentLocatorServiceApplication.class, args);
	}

}
