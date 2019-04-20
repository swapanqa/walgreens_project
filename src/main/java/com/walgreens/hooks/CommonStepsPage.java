package com.walgreens.hooks;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.walgreens.pageBase.PageBase;
import com.walgreens.utils.DriverFactory;
import com.walgreens.utils.PropertyReaderService;





public class CommonStepsPage extends PageBase {

	protected WebDriver driver = DriverFactory.getInstance(PropertyReaderService.getInstance().getProperty("BROWSER"))
			.getDriver();

	@BeforeMethod
	public void setUp() {

		DriverFactory.getInstance().getDriver();
		driver.navigate().to(PropertyReaderService.getInstance().getProperty("APP_URL"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void tearDown() {

		DriverFactory.getInstance().removeDriver();
		applicationController = null;
	}

}
