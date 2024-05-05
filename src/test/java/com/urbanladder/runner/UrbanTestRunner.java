package com.urbanladder.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		dryRun = !true,//true, Cucumber will only check that every step in your feature files has a corresponding step definition and won’t actually execute the tests. When set to false, Cucumber will execute your tests as normal.
		features = {"src/test/resources/features"},//lets Cucumber know the location of your feature files. Feature files are where your BDD scenarios are written. 
		glue = "com.urbanladder.definitions", //specify the location of your step definition files. Step definition files contain the code that should be executed for each step in your scenarios
		plugin = {"html:Reports/myreport.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},// specify different reporting options for your tests
		monochrome = true, //avoid junk character
		publish = true // send to clients and they will view reports
		)
//bridge between TestNG and Cucumber.reads your CucumberOptions and executes the appropriate Cucumber scenarios. provides hooks into the TestNG lifecycle, allowing Cucumber to generate reports and other artifacts in the same way as for a regular TestNG test.
public class UrbanTestRunner extends AbstractTestNGCucumberTests {

}
