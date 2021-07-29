package com.amar.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringGatwayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGatwayServiceApplication.class, args);
	}

}
