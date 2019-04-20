package com.walgreens.testLayer;

import org.testng.annotations.Test;

import com.walgreens.hooks.CommonStepsPage;



public class LoginPageTest extends CommonStepsPage {
	
	
	

	@Test(priority = 0)
	public void test() {
		
		
		walgreens().homePage().goToAccountLinks();
		walgreens().homePage().goToSignInPage();
		walgreens().loginPage().typeInUsername("mamunny79@gmail.com");
		walgreens().loginPage().verifyLoginPageTitle();
		walgreens().loginPage().typePasswordText("shifa20155");
		walgreens().loginPage().clickSignButton();
		walgreens().loginPage().verifyMyAccountPageTitle("Walgreens.com | Walgreens");
		walgreens().loginPage().myAccountSuccessMessageDisplay("Your Account");
		
		
		
	}
	
	@Test(priority = 1,enabled = false)
	public void test2() {
		
		walgreens().homePage().goToAccountLinks();
		walgreens().homePage().goToSignInPage();
		walgreens().loginPage().typeInUsername("mamunny79@gmail.com");
		walgreens().loginPage().verifyLoginPageTitle();
		walgreens().loginPage().typePasswordText("shafee20133");
		walgreens().loginPage().clickSignButton();
		walgreens().loginPage().passwordNotMatchMessage("The information you entered doesn�t match our records. Please double-check your info and try again.");
		
		
	}
	
	
	

}
