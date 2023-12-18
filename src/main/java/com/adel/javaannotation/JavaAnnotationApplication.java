package com.adel.javaannotation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaAnnotationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JavaAnnotationApplication.class, args);
	}


	@Override
	public void run(final String... args) throws Exception {
		final Car honda = new Car();
		final CarService carService = new CarService();
		carService.processCar(honda);
	}
}
