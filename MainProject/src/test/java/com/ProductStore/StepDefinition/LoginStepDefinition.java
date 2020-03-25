package com.ProductStore.StepDefinition;


import com.ProductStore.PagesObject.LoginPage;

import ProductStoreExcelUtility.ProductStoreExcel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	//Login in to ProductStore website
	LoginPage login=new LoginPage();
	ProductStoreExcel excel =new ProductStoreExcel();
	@Given("^user launched the chrome browser$")
	public void user_launched_the_chrome_browser()  {
	   login.launchBrowser("chrome");
	}

	@When("^user opens product store  homepage$")
	public void user_opens_product_store_homepage()  {
	   login.productStore();
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable  {
		    //Valid login
			Thread.sleep(3000);
			login.loginUsernamePassword(excel.excelUsername(1),excel.excelPassword(1));
			Thread.sleep(3000);
			login.logout();
			Thread.sleep(3000);
			login.quit();
			//Invalid login
			int count=excel.row_count();
			for(int i=2;i<=count;i++)
			{
				login.launchBrowser("chrome");
				login.productStore();
				login.loginUsernamePassword(excel.excelUsername(i),excel.excelPassword(i));
				Thread.sleep(3000);
				login.alertHandling();
				if (i==2) {
				login.quit();
			}
	 }
	   
	}
	@Then("^user clicks login$")
	public void user_clicks_login() throws Throwable  {
		 login.quit();
}
}
