package pages;
//page4
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class BooksPage extends BaseClass{

	public BooksPage(RemoteWebDriver driver) {
		this.driver=driver;
	}

	public BooksPage booksadded() throws InterruptedException {

		for (int i = 1; i <=3; i++) {
			WebElement btnAdd = driver.findElement(By.xpath("(//div[@class=\"product-grid\"]//input)["+i+"]"));
		
			btnAdd.click();
			Thread.sleep(5000);
		}
		return this;
		

		
		}
		
	public ComputerPage clickComputers() throws InterruptedException {
		
		WebElement btnComputer = driver.findElement(By.xpath("//a[text()[normalize-space()='Computers']]"));
		Thread.sleep(3000);
		btnComputer.click();
		Thread.sleep(3000);
		return new ComputerPage(driver);
	}

}