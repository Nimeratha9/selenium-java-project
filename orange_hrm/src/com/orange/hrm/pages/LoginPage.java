package com.orange.hrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.hrm.common.WebDriverFactory;

public class LoginPage {
	@FindBy(id="txtUsername") WebElement elmusername;
	@FindBy(id="txtPassword") WebElement elmpasswrd;
	@FindBy(id="btnLogin") WebElement elmloginbutton;

public LoginPage()
{
PageFactory.initElements(WebDriverFactory.dr, this);
}
public void login() 
{
	elmusername.sendKeys("ADMIN");
	elmpasswrd.sendKeys("ADMIN");
	elmloginbutton.click();
}
}
