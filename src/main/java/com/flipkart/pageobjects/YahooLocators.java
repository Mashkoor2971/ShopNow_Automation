package com.flipkart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YahooLocators {

	public WebDriver driver;

	public YahooLocators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='login-username']")
	public WebElement username;

	@FindBy(xpath = "//input[@id='login-passwd']")
	public WebElement password;

	@FindBy(xpath = "(//a[contains(@href,'mail')])[1]")
	public WebElement mailIcon;

}
