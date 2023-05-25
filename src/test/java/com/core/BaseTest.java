package com.core;

import cucumber.api.java.After;

public class BaseTest {
		 
	
	@After
	public void tearDown() {
		DriverFactory.killDriver();
	}

}
