package com.flipkart.pages;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.pageobjects.PDPPage;
import com.flipkart.utils.MouseActions;

public class PDPpage {
	
	public WebDriver driver =Hooks.driver;
	static String productName;

	PDPPage PDPPage = new PDPPage(driver);
	Log logger = LogFactory.getLog(PDPpage.class);
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	/**
	 * This method clicks on Add to Cart Btn in the PDP Page
	 * @author Mashkoor
	 */
	public void addTheProductToTheCart() {
		productName = PDPPage.productNameInPDP.getText().trim();
		wait.until(ExpectedConditions.elementToBeClickable(PDPPage.addToCartBtn));
		MouseActions.scrollToElement(driver, PDPPage.addToCartBtn);
		PDPPage.addToCartBtn.click();
		logger.info("User add the "+productName+" to the cart");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
