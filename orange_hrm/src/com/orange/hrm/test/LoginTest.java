package com.orange.hrm.test;
import org.testng.annotations.Test;
import com.orange.hrm.common.BaseSelenium;
import com.orange.hrm.pages.AddEmployeePage;
import com.orange.hrm.pages.AddUserPage;
import com.orange.hrm.pages.LoginPage;

public class LoginTest extends BaseSelenium
{
	
@Test
public void verifyAdminLoginSuccesfull()
	{

	LoginPage lp=new LoginPage();
	lp.login();
	
	//AddEmployeePage ae=new AddEmployeePage();
	//ae.addEmp();
	
	//AddUserPage au=new AddUserPage();
	//au.addUser();
	
	}	
	
}
