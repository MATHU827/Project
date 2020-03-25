package com.ProductStore.TestRunner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/ProductStore.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report","com.cucumber.listener.ExtentCucumberFormatter:reports/report.html"},
		tags = {"@Tc01_SignUp,@Tc02_Login,@Tc03_Add_to_cart,@Tc04_Contact,@Tc05_clickproduct,@Tc06_To_check_phone_number"},
		glue = {"com.ProductStore.StepDefinition"},
		monochrome = true
		)
public class ProductStoreTestRunner {
	@AfterClass
	  public static void extendReport() {
	      Reporter.loadXMLConfig("src/test/resources/extent-config.xml");
	      Reporter.setSystemInfo("user", System.getProperty("user.name"));
	      Reporter.setSystemInfo("os", "Windows");
	      Reporter.setTestRunnerOutput("Sample test runner output message");
	}

}
