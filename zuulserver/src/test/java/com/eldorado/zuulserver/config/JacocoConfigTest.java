package com.eldorado.zuulserver.config;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JacocoConfigTest {

	@Test
	public void whenEmptyString_thenAccept() {
		JacocoConfig palindromeTester = new JacocoConfig();
	    assertTrue(palindromeTester.isPalindrome(""));
	}


}
