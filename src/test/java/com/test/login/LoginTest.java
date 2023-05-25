package com.test.login;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/test/login.feature"},
		glue = {"com.test.login", "com.core"},
		monochrome = true,
		plugin = {"pretty"},
		dryRun = false)
public class LoginTest {

}
