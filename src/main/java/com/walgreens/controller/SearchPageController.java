package com.walgreens.controller;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.walgreens.model.SearchPageModel;
import com.walgreens.pageBase.PageBase;
import com.walgreens.utils.DriverFactory;



public class SearchPageController extends PageBase {

	protected WebDriver driver = null;

	public SearchPageController(WebDriver driver) {
		this.driver = driver;

	}

	public void searchTextBox(String text) {

		WebElement textType = driver.findElement(SearchPageModel.getSearch());
		textType.clear();
		textType.sendKeys(text);
		

		WebElement button = driver.findElement(SearchPageModel.getButton());
		button.click();
		
	}

	public void verifyPageTitle() {

		String title = DriverFactory.getInstance().getDriver().getTitle();
		assertThat(title, startsWith("antacid | Walgreens"));
	}

	public void verifyText(String expectedmsg) {

		WebElement text = driver.findElement(SearchPageModel.getText());

		String msg = text.getText();
		assertThat(msg, startsWith(expectedmsg));
	}

	public void closePopUp() {
		WebElement pop = driver.findElement(SearchPageModel.getPopup());
		pop.click();
	}

}
