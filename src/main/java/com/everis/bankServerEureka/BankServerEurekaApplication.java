package com.everis.bankServerEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BankServerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankServerEurekaApplication.class, args);
	}

}
