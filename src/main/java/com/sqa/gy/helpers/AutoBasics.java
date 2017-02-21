
package com.sqa.gy.helpers;

import java.io.*;

import org.apache.commons.io.*;
import org.openqa.selenium.*;

public class AutoBasics {

	public static boolean canParseValueToInt(WebDriver driver, By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public static boolean isElementPresent(WebDriver driver, By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static boolean takesScreenshot(WebDriver driver, String fileName) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("screenshots/" + fileName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

}
