package com.ProductStore.StepDefinition;

import com.ProductStore.PagesObject.AddToCartPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCartStepDefiniton {
	//To add a product to cart
	 AddToCartPage AddToCart =new  AddToCartPage();
	@Given("^user launched the chrome Browser$")
	public void user_launched_the_chrome_Browser() throws Throwable {
		AddToCart.launchBrowser("chrome");
	}

	@When("^user opens product store  Homepage$")
	public void user_opens_product_store_Homepage() throws Throwable {
		AddToCart.productStore();
	}

	@Then("^user clicks on product and add to cart$")
	public void user_clicks_on_product_and_add_to_cart() throws Throwable {
		AddToCart.cart();
		AddToCart.screenShot("src\\test\\resources\\Screenshot\\Addtocart.png");
		AddToCart.quit();
	}
}
