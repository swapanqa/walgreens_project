package com.walgreens.testLayer;

import org.testng.annotations.Test;

import com.walgreens.hooks.CommonStepsPage;

public class HomePageTest extends CommonStepsPage {

	@Test
	public void test() {

		walgreens().homePage().brokenLinks();
		walgreens().homePage().iframe();

	}

}
