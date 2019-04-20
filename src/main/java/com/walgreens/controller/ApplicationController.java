package com.walgreens.controller;

import org.openqa.selenium.WebDriver;

public class ApplicationController {
	private WebDriver driver = null;
	protected HomePageController homePage = null;
	protected LoginPageController loginPage = null;
	
	protected SearchPageController searchPage = null;
	
	

	protected ShoppingCartController shoppingCartPage = null;

	public ApplicationController(WebDriver driver) {

		this.driver = driver;

	}

	public HomePageController homePage() {
		if (homePage == null) {
			homePage = new HomePageController(driver);
		}
		return homePage;
	}

	public LoginPageController loginPage() {

		if (loginPage == null) {
			loginPage = new LoginPageController(driver);
		}
		return loginPage;
	}

	

	public SearchPageController searchPage() {
		if (searchPage == null) {
			searchPage = new SearchPageController(driver);
		}
		return searchPage;
	}

	

	
	public ShoppingCartController shoppingCartPage() {
		if (shoppingCartPage == null) {
			shoppingCartPage = new ShoppingCartController(driver);
		}
		return shoppingCartPage;

	}

}
