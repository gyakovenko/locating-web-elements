package com.sqa.gy.nestle;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.sqa.gy.helpers.*;

public class NestleHomePage extends BasicPage {

	@FindBy(id = "btnSearch")
	private WebElement searchButton;
	@FindBy(id = "s2id_autogen1")
	private WebElement searchField;

	public NestleHomePage(WebDriver driver) {
		super(driver);
	}

	public SearchResultsPage searchForItem(String item) {
		this.searchField.clear();
		this.searchField.sendKeys(item);
		this.searchButton.click();
		return new SearchResultsPage(getDriver());
	}

}
