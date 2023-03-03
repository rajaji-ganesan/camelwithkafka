package com.sample.camelkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CamelKafkaStreamApplication  extends SpringBootServletInitializer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CamelKafkaStreamApplication.class, args);
	}   

}
