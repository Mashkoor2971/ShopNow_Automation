package com.flipkart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PLPPage {

	public WebDriver driver;

	public PLPPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='_2kHMtA' and contains(@data-tkid,'SEARCH')])[1]")
	public WebElement productInPLP;

}
