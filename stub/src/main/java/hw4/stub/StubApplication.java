package hw4.stub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StubApplication {

	public static void main(String[] args) {
		SpringApplication.run(StubApplication.class, args);
	}

	@PostMapping("/greeting")
	public Response Greeting(@RequestBody User user) {
		var response = new Response();
		response.name = user.firstName;
		return response;
	}
}

