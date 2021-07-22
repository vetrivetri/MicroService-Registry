package com.microservice.demo.microservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer
public class MicroserviceApplication {


	public static void main(String[] args) {

		Logger logger = LoggerFactory.getLogger(MicroserviceApplication.class);
		logger.info("This is Info Log");
		logger.debug("This is Debug Log");
		logger.trace("This is Trace Log");
		logger.warn("This is warn log");
		SpringApplication.run(MicroserviceApplication.class, args);
	}

}
