package iaf.blueflame.armamentlocatorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("Entities")
public class ArmamentLocatorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArmamentLocatorServiceApplication.class, args);
	}

}
