package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class NoteBooksPage extends BaseClass{

	public NoteBooksPage(RemoteWebDriver driver) {
		this.driver=driver;
	}

	public NoteBooksPage clickLaptop() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"Add to cart\"]")).click();
		return this;
	}

	public ElectronicsPage clickElectronics() {

		driver.findElement(By.xpath("//a[text()[normalize-space()=\"Electronics\"]]")).click();
		return new ElectronicsPage(driver);
	}
}
