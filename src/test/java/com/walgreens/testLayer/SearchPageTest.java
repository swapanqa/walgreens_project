package com.walgreens.testLayer;

import org.testng.annotations.Test;

import com.walgreens.hooks.CommonStepsPage;

public class SearchPageTest extends CommonStepsPage {

	@Test
	public void test() {

		walgreens().searchPage().searchTextBox("antacid");
		walgreens().searchPage().verifyPageTitle();

	}

}
