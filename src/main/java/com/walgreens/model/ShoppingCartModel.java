package com.walgreens.model;

import org.openqa.selenium.By;

public class ShoppingCartModel {

	private static By shoppingCartLink = By.xpath("//span[@class='icon_cart_d ml5']");

	private static By continu = By.xpath("//button[@id='continue-no-item-link-text']");
	
	

	private static By beautylink = By.xpath("//a[@class='shop-width'][contains(text(),'Beauty')]");
	private static By cosmetic = By.xpath("//span[contains(text(),'Cosmetics')]");
	private static By eye = By.xpath("//button[@id='add-to-cart-btncompare_sku6312439']");
	private static By chart = By.xpath("//a[@id='addToCart-cart-checkout']");

	private static By beautyLink = By.xpath("//a[@title='link-Beauty']");
	private static By cosmeticLink = By.xpath("//span[contains(text(),'Cosmetics')]");
	private static By faceLink = By.xpath("//a[@title='Face']//span[contains(text(),'Face')]");
	private static By colorfamily = By.xpath("//img[@id='label_color5000015134']");
	private static By addToCart = By.xpath("//button[@id='add-to-cart-btncompare_sku6228251']");
	private static By viewCart = By.xpath("//a[@id='addToCart-cart-checkout']");

	private static By checkout = By.xpath("//button[@id='proceedtocheckout']");

	public static By getShoppingCartLink() {
		return shoppingCartLink;
	}

	public static By getBeauty() {
		return beautylink;
	}

	public static By getCosmetic() {
		return cosmetic;
	}

	public static By getbb() {
		return eye;
	}

	public static By getCheckout() {
		return chart;
	}

	public static By getBeautylink() {
		return beautyLink;
	}

	public static By getCosmeticlink() {
		return cosmeticLink;
	}

	public static By getFaceLink() {
		return faceLink;
	}

	public static By getColorfamily() {
		return colorfamily;
	}

	public static By getCart() {
		return addToCart;
	}

	public static By getViewCart() {
		return viewCart;
	}

	public static By getCheck() {
		return checkout;
	}

	public static By getContinue() {
		return continu;
	}

}
