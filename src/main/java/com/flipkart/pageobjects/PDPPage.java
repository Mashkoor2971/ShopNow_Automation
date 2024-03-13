package com.flipkart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PDPPage {

	public WebDriver driver;

	public PDPPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Add to cart']")
	public WebElement addToCartBtn;

	@FindBy(xpath = "//h1//span[@class='B_NuCI']")
	public WebElement productNameInPDP;
}
