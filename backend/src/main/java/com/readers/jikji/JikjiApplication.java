package com.readers.jikji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.readers.jikji")
public class JikjiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JikjiApplication.class, args);
	}

}