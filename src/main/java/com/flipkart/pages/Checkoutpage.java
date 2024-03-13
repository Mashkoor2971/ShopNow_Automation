package com.flipkart.pages;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.flipkart.pageobjects.CheckOutPage;


public class Checkoutpage {
	
	public WebDriver driver = Hooks.driver;

	CheckOutPage CheckoutPage = new CheckOutPage(driver);
	Log logger = LogFactory.getLog(Checkoutpage.class);
	WebDriverWait wait = new WebDriverWait(driver, 10);

	/**
	 * This method enters the username in login field
	 * @author Mashkoor
	 * @param email
	 */
	public void userEntersEmail(String email) {
		CheckoutPage.emailField.sendKeys(email);
		CheckoutPage.continueBtn.click();
		logger.info("User enters the Email for login and continue");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
