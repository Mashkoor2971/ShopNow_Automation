package com.flipkart.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;

public class Hooks {
	public static WebDriver driver;

	static {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(
					"C:\\Users\\61080691\\Documents\\Selenium\\Flipkart\\src\\test\\resouces\\config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties p = new Properties();
		try {
			p.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String mybrowser = p.getProperty("browser");
		System.out.println(mybrowser);
		if (mybrowser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src\\test\\resouces\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (mybrowser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "\\src\\test\\resouces\\drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
		} else if (mybrowser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\selenium\\edgedriver_win64\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
		}
		driver.manage().window().maximize();

	}

	@After
	public void tearDown() {
		if (driver != null)
			driver.quit();
	}

}
