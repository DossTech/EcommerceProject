package baseclass;

import java.io.IOException;
import java.time.Duration;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ReadExcel;

public class BaseClass {
	//baseClass/pages/testcases/utils
	public  RemoteWebDriver driver;
	public String fileName;
	
	
	@BeforeMethod
	public void beforeMethod() {
		
	 driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

	}
	
	
	@AfterMethod
	public void afterMethod() {
		//driver.close();
	}
	@DataProvider(name="data")
	public String[][] sendData() throws IOException {
	
		
		return ReadExcel.readExcel(fileName);
	}

}
