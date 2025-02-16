package pages;
//Page1
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class StartingPage extends  BaseClass{

	public StartingPage(RemoteWebDriver driver) {
		this.driver=driver;
	//	PageFactory.initElements(driver,this);
	}

	public LoginPage clickLogin() {
		 driver.findElement(By.linkText("Log in")).click();
		 return new LoginPage(driver);

	}

	
	
}
