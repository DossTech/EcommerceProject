package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.StartingPage;

public class BooksSelection extends BaseClass {

	@BeforeTest
	public void setup() {
		fileName = "LoginPage";

	}
	@Test(dataProvider="data")
	public void booksSelection(String userName,String password) throws InterruptedException {
		new StartingPage(driver).
		clickLogin().
		enterUserName(userName).
		enterPassword(password).
		clickLoginButton().
		clickBooks().
		booksadded().
		clickComputers();

	}
}
