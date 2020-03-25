package com.ProductStore.StepDefinition;

import org.junit.Assert;

import com.ProductStore.PagesObject.CheckForPhoneNumberPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckForPhoneNumberStepDefinition {
	CheckForPhoneNumberPage phonenumber=new CheckForPhoneNumberPage();
	@Given("^The user launched the Chrome Browser$")
	public void the_user_launched_the_Chrome_Browser() throws Throwable {
		phonenumber.launchBrowser("chrome");
	    }

	@When("^The user opens Product Store  Homepage$")
	public void the_user_opens_Product_Store_Homepage() throws Throwable {
		phonenumber.productStore();
	    }

	@When("^User opens product Store homepage$")
	public void user_opens_product_Store_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		phonenumber.launchBrowser("chrome");
		phonenumber.productStore();
	}

	@Then("^User checks if the number is valid$")
	public void user_checks_if_the_number_is_valid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String ab=phonenumber.check();
		String phone_number="440 23456";
		Assert.assertEquals(phone_number,ab);
		System.out.println("Invalid");
		Thread.sleep(3000);
		phonenumber.exitApplication();
	}

}
