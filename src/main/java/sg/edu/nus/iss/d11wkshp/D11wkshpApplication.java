package sg.edu.nus.iss.d11wkshp;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class D11wkshpApplication {

	public static void main(String[] args) {
		//SpringApplication.run(D11wkshpApplication.class, args);
		String port = "3000";
		SpringApplication app = new SpringApplication(D11wkshpApplication.class);

		ApplicationArguments cliOpts = new DefaultApplicationArguments(args);
		if (cliOpts.containsOption("port")) {
			port = cliOpts.getOptionValues("port").get(0);
		}
		app.setDefaultProperties (Collections.singletonMap("server.port", port));
		app.run(args);

	}

}
