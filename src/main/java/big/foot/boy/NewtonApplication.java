package big.foot.boy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NewtonApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewtonApplication.class, args);
	}
}
