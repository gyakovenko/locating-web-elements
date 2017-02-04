package com.sqa.gy;

import java.util.*;
import java.util.concurrent.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

public class SAPTest {

	private static WebDriver driver;
	// private String baseURL = "http://www.msn.com/";
	private String baseURL = "http://www.msn.com/";

	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(this.baseURL);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(enabled = false)
	public void testByClassName() {
		WebElement element = driver.findElement(By.className("className-of-element"));
	}

	@Test // (enabled = false)
	public void testByCSS() {
		WebElement element = driver.findElement(By.cssSelector(".skycond.loaded"));
	}

	@Test(enabled = false)
	public void testByID() {
		WebElement element = driver.findElement(By.id("id-of-element"));
	}

	@Test(enabled = false)
	public void testByLinkText() {
		WebElement element = driver.findElement(By.linkText("linkText-of-element"));
	}

	@Test(enabled = false)
	public void testByPartialLinkText() {
		WebElement registerForAriba = driver.findElement(By.partialLinkText("Register now"));
	}

	@Test(enabled = false)
	public void testByTagName() {
		List<WebElement> allImagesOnPage = driver.findElements(By.tagName("img"));
		for (int i = 0; i < allImagesOnPage.size(); i++) {
			System.out.print("Image # " + (i + 1) + ": " + allImagesOnPage.get(i).getAttribute("src"));
		}
	}

	@Test(enabled = false)
	public void testByXPath() {
		WebElement registerForAriba = driver
				.findElement(By.xpath(".//*[@id='main']/div/div[4]/div[5]/div/div/div/div/div[2]/div/div/div[2]/a"));
	}

}
