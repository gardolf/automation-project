package com.gardolf.hudlmavenproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public WebDriver driver;
	private final Duration wait = Duration.ofSeconds(15);
	
	// instantiates elements in all Pages marked with @FindBy
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public void clickElement(WebElement locator) {
		new WebDriverWait(driver, wait).until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	
	public WebElement findElement(WebElement locator) {
		return new WebDriverWait(driver, wait).until(ExpectedConditions.visibilityOf(locator));
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
}
