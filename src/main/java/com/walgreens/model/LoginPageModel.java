package com.walgreens.model;

import org.openqa.selenium.By;

public class LoginPageModel {

	public static By usernameLink = By.xpath("//input[@id='userName-phoneNo']");
	public static By buttonLink = By.xpath("//button[@id='continueBtn']");
	public static By passwordLink = By.xpath("//input[@id='password']");
	public static By signInlink = By.xpath("//button[@id='passwordtabSignIn']");
	public static By message = By.xpath("//h1[@class='mt0 mb25']");

	public static By errorMess = By
			.xpath("//span[contains(text(),'The information you entered doesn�t match our reco')]");

	public static By getUsernamelink() {
		return usernameLink;
	}

	public static By getClickButton() {
		return buttonLink;
	}

	public static By getPasswordText() {
		return passwordLink;
	}

	public static By getSignInButton() {
		return signInlink;
	}

	public static By getMessage() {
		return message;
	}

	public static By getErrorMess() {
		return errorMess;
	}

}
