package com.walgreens.pageBase;

import org.openqa.selenium.WebDriver;

import com.walgreens.controller.ApplicationController;
import com.walgreens.utils.DriverFactory;
import com.walgreens.utils.PropertyReaderService;


public class PageBase {

	protected WebDriver driver = DriverFactory
			.getInstance(PropertyReaderService.getInstance().getProperty("CLOUD_BROWSER")).getDriver();

	protected ApplicationController applicationController = null;

	public ApplicationController walgreens() {

		if (applicationController == null) {
			applicationController = new ApplicationController(driver);
		}

		return applicationController;
	}

}
