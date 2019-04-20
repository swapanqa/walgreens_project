package com.walgreens.controller;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.walgreens.model.HomePageModel;
import com.walgreens.pageBase.PageBase;
import com.walgreens.utils.DriverFactory;
import com.walgreens.utils.PropertyReaderService;



public class HomePageController extends PageBase {

	protected WebDriver driver = null;

	public HomePageController(WebDriver driver) {
		this.driver = driver;
	}

	public void browseToTheSite() {

		driver.navigate().to(PropertyReaderService.getInstance().getProperty("APP_URL"));
		driver.manage().window().maximize();
	}

	public void verifyHomePageTitle() {

		String title = DriverFactory.getInstance().getDriver().getTitle();
		assertThat(title, startsWith("Walgreens. Trusted Since 1901."));
	}

	public void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	public void brokenLinks() {
		List<WebElement> totalLinks = driver.findElements(HomePageModel.getHomePageLinks());

		List<String> activeLinks = new ArrayList<String>();

		for (int i = 0; i < totalLinks.size(); i++) {
			if (totalLinks.get(i).getAttribute("href") != null) {
				activeLinks.add(totalLinks.get(i).getAttribute("href"));
			}
		}
		System.out.println("total number of active links are ----->" + activeLinks.size());

		int count = 1;
		for (int j = 0; j < activeLinks.size(); j++) {
			String url = activeLinks.get(j);
			try {
				HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j)).openConnection();
				connection.connect();
				String massage = connection.getResponseMessage();
				connection.disconnect();
				System.out.println(count + "--->" + url + "----->" + massage);
				count++;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void goToAccountLinks() {

		WebElement account = driver.findElement(HomePageModel.getAccountLinks());
		account.click();
		

	}

	public void goToSignInPage() {

		WebElement signIn = driver.findElement(HomePageModel.getSignLink());
		signIn.click();
		

	}

	public void goTooContractPage() {
		WebElement con = driver.findElement(HomePageModel.getContract());
		Actions act = new Actions(driver);
		act.moveToElement(con).build().perform();
		

		WebElement lenses = driver.findElement(HomePageModel.getdrops());
		act.moveToElement(lenses).build().perform();
		lenses.click();

	}

	public void iframe() {

		int size = driver.findElements(By.tagName("iframe")).size();
		{

			System.out.println("total iframe is: " + size);
		}

	}

}
