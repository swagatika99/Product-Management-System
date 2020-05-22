package com.capgemini.drinkanddelight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableTransactionManagement
//@EnableEurekaClient
public class ProductordermsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductordermsApplication.class, args);
	}

	
}
