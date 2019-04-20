package com.walgreens.controller;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.walgreens.model.LoginPageModel;
import com.walgreens.pageBase.PageBase;
import com.walgreens.utils.DriverFactory;



public class LoginPageController extends PageBase {

	protected WebDriver driver = null;

	public LoginPageController(WebDriver driver) {
		this.driver = driver;
	}

	public void typeInUsername(String userName) {

		WebElement username = driver.findElement(LoginPageModel.getUsernamelink());
		username.clear();
		username.sendKeys(userName);
		
		WebElement button = driver.findElement(LoginPageModel.getClickButton());
		button.click();
		

	}

	public void verifyLoginPageTitle() {

		String title = DriverFactory.getInstance().getDriver().getTitle();
		assertThat(title, startsWith("Sign In or Register to Get Started Using Walgreens.com | Walgreens"));
	}

	public void typePasswordText(String Password) {

		WebElement pass = driver.findElement(LoginPageModel.getPasswordText());
		pass.clear();
		pass.sendKeys(Password);
	}

	public void clickSignButton() {
		WebElement signbutton = driver.findElement(LoginPageModel.getSignInButton());
		signbutton.click();
		
	}

	public void verifyMyAccountPageTitle(String title) {

		String title1 = DriverFactory.getInstance().getDriver().getTitle();
		assertThat(title1, startsWith(title));
	}

	public void myAccountSuccessMessageDisplay(String expectedMessage) {

		String loginSuccess = driver.findElement(LoginPageModel.getMessage()).getText();
		assertThat(loginSuccess, startsWith(expectedMessage));
	}

	public void passwordNotMatchMessage(String mess) {

		String message = driver.findElement(LoginPageModel.getErrorMess()).getText();
		assertThat(message, startsWith(mess));
	}

}
