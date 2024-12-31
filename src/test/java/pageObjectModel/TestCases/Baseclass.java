package pageObjectModel.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import pageObjectModel.pages.Login_Page;

public class Baseclass {

	public WebDriver driver;
	public Login_Page lp;
	
	@BeforeClass
	public void setUp()
	{
	driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	lp=new Login_Page(driver);	
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.close();
	}
	
	
	
	
	
	
	
}
