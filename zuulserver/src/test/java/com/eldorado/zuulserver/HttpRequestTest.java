package com.eldorado.zuulserver;

import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {
	
	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void searchServiceShouldReturnDefaultMessage() throws Exception {
		
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/search-service/helloworld",
				String.class)).contains("Hello World -> Search Microservice");
	}

	@Test
	public void userServiceShouldReturnDefaultMessage() throws Exception {
		
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/user-service/helloworld",
				String.class)).contains("Hello World -> User Microservice");
	}
	
	@Test
	public void productServiceShouldReturnDefaultMessage() throws Exception {
		
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/product-service/helloworld",
				String.class)).contains("Hello World -> Product Microservice");
	}
	
	

}
