package com.walgreens.model;

import org.openqa.selenium.By;

public class ShopPageModel {

	private static By shopLink = By.xpath("//a[@title='Shop']");
	private static By eyeLink = By.xpath("//a[@title='Cosmetics-Eyes']");

	private static By personalcareLink = By.xpath("//a[@title='Personal Care Category']");
	private static By toothPaste = By.xpath("//a[@title='Oral Care-Toothpaste']");

	public static By getShopLink() {
		return shopLink;
	}

	public static By getEyeLink() {
		return eyeLink;
	}

	public static By getPersonalcareLink() {
		return personalcareLink;
	}

	public static By getPaste() {
		return toothPaste;
	}

}
