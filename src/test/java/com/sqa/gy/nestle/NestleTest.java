package com.sqa.gy.nestle;

import org.testng.annotations.*;

import com.sqa.gy.helpers.*;

public class NestleTest extends BasicTest {

	/**
	 * @param baseUrl
	 * @param driver
	 */
	public NestleTest() {
		super("http://nestleusa.com");
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { "chocolate" }, new Object[] { "kduhsldfjhslkdfjsd" },
				new Object[] { "isha" }, new Object[] { "pepper" } };
	}

	@Test(dataProvider = "dp")
	public void searchNestleSiteTest(String item) throws InterruptedException {
		NestleHomePage homepage = new NestleHomePage(getDriver());
		this.getLogger().info("Running test: search " + item);
		SearchResultsPage searchResultsPage = homepage.searchForItem(item);
		homepage.takeScreenshot(item + " search screenshot");
		searchResultsPage.logNumberOfResults(item);
		Thread.sleep(5000);
	}

	@Test(enabled = false)
	public void testNestle() throws InterruptedException {
		Thread.sleep(5000);
	}

}