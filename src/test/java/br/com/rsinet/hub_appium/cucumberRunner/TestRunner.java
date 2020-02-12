package br.com.rsinet.hub_appium.cucumberRunner;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = { "br.com.rsinet.hub_appium.stepDefinition" }, plugin = { "pretty",
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" })

public class TestRunner {

	@AfterClass
	public static void writeExtentReport() throws IOException {
		Reporter.loadXMLConfig(new File("Config/extent-config.xml"));

	}
}