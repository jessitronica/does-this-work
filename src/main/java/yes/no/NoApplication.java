package yes.no;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@ComponentScan
@SpringBootApplication
public class NoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoApplication.class, args);
	}
}
