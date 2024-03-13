package com.flipkart.pages;

import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.pageobjects.PDPPage;
import com.flipkart.pageobjects.PLPPage;
import com.flipkart.utils.MouseActions;

public class PLPpage {

	public WebDriver driver = Hooks.driver;

	PLPPage PLPPage = new PLPPage(driver);
	PDPPage PDPPage = new PDPPage(driver);
	Log logger = LogFactory.getLog(PLPpage.class);
	WebDriverWait wait = new WebDriverWait(driver, 10);

	/**
	 * This method clicks on the Product in the PLP Page
	 * @author Mashkoor
	 */
	public void clickOnProductInPLP() {
		MouseActions.scrollToElement(driver, PLPPage.productInPLP);
		PLPPage.productInPLP.click();
		logger.info("User clicks on the product in the PLP Page");
		Set<String> windowHandles = driver.getWindowHandles();
		for (String Tab : windowHandles) {
			driver.switchTo().window(Tab);
		}
		wait.until(ExpectedConditions.elementToBeClickable(PDPPage.addToCartBtn));
		MouseActions.scrollToElement(driver, PDPPage.addToCartBtn);
		Assert.assertTrue(PDPPage.addToCartBtn.isDisplayed());

	}

}
