package com.gardolf.hudlmavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	protected WebDriver driver;
	
	public WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		return new ChromeDriver();
	}
	
	@BeforeMethod
	public void setup() {
        driver = getChromeDriver(); // launches the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); // Path to the chrome driver
        driver.manage().window().maximize(); // maximizes the browser window
		driver.get("https://www.hudl.com/"); // navigates to the site
		System.out.println("Site title: " + driver.getTitle());
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit(); // closes the browser after the tests have completed
	}
	
}
