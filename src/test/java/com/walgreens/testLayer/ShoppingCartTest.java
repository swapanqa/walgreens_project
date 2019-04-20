package com.walgreens.testLayer;

import org.testng.annotations.Test;

import com.walgreens.hooks.CommonStepsPage;

public class ShoppingCartTest extends CommonStepsPage {

	@Test
	public void test()  {

		
	    walgreens().shoppingCartPage().goToShoppingCartPage();
	     walgreens().shoppingCartPage().goToContinueShoping();
		
	}

}
