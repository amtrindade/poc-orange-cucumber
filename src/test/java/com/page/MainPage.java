package com.page;

import static com.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage {
	
	public Boolean isEnabledMenuHamurger() {
		WebElement menuHamburger = getDriver().findElement(By.xpath("//i[@class='oxd-icon bi-list oxd-topbar-header-hamburger']"));
		return menuHamburger.isEnabled();
	}

}
