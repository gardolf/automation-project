package com.gardolf.hudlmavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage{

	@FindBy(xpath = "//a[@data-qa-id='login']")
	WebElement homeLoginButton;
	
	@FindBy(xpath = "//button[@data-qa-id='login-btn']")
	WebElement loginButton;
	
	@FindBy(id = "email")
	WebElement emailField;
	
	@FindBy(id = "password")
	WebElement passwordField;
	
	@FindBy(xpath = "//div/p[@class='uni-text']")
	WebElement errorMessage;
	
	@FindBy(className = "styles_questionMarkContainer_10mxHNOMojCyG6bxLH9qo9")
	WebElement questionMarkIcon;
	
	@FindBy(className ="hui-globaluseritem__display-name")
	WebElement landingPageDisplayName;
	
	// The Need Help link in the error display if user gets login error
	@FindBy(xpath = "//div/p/a[@class='uni-link uni-link--default uni-margin--quarter--left']")
	WebElement needHelpLinkErrorDisplay;
	
	// The Need Help link before user clicks the Login button
	@FindBy(xpath = "//a[@data-qa-id='need-help-link']")
	WebElement needHelpLink;
	
	@FindBy(xpath = "//h2[@data-qa-id='login-help-headline']")
	WebElement loginHelpHeader;
	
	@FindBy(className ="styles_backIconContainer_MhkioW9m8rx70X7CIGuws")
	WebElement backButton;
	
	@FindBy(xpath = "//div/a[@class='uni-link uni-link--default styles_signUpLink_1CPc8TbK9yDyBdJiSpUOZV']")
	WebElement signUpLink;
	
	@FindBy(xpath = "//button[@data-qa-id='log-in-with-organization-btn']")
	WebElement logInWithAnOrganizationButton;
	
	@FindBy(xpath = "//h2[@class='uni-headline uni-headline--2 uni-padding--one _3ZchjyyL4lRtJSkmDHSLIy']")
	WebElement logIntoHudlWithYourOrganizationHeader;
	
	Actions actions = new Actions(driver);
	
	public loginPage(WebDriver driver) {
		super(driver);
	}	
	
	public void clickHomeLoginButton() {
		findElement(homeLoginButton);
		clickElement(homeLoginButton);
	}
	
	public void clickLoginButton() {
		findElement(loginButton);
		clickElement(loginButton);
	}
	
	public void clickEmailField () {
		findElement(emailField);
		clickElement(emailField);
	}
	
	public void hoverOverEmailField() {
		actions.moveToElement(emailField);
	}
	
	public void clickPasswordField () {
		findElement(passwordField);
		clickElement(passwordField);
	}
	
	public void typeEmail (String email) {
		clickEmailField();
		emailField.sendKeys(email);
	}
	
	public void typePassword (String password) {
		clickPasswordField();
		passwordField.sendKeys(password);
	}
	
	public String getLoginErrorMessage() {
		return findElement(errorMessage).getText();
	}
	
	public boolean questionMarkIconIsVisible() {
		return findElement(questionMarkIcon).isDisplayed();
	}
	
	public boolean landingPageIsVisible() {
		return findElement(landingPageDisplayName).isDisplayed();
	}
	
	public void clickNeedHelpErrorDisplay () {
		findElement(needHelpLinkErrorDisplay);
		clickElement(needHelpLinkErrorDisplay);
	}
	
	public void clickNeedHelp() {
		findElement(needHelpLink);
		clickElement(needHelpLink);
	}
	
	public boolean loginHelpIsVisible() {
		return findElement(loginHelpHeader).isDisplayed();
	}
	
	public void clickBackButton() {
		findElement(backButton);
		clickElement(backButton);
	}
	
	public void clickSignUpLink() {
		findElement(signUpLink);
		clickElement(signUpLink);
	}
	
	public void clickLogInWithAnOrganizationButton() {
		findElement(logInWithAnOrganizationButton);
		clickElement(logInWithAnOrganizationButton);
	}
	
	public boolean logIntoHudlWithYourOrgIsVisible() {
		return findElement(logIntoHudlWithYourOrganizationHeader).isDisplayed();
	}
}
