package com.page;

import static com.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.core.GlobalProperties;

public class LoginPage {
	
	public LoginPage open() {
		getDriver().get(GlobalProperties.getProperty("selenium.url"));	
		return this;
	}
	
	public LoginPage inputUser(String user) {
		WebElement tfUser = getDriver().findElement(By.name("username"));
		tfUser.sendKeys(user);
		return this;
	}
	
	public LoginPage inputPass(String pass) {
		WebElement tfPass = getDriver().findElement(By.name("password"));
		tfPass.sendKeys(pass);
		return this;
	}
	
	public MainPage clickLogin() {
		WebElement btnLogin = getDriver().findElement(By.xpath("//button[@type='submit']"));
		btnLogin.click();
		return new MainPage();
	}
	
	public MainPage loginDone(String user, String pass) {
		open();
		inputUser(user);
		inputPass(pass);
		return clickLogin();		
	}

}
