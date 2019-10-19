package org.spaceappschallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"org.spaceappschallenge"})
@SpringBootApplication
public class NuclearInspectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(NuclearInspectorApplication.class, args);
	}

}
