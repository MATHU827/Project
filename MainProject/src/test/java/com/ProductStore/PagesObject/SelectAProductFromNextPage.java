package com.ProductStore.PagesObject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SelectAProductFromNextPage {
	WebDriver driver;
	//Locator to select a product from next page
		By next=By.id("next2");
		By product=By.linkText("Apple monitor 24");
	//To launch the browser
		public void launchBrowser(String browser) { 
			try {
				if(browser.equalsIgnoreCase("chrome"))
				{
					System.setProperty("webdriver.chrome.driver","src//test//resources//Driver//chromedriver.exe");
					driver = new ChromeDriver();
				}
				else if(browser.equalsIgnoreCase("firefox"))
				{
					System.setProperty("webdriver.chrome.driver","src//test//resources//Driver//chromedriver.exe");
					driver = new FirefoxDriver();
				}
				else if(browser.equalsIgnoreCase("internetexplorer"))
				{
					System.setProperty("webdriver.chrome.driver","src//test//resources//Driver//chromedriver.exe");
					driver=new InternetExplorerDriver();
				}
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			}
			catch(WebDriverException e) 
			{
				System.out.println("Browser cannot be launched");
			}
		}
	//To launch product store homepage
		public void productStoreHomepage() 
		{
			driver.get("https://www.demoblaze.com/");
			System.out.println(driver.getTitle());
		}
	//To navigate to next page
		public void clickNext() throws InterruptedException
		{
			Thread.sleep(3000);
			driver.findElement(next).click();
		}
	//To select a product from next page 
		public void selectProduct() throws InterruptedException, Throwable
		{
			Thread.sleep(3000);
			driver.findElement(product).click();
			Thread.sleep(4000);
	//To take screenshot 
	        TakesScreenshot ts=(TakesScreenshot)driver;
			File ff=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ff,new File("src\\test\\resources\\Screenshot\\product.png"));
		}
    //To exit from browser
		public void quit()
		{
			driver.close();
		}
	}
