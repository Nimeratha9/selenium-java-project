package com.orange.hrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.hrm.common.WebDriverFactory;

public class AddEmployeePage
{

	@FindBy(id="menu_pim_viewPimModule") WebElement empbutton;
	@FindBy(id="menu_pim_addEmployee") WebElement addEmpbutton;
	@FindBy(id="firstName") WebElement firstNme;
	@FindBy(id="middleName") WebElement middleNme;
	@FindBy(id="lastName") WebElement lastNme;
	@FindBy(id="employeeId") WebElement empid;
	@FindBy(id="btnSave") WebElement saveEmpBttn;

public AddEmployeePage()
{
	PageFactory.initElements(WebDriverFactory.dr, this);
}

public void addEmp() 
{
	empbutton.click();
	addEmpbutton.click();
	firstNme.sendKeys("Pratiksha");
	middleNme.sendKeys("Chandrakant");
	lastNme.sendKeys("Kadam");
	empid.sendKeys("");
	saveEmpBttn.click();
}

}