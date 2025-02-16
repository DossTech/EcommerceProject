package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.StartingPage;

public class VerifyLogin extends BaseClass{
	
	@BeforeTest
	public void setup() {
		fileName = "LoginPage";

	}

	@Test(dataProvider="data")
	public void verifyLogin(String userName,String password) {
		new StartingPage(driver).
		clickLogin().
		enterUserName(userName).
		enterPassword(password).
		clickLoginButton();
	}
}
