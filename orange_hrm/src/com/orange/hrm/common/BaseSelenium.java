package com.orange.hrm.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseSelenium {

 @BeforeMethod
	public void beforeEachTestExecution() 
 {
	System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	WebDriverFactory.dr=new FirefoxDriver();
	//WebDriverFactory.dr = dr;
	
	WebDriverFactory.dr.manage().window().maximize();
	WebDriverFactory.dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");
	 
 }

 @AfterMethod
 public void afterEachTestExecution() 
 {
	 WebDriverFactory.dr.quit();
	 
 }
 
	}
