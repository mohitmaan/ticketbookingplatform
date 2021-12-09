package com.xyz.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = { "com.xyz" })
@EnableJpaRepositories("com.xyz.ticket.booking")
@EntityScan("com.xyz.ticket.booking")
@EnableSwagger2
public class TicketBookingPlatformApplication {

	public static void main(String[] args) {

		SpringApplication.run(TicketBookingPlatformApplication.class, args);
	}

}
