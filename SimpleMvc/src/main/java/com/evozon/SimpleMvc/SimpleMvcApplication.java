package com.evozon.SimpleMvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SimpleMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleMvcApplication.class, args);
	}
}
