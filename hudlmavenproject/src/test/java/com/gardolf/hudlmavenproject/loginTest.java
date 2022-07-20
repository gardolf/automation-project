package com.gardolf.hudlmavenproject;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginTest extends BaseTest {
	
	loginPage loginPage;
	
	@BeforeMethod
	public void main() {
		loginPage = new loginPage(driver);
	}
	
	@Test(description = "Verifies login works using valid credentials and user makes it to the landing screen.")
	public void successfulLoginTest() {
		loginPage.clickHomeLoginButton();
		loginPage.clickEmailField();
		loginPage.typeEmail("Email here"); 			// Email to use
		loginPage.typePassword("Password here");	// Password to use
		loginPage.clickLoginButton();
		Assert.assertEquals(true, loginPage.landingPageIsVisible(), "Expecting the landing page to be visible if the login is successful.");
	}
	
	@Test(description="Verifies clicking the Log In With An Organization link brings you to that page.")
	public void logInWithAnOrganizationTest() {
		loginPage.clickHomeLoginButton();
		loginPage.clickLogInWithAnOrganizationButton();
		Assert.assertEquals(true, loginPage.logIntoHudlWithYourOrgIsVisible(), "Expecting the Log Into Hudl With Your Org page to be visible.");
	}
	
	@Test(description="Performs an invalid login using an incorrect email and password.")
	public void incorrectCredentialsTest() {
		loginPage.clickHomeLoginButton();
		loginPage.clickEmailField();
		loginPage.typeEmail("invalidEmail");	// Invalid email
		loginPage.typePassword("password");		// Random password
		loginPage.clickLoginButton();
		String actualTitle = loginPage.getLoginErrorMessage();
		String expectedTitle = "We didn't recognize that email and/or password.Need help?";
		Assert.assertEquals(expectedTitle, actualTitle);
		Assert.assertEquals(true, loginPage.questionMarkIconIsVisible(), "Expecting the question mark icon to be visible.");
	}
	
	@Test(description="Verifies clicking the Sign Up link goes to the Sign Up page.")
	public void signUpLinkTest() {
		loginPage.clickHomeLoginButton();
		loginPage.clickSignUpLink();
		String expectedUrl = "https://www.hudl.com/register/signup";
		Assert.assertEquals(expectedUrl, loginPage.getCurrentUrl());
	}
	
	@Test(description="Verifies the Need Help link works on the error display and below the Login button.")
	public void needHelpLinkTest() {
		loginPage.clickHomeLoginButton();
		loginPage.clickEmailField();
		loginPage.clickLoginButton();
		loginPage.clickNeedHelpErrorDisplay();
		Assert.assertEquals(true, loginPage.loginHelpIsVisible(), "Expecting the Login Help page to be visible after clicking Need Help on the Error Display.");
		loginPage.clickBackButton();
		loginPage.clickNeedHelp();
		Assert.assertEquals(true, loginPage.loginHelpIsVisible(), "Expecting the Login Help page to be visible after clicking Need Help below the Login button.");
	}
	
}
