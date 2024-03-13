package com.flipkart.pages;

import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.flipkart.pageobjects.YahooLocators;
import com.flipkart.utils.MouseActions;

public class YahooPage {

	public WebDriver driver = Hooks.driver;
	YahooLocators YahooLocator = new YahooLocators(driver);
	Log logger = LogFactory.getLog(YahooPage.class);

	/**
	 * This method gets the OTP from the Yahoo Mail
	 * 
	 * @author Mashkoor
	 * @param username , password
	 */
	public String userGetsOTPfromTheMail(String username, String password) {
		String OTP = null;
		((JavascriptExecutor) driver).executeScript("window.open();");
		Set<String> windowHandles = driver.getWindowHandles();
		int a = windowHandles.size();
		for (String Tab : windowHandles) {
			driver.switchTo().window(Tab);
		}
		driver.navigate().to("https://login.yahoo.com/");
		YahooLocator.username.sendKeys(username);
		YahooLocator.username.sendKeys(Keys.ENTER);
		logger.info("User enters the username");

		YahooLocator.password.sendKeys(password);
		YahooLocator.password.sendKeys(Keys.ENTER);
		logger.info("User enters the password and login");

		MouseActions.jSClick(driver, YahooLocator.mailIcon);
		logger.info("User navigates to Yahoo Mail");
		
		return OTP;

	}

}
