package io.humourmind.todocli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication(proxyBeanMethods = false)
@ConfigurationPropertiesScan
public class TodoCliApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoCliApplication.class, args);
	}

}
