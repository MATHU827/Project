package com.ProductStore.StepDefinition;

import com.ProductStore.PagesObject.SignUpPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpStepDefinition {
	//To sign up 
	SignUpPage signup=new SignUpPage();
	@Given("^the user launched the chrome browser$")
	public void the_user_launched_the_chrome_browser() throws Throwable {
	    signup.launchBrowser("chrome");
	}

	@When("^the user opens product store  homepage$")
	public void the_user_opens_product_store_homepage() throws Throwable {
	    signup.productStoreHomepage();
	}

	@Then("^the user enters username and password$")
	public void the_user_enters_username_and_password() throws Throwable {
	 signup.usernamePassword();
	}

	@Then("^the user clicks signup$")
	public void the_user_clicks_signup() throws Throwable {
	  signup.signUp();
	  }
    @Then("^the user close the application$")
	public void the_user_close_the_application() throws Throwable {
		  signup.quit();
	}



}
