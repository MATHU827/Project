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

public class ContactPage {
	WebDriver driver;
	//Locators to enter the details to contact to the customer care
	By contact=By.linkText("Contact");
	By email=By.id("recipient-email");
	By contact_name=By.id("recipient-name");
	By contact_message=By.id("message-text");
	By send =By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");
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
	//To launch the homepage
	public void productStoreHomepage() 
	{
		driver.get("https://www.demoblaze.com/");
		System.out.println(driver.getTitle());
	}
	//To click contact button
	public void contact() throws InterruptedException
	{
		driver.findElement(contact).click();
		Thread.sleep(3000);
	}
	//To enter all details to contact
	public void contactDetails(String emailid,String name,String message )
	{
		driver.findElement(email).sendKeys(emailid);
		driver.findElement(contact_name).sendKeys(name);
		driver.findElement(contact_message).sendKeys(message);
	}
	//To click the send button to contact
	public void sendMessage() throws InterruptedException, Throwable
	{
		driver.findElement(send).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)driver;
	    File ff=ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(ff,new File("src\\test\\resources\\Screenshot\\contact.png"));
			 
			
	}
	//To take screenshot 
	public void screenShot(String path) throws IOException, Throwable
	{
        Thread.sleep(4000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File ff=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ff,new File(path));
	}
   //To exit from browser
	public void quit()
	{
		driver.close();
	}

}
