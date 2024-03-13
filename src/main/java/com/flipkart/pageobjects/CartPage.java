package com.flipkart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	public WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div//a[contains(@href,'viewcart')])[1]")
	public WebElement cartIconTopNav;

	@FindBy(xpath = "//button//span[contains(text(),'Place Order')]")
	public WebElement placeOrderBtnInCart;
	
	@FindBy(xpath = "//a[@class='_2Kn22P gBNbID']")
	public WebElement productInCart;
	
}
