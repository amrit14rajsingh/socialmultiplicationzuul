package microservices.book.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class SocialmultiplicationzuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialmultiplicationzuulApplication.class, args);
	}

}
