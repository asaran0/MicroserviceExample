package com.amar.hystricDashbioard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HystricDashbioardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystricDashbioardApplication.class, args);
	}

}
