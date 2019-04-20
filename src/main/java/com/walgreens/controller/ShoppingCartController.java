package com.walgreens.controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.walgreens.model.ShoppingCartModel;
import com.walgreens.pageBase.PageBase;
import com.walgreens.utils.SeleniumUtilies;




public class ShoppingCartController extends PageBase {

	protected WebDriver driver = null;

	public ShoppingCartController(WebDriver driver) {
		this.driver = driver;
	}

	public void goToShoppingCartPage() {

		WebElement shoppingcartLink = driver.findElement(ShoppingCartModel.getShoppingCartLink());
		//driver.switchTo().frame(shoppingcartLink);
		shoppingcartLink.click();

	}
	
	public void goToContinueShoping() {
		
		WebElement continueShopping = driver.findElement(ShoppingCartModel.getContinue());
		continueShopping.click();
		SeleniumUtilies.delayFor(2000);
	}

	public void gotoBeauty() {
		WebElement beauty = driver.findElement(ShoppingCartModel.getBeauty());
		beauty.click();
	}

	public void goToCosmetic() {
		WebElement cosmetic = driver.findElement(ShoppingCartModel.getCosmetic());
		cosmetic.click();
	}

	public void addCardEye() {
		WebElement eye = driver.findElement(ShoppingCartModel.getbb());
		eye.click();
		
	}

	public void viewCart() {
		WebElement view = driver.findElement(ShoppingCartModel.getbb());
		view.click();
	}

	

	public void clickContinue() {
		WebElement con = driver.findElement(ShoppingCartModel.getContinue());
		con.click();
		
	}

	public void clickBeauty() {
		WebElement beauty = driver.findElement(ShoppingCartModel.getBeautylink());
		beauty.click();
		
	}

	public void clickCosmeticLink() {
		WebElement cosmetic = driver.findElement(ShoppingCartModel.getCosmeticlink());
		cosmetic.click();
		
	}

	public void clickFaceLink() {
		WebElement face = driver.findElement(ShoppingCartModel.getFaceLink());
		face.click();
		
	}

	public void selectColor() {
		WebElement color = driver.findElement(ShoppingCartModel.getColorfamily());
		color.click();
		
	}


	public void addCard() {
		WebElement cart = driver.findElement(ShoppingCartModel.getCart());
		cart.click();
		
	}

	public void viewCard() {
		WebElement cart = driver.findElement(ShoppingCartModel.getViewCart());
		cart.click();
	}

	public void checkOut() {
		WebElement check = driver.findElement(ShoppingCartModel.getCheck());
		check.click();
	
	}

	

}
