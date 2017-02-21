package com.sqa.gy.helpers;

import org.apache.log4j.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class BasicPage {

	private WebDriver driver;

	private Logger logger;

	public BasicPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.logger = Logger.getLogger(BasicTest.class); // you pass in the
															// class type. you
															// could put in a
															// string, but
															// unique to the
															// THIS logger.
	}


	public WebDriver getDriver() {
		return this.driver;
	}

	public Logger getLogger() {
		return this.logger;
	}

	public boolean isElementPresent(By by) {
		return AutoBasics.isElementPresent(getDriver(), by);
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	public boolean takeScreenshot() {
		return AutoBasics.takesScreenshot(this.driver, "screenshot");
	}

	public boolean takeScreenshot(String filename) {
		return AutoBasics.takesScreenshot(this.driver, filename);
	}

}
