package com.example.rakesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExamplesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(ExamplesApplication.class, args);
	//changes
		run.close();
	}

}
