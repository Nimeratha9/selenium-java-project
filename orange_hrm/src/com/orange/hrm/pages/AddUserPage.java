package com.orange.hrm.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.orange.hrm.common.WebDriverFactory;

public class AddUserPage{
	
	@FindBy(id="menu_admin_viewAdminModule") WebElement adminbutton;
	@FindBy(id="btnAdd") WebElement addbutton;
	@FindBy(id="systemUser_userType") WebElement usrRole;

	@FindBy(id="systemUser_employeeName_empName") WebElement newEmpNme;
	@FindBy(id="systemUser_userName") WebElement newUsrNme;
	@FindBy(id="systemUser_password") WebElement newpasswrd;
	@FindBy(id="systemUser_confirmPassword") WebElement cnfmpsswrd;
	@FindBy(id="btnSave") WebElement saveBttn;
	
	public AddUserPage()
	{
		PageFactory.initElements(WebDriverFactory.dr, this);
	}
	
	public void addUser() 
	{
		adminbutton.click();
		addbutton.click();
		Select urlist=new Select(usrRole);
		urlist.selectByIndex(0);
		newEmpNme.sendKeys("Pratiksha Chandrakant Kadam");
		newUsrNme.sendKeys("Pratiksha");
		newpasswrd.sendKeys("Pratiksha");
		cnfmpsswrd.sendKeys("Pratiksha");
		saveBttn.click();
	}
}
