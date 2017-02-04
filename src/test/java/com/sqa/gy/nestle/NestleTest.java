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

	@Test
	public void searchNestleSiteTest() throws InterruptedException {
		NestleHomePage homepage = new NestleHomePage(getDriver());
		this.getLogger().info("Running test");
		homepage.searchForItem("chocolate");
		homepage.takeScreenshot("Nestle Search for Chocolate");
		Thread.sleep(5000);
	}

	@Test(enabled = false)
	public void testNestle() throws InterruptedException {
		Thread.sleep(5000);
	}

}