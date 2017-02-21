package com.sqa.gy.nestle;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.sqa.gy.helpers.*;

public class SearchResultsPage extends BasicPage {

	@FindBy(id = "noresult")
	private WebElement noResults;

	@FindBy(id = "numberItem")
	private WebElement numOfSearchResults;

	WebDriver driver;

	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}

	public void logNumberOfResults(String item) {
		String numOfResults;
		if (this.isElementPresent(By.id("numberItem"))) {
			if (!this.numOfSearchResults.getText().trim().equalsIgnoreCase("")) {
				numOfResults = this.numOfSearchResults.getText().trim();
				this.getLogger().info("Search results for " + item + ": " + numOfResults);
			} else if (this.isElementPresent(By.id("noresult"))) {
				numOfResults = "NONE";
				this.getLogger().info("Search results for " + item + ": " + numOfResults);
			}
		} else {
			this.getLogger().info("Error locating elements for Search Results");
		}
	}
}
