package com.flipkart.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MouseActions {
	
	public static void jSClick(WebDriver driver, WebElement element){
		JavascriptExecutor scriptExecutor = (JavascriptExecutor) driver;  
		scriptExecutor.executeScript("arguments[0].click();", element);
	}
	
	public static void scrollToElement(WebDriver driver, WebElement element){
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
}
