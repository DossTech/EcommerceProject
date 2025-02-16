package pages;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//page5
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class ComputerPage extends BaseClass{

	public ComputerPage(RemoteWebDriver driver) {
		this.driver=driver;
	}

	public NoteBooksPage selectNoteBooks() throws AWTException {

		WebElement btnComputer = driver.findElement(By.xpath("//a[text()[normalize-space()='Computers']]"));

		Actions a = new Actions(driver);
		a.moveToElement(btnComputer).perform();

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		WebElement noteBook = driver.findElement(By.xpath("//a[text()[normalize-space()='Notebooks']]"));
		noteBook.click();
		
		return new NoteBooksPage(driver);
	}


}
