package testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.StartingPage;	

public class ElectronicsSelection extends BaseClass{

	@BeforeTest
	public void setup() {
		fileName = "LoginPage";
	}
	
	@Test(dataProvider="data")
	public void electronics(String userName,String password) throws AWTException, InterruptedException {
		new StartingPage(driver).
		clickLogin().
		enterUserName(userName).
		enterPassword(password).
		clickLoginButton().
		clickBooks().
		booksadded().
		clickComputers().
		selectNoteBooks().
		clickLaptop().
		clickElectronics();

	}

}
