package com.flipkart.pages;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.pageobjects.HomePage;



public class Homepage {

	public WebDriver driver = Hooks.driver;
	Log logger = LogFactory.getLog(Homepage.class);
	HomePage HomePage = new HomePage(driver);
	WebDriverWait wait = new WebDriverWait(driver, 10);

	/**
	 * This method opens the flipkart website in browser
	 * @author Mashkoor
	 */
	public void userNavigatesToFlipkartHomePage() {
		driver.get("https://www.flipkart.com/");
		logger.info("User is on the Flipkart HomePage");
	}

	/**
	 * This method verifies the Page Title
	 * @author Mashkoor
	 * @param title
	 */
	public void userVerifiesPageTitle(String title) {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getTitle(), title);
	}

	/**
	 * This method closes the Pop Up in the HomePage
	 * @author Mashkoor
	 */
	public void closePopUp() {
		try {
			HomePage.popUp.click();
			logger.info("User closes the Pop Up in HomePage");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method searches for the product on the HomePage
	 * @author Mashkoor
	 * @param Keyword : Prodcut that user needs to search
	 */
	public void userSearchesProductByEnter(String keyword) {
		HomePage.searchBar.click();
		HomePage.searchBar.sendKeys(keyword);
		HomePage.searchBar.sendKeys(Keys.ENTER);
		logger.info("User searches for "+keyword+" in searchbar");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains(keyword));
	}

}
