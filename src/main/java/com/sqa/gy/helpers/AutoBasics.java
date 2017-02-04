
package com.sqa.gy.helpers;

import java.io.*;

import org.apache.commons.io.*;
import org.openqa.selenium.*;

public class AutoBasics {

	public static boolean takesScreenshot(WebDriver driver, String fileName) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("screenshots/" + fileName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean isElementPresent(WebDriver driver, By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return false;
	}

}
