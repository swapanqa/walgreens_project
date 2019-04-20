package com.walgreens.model;

import org.openqa.selenium.By;

public class HomePageModel {

	private static By homePageLinks = By.tagName("a");
	private static By accountLinks = By.xpath("//span[contains(text(),'Your account')]");
	private static By signLink = By.xpath("//span[contains(text(),'Sign in')]");

	private static By rxRefillsLink = By.xpath("//a[@title='Rx Refills']");
	private static By drugIn = By.xpath("//span[@value='Drug Information']");
	private static By health = By.xpath("//a[@title='Health Info & Services']");
	private static By findCare = By.xpath("//a[@title='Health Info & Services - Health Answers']");

	private static By contract = By.xpath("//a[@title='Contact Lenses']");
	private static By drops = By.xpath("//span[@value='Solutions, Drops & Cases']");

	public static By getHomePageLinks() {
		return homePageLinks;
	}

	public static By getAccountLinks() {
		return accountLinks;
	}

	public static By getSignLink() {
		return signLink;
	}

	public static By getRxrefills() {
		return rxRefillsLink;
	}

	public static By getDrugInformation() {
		return drugIn;
	}

	public static By getHealthInfo() {
		return health;
	}

	public static By getFindCare() {
		return findCare;
	}

	public static By getContract() {
		return contract;
	}

	public static By getdrops() {
		return drops;
	}
}
