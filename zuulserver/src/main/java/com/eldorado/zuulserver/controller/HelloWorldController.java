package com.eldorado.zuulserver.controller;

import org.springframework.web.bind.annotation.RestController;

import com.eldorado.zuulserver.config.LoggingConfig;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping; 

@RestController
public class HelloWorldController {
	Logger log = LoggingConfig.getLog();
	@GetMapping("/helloworld")
    String helloWorld() {
		log.info("Hello World -> Zuul Microservice");
		return "Hello World -> Zuul Microservice";
	}
}
