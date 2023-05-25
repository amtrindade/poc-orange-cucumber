package com.core;

import static com.core.DriverFactory.getDriver;

public class BasePage {

	public String getTitle() {
		return getDriver().getTitle();
	}
	
}
