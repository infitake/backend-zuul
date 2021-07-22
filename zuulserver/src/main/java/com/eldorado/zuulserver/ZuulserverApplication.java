package com.eldorado.zuulserver;

import org.apache.log4j.Logger;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.eldorado.zuulserver.config.LoggingConfig;
import com.eldorado.zuulserver.filter.PreFilter;


@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class ZuulserverApplication {
	
	public static void main(String[] args) {
		Logger log = LoggingConfig.getLog();
		log.info("Welcome to Zuul microservice");
		SpringApplication.run(ZuulserverApplication.class, args);
	}
	
	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

}
