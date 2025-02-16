package testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.StartingPage;

public class ComputerSelection extends BaseClass{

	@BeforeTest
	public void setup() {
		fileName="LoginPage";
	}

	@Test(dataProvider="data")
	public void computerSelection(String userName,String password) throws InterruptedException, AWTException {
		new StartingPage(driver).
		clickLogin().
		enterUserName(userName).
		enterPassword(password).
		clickLoginButton().
		clickBooks().
		booksadded().
		clickComputers().
		selectNoteBooks().
		clickLaptop();
		

	}
	
}
