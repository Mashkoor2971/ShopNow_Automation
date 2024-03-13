package com.flipkart.pages;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.flipkart.pageobjects.CartPage;
import com.flipkart.utils.MouseActions;


public class Cartpage {
	
	public WebDriver driver = Hooks.driver;

	CartPage CartPage = new CartPage(driver);
	Log logger = LogFactory.getLog(Cartpage.class);
	WebDriverWait wait = new WebDriverWait(driver, 10);

	/**
	 * This method clicks on cart Icon in Top Navigation &
	 * It verifies cart is empty or not
	 * @author Mashkoor
	 */
	public void clickOnCartFromTopNav() {
		MouseActions.jSClick(driver, CartPage.cartIconTopNav);
		logger.info("User is in the cart page");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(driver.getTitle().contains("Cart"));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(CartPage.placeOrderBtnInCart));
			Assert.assertTrue(PDPpage.productName.contains(CartPage.productInCart.getText().trim()));
		} catch (Exception e) {
			logger.info("The cart is empty !");
		}
	}
	
	
	/**
	 * This method clicks on proceed to checkout in cart page
	 * @author Mashkoor
	 */
	public void userClicksOnProceedToCheckoutButton() {
		wait.until(ExpectedConditions.elementToBeClickable(CartPage.placeOrderBtnInCart));
		MouseActions.jSClick(driver, CartPage.placeOrderBtnInCart);
		logger.info("User clicks on proceed to checkout");
		Assert.assertTrue(driver.getCurrentUrl().contains("checkout"));
	}


}
