package com.ProductStore.StepDefinition;

import com.ProductStore.PagesObject.SelectAProductFromNextPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectAProdcutFromNextStepDenition {
	//To select a product from next page
	SelectAProductFromNextPage product=new SelectAProductFromNextPage();
	@Given("^user launched the Chrome_Browser$")
	public void user_launched_the_Chrome_Browser() throws Throwable {
	   product.launchBrowser("chrome");
	}

	@When("^user opens Product Store  Homepage$")
	public void user_opens_Product_Store_Homepage() throws Throwable {
	   product.productStoreHomepage();
	}

	@Then("^user clicks next$")
	public void user_clicks_next() throws Throwable {
	    product.clickNext();
	}

	@Then("^user selects product$")
	public void user_selects_product() throws Throwable {
	   product.selectProduct();
	   product.quit();
	}
}
