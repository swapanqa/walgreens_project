package com.walgreens.model;

import org.openqa.selenium.By;

public class SearchPageModel {

	public static By searchLink = By.xpath("//input[@id='ntt-placeholder']");
	public static By searchButton = By.xpath("//img[@alt='search']");
	public static By textVerify = By.xpath("//font[@class='wag-search-result-head-height']");

	public static By popUp = By.xpath("//*[@id=\"acsMainInvite\"]/a");

	public static By getSearch() {
		return searchLink;
	}

	public static By getButton() {
		return searchButton;
	}

	public static By getText() {
		return textVerify;
	}

	public static By getPopup() {
		return popUp;
	}

}
