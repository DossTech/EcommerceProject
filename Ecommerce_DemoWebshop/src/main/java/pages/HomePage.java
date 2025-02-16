package pages;
//page3
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class HomePage extends BaseClass{

	public HomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public BooksPage clickBooks() {
	 driver.findElement(By.linkText("BOOKS")).click();
    return new BooksPage(driver);
	    

	}
}
