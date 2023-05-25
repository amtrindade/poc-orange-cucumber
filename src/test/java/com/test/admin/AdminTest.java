package com.test.admin;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/test/admin.feature"},
		glue = {"com.test.admin", "com.core"},
		monochrome = true,
		plugin = {"pretty"},
		dryRun = false)

public class AdminTest {

}
