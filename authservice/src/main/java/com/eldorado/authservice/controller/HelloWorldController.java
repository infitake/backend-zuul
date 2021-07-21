package com.eldorado.authservice.controller;

import org.springframework.web.bind.annotation.RestController;
import com.eldorado.authservice.config.LoggingConfig;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping; 

@RestController
public class HelloWorldController {
	Logger log = LoggingConfig.getLog();
	@GetMapping("/helloworld")
    String helloWorld() {
		log.info("Hello World -> Auth Microservice");
		return "Hello World -> Auth Microservice";
	}
}
