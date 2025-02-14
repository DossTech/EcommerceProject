package org.dataproviderlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
	
	@Test(dataProvider="Data")
	public void login(String url,String username,String password) {
		
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		driver.findElement(By.linkText("Log out")).click();

	}
	
	@DataProvider(name="Data")
	public String[][] sendData() {
	
		String[][] data = new String[1][3];
		data[0][0]="https://demowebshop.tricentis.com/login";
		data[0][1]="r.ramcharan123@gmail.com";
		data[0][2]="demowebshop";
		return data;
	}

}
