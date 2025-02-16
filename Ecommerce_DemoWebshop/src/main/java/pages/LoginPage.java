package pages;
//Page2
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class LoginPage extends BaseClass{

	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public LoginPage enterUserName(String email) {
		driver.findElement(By.id("Email")).sendKeys(email);
		return this;
	}

	public LoginPage enterPassword(String password) {
		driver.findElement(By.id("Password")).sendKeys(password);
		return this;
	}

	public HomePage clickLoginButton() {
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		return new HomePage(driver);
	}



	//driver.findElement(By.linkText("Log out")).click();
}
