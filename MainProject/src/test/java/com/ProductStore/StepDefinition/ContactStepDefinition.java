package com.ProductStore.StepDefinition;

import com.ProductStore.PagesObject.ContactPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactStepDefinition {
	//To contact to customer care
	ContactPage contact=new ContactPage ();
	@Given("^user launched the Chrome Browser$")
	public void user_launched_the_Chrome_Browser() throws Throwable {
	    contact.launchBrowser("chrome");
	}
	@When("^user opens Product store  Homepage$")
	public void user_opens_Product_store_Homepage() throws Throwable {
	    contact.productStoreHomepage();
	}

	@Then("^user clicks contact$")
	public void user_clicks_contact() throws Throwable {
	   contact.contact();
	}

	@Then("^user enters contact details$")
	public void user_enters_contact_details() throws Throwable {
	    contact.contactDetails("mmmbady@gmail.com", "sheeba", "hi");
	}

	@Then("^user clicks send message$")
	public void user_clicks_send_message() throws Throwable {
	  contact.sendMessage();
	  contact.quit();
	}

}
